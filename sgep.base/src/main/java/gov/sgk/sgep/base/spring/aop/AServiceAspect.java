package gov.sgk.sgep.base.spring.aop;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.access.AuthorizationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.util.StopWatch;

import gov.sgk.sgep.base.api.DisableSecurity;
import gov.sgk.sgep.base.api.NotLoggable;
import gov.sgk.sgep.base.api.business.ILogService;
import gov.sgk.sgep.base.api.business.ISecurityDeterminer;
import gov.sgk.sgep.base.api.domain.DomainUser;
import gov.sgk.sgep.base.api.model.auth.Function;
import gov.sgk.sgep.base.api.model.log.LogMethod;
import gov.sgk.sgep.base.spring.AConfiguration;
import gov.sgk.sgep.base.spring.security.SgepAuthenticationToken;
import gov.sgk.sgep.base.system.SystemPropertiesWrapper;
import gov.sgk.sgep.base.utility.BaseUtility;
import gov.sgk.sgep.utility.Assert;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * Aspect kullanmak için ilk önce <pre>{@literal @}Configuration</pre> sınıfını 
 * <pre><b>{@literal @}EnableAspectJAutoProxy</b></pre> ile işaretlemek gerekir.
 * <br/><br/>
 * Aspect için bu sınıfı extend edebilirsiniz.<br>
 * 
 * Çocuk sınıfı
 * <pre>
 * {@literal @}Component
 * {@literal @}Aspect
 * </pre>
 * ile işaretlemelisiniz.
 * <br/>
 * <br/>
 * Pointcut olara final bir string'i belirlemelesiniz. Örneğin;
 * <pre>execution(* gov.sgk.sgep.tescil.business.impl..*.*(..))</pre>
 * Bunu sınıf değişkeni olarak tanımlayıp kullanabilirsiniz.
 * 
 * do ile başlayan metotlara pointcut'ları girebilirsiniz ya da kendi belirlediğiniz metotlara da girip bu do ile başlayan metotları çağırabilirsiniz.
 * 
 * 
 * <pre>
 * {@literal @}Around(POINTCUT)
 * public Object doProceed(ProceedingJoinPoint joinPoint) throws Throwable {
 * </pre>
 * 
 * Önreğin;
 * 
 * <pre>
{@literal @}Component
{@literal @}Aspect
public class TescilBusinessServiceAspect extends AServiceAspect {

	final String POINTCUT = "execution(* gov.sgk.sgep.tescil.business.impl..*.*(..))";

	{@literal @}Around(POINTCUT)
	{@literal @}Override
	public Object doProceed(ProceedingJoinPoint joinPoint) throws Throwable {
		return super.doProceed(joinPoint);
	}

	{@literal @}AfterReturning(pointcut = POINTCUT, returning = "retVal")
	{@literal @}Override
	public void doLogAfterMethod(JoinPoint joinPoint, Object retVal) {
		super.doLogAfterMethod(joinPoint, retVal);
	}

	{@literal @}AfterThrowing(pointcut = POINTCUT, throwing = "ex")
	{@literal @}Override
	public void doLogAfterThrow(JoinPoint joinPoint, Exception ex) {
		super.doLogAfterThrow(joinPoint, ex);
	}
} 
 * </pre>
 * 
 * @author o-mssahin
 * @since 12 Eki 2015
 *
 */
@Aspect
public abstract class AServiceAspect implements InitializingBean {

	/**
	 * test OLDUĞU durumunda true yapılır
	 */
	public static boolean DISABLE_SECURITY_FOR_TEST = false;
	
	protected final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(this.getClass());
	
	//final String POINTCUT = "execution(* gov.sgk.sgep.tescil.business.impl..*.*(..))";
	
	@Autowired(required=false) @Qualifier (SgepConstants.BEAN_NAME_LOG_SERVICE_ASYNC)
	private ILogService logService;
	
	@Autowired(required=false)
	private ISecurityDeterminer securityDeterminer;
	
	@Autowired
	private SystemPropertiesWrapper systemPropertiesWrapper;

	/**
	 * Metodu çalıştırır ve LOGGER ile loglar. Zamansal loglamayı yapar.<br>
	 * Sisteme giren kullanıcının metot çağırma yetkisini kontrol eder<br>Eğer bu kontrol işlemini disable etmek istiyorsanız
	 * 
	 * {@link AConfiguration#willBeControlledAgainstSecurity} metodunu override edip false dönebilirsiniz.
	 * 
	 * <pre>
	 * final String POINTCUT = "execution(* gov.sgk.sgep.tescil.business.impl..*.*(..))"
	 * {@literal @}Around(POINTCUT)
	 * </pre>
	 * Tanımı bu metoda yapabilirsiniz
	 * @param joinPoint
	 * @param ex
	 */	
	public Object doProceed(ProceedingJoinPoint joinPoint) throws Throwable {
		
		if (!DISABLE_SECURITY_FOR_TEST && willBeControlledAgainstSecurity(joinPoint)) {
			controlAccess (getDomainUser(), joinPointToFunction(joinPoint));
		}
		
		LOGGER.debug("Authentication: " + BaseUtility.getAuthentication());
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		Object retVal = joinPoint.proceed(); //
		stopWatch.stop();
		
		StringBuffer logMessage = new StringBuffer();
		logMessage.append(joinPoint.getTarget().getClass().getName());
		logMessage.append(".");
		logMessage.append(joinPoint.getSignature().getName());
		logMessage.append("(");
		logMessage.append(getArgs(joinPoint));
		logMessage.append(")");
		logMessage.append(" execution time: ");
		logMessage.append(stopWatch.getTotalTimeMillis());
		logMessage.append(" ms");
		LOGGER.info(logMessage.toString());
		return retVal;
	}
	
	/**
	 * 
	 * @param domainUser
	 * @param joinPoint
	 * @throws AuthorizationServiceException eğer domain user yetkili değilse yetkili değilse
	 */
	public void controlAccess(DomainUser domainUser, Function function) throws AuthorizationServiceException {
		Assert.notNull(domainUser, "domainUser null olamaz");
		Assert.notNull(domainUser, "function null olamaz");
		if (!securityDeterminer.authorized(domainUser.getRoles(), function)) {
			throw new AuthorizationServiceException(String.format("Yetki yok :: username: %s, function: %s", domainUser.getLoginName(), function.getId()));
		}		
	}
	/**
	 * Metot aykırı durumsuz sonlandıysa
	 * <pre>
	 * {@literal @}AfterReturning(pointcut = POINTCUT, returning = "retVal")
	 * </pre>
	 * Tanımı bu metoda yapabilirsiniz
	 * @param joinPoint
	 * @param ex
	 */
	public void doLogAfterMethod(JoinPoint joinPoint, Object retVal) {
		if (willBeLogged (joinPoint)) {
			return;
		}
		getLogService().createLog(createLog(joinPoint, retVal, null));
	}
	
	/**
	 * Sınıfı ve metodu kontrol eder, {@link NotLoggable}'a karşı
	 * @param joinPoint
	 * @return
	 */
	public boolean willBeLogged(JoinPoint joinPoint) {
		return BaseUtility.isAnnotationPresent(joinPoint, NotLoggable.class);
	}
	
	/**
	 * {@link DisableSecurity} belirtecine bakılır ve sistem özelliği olarak code.security.disabled özelliğine bakılır
	 * @param joinPoint
	 * @return
	 */
	public boolean willBeControlledAgainstSecurity(JoinPoint joinPoint) {
		return !BaseUtility.isAnnotationPresent(joinPoint, DisableSecurity.class)
				&& !systemPropertiesWrapper.isCodeSecurityDisabled();
	}
	
	/**
	 * <pre>
	 * {@literal @}AfterThrowing(pointcut = POINTCUT, throwing = "ex")
	 * </pre>
	 * Tanımı bu metoda yapabilirsiniz
	 * @param joinPoint
	 * @param ex
	 */
	public void doLogAfterThrow(JoinPoint joinPoint, Exception ex) {
		LogMethod log = createLog(joinPoint, null, ex);
		getLogService().createLog(log);
	}
	
	public LogMethod createLog (JoinPoint joinPoint, Object retVal, Exception ex) {
		LogMethod log = new LogMethod();
		String bean = joinPoint.getTarget().getClass().getName();
		String method = joinPoint.getSignature().getName(); 
		Authentication au = BaseUtility.getAuthentication();
		log.setBean(bean);
		log.setMethod(method);
		log.setUserId(au != null ? au.getName() : "unknown");
		log.setParameters(getArgs(joinPoint));
		log.setSuccess(ex == null);
		if (ex != null) {
			log.setError(ExceptionUtils.getStackTrace(ex));
		}
		return log;
	}
	
	public ILogService getLogService() {
		return logService;
	}

	public void setLogService(ILogService logService) {
		this.logService = logService;
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		LOGGER.info(this.getClass().getSimpleName() + " initialized.");
	}

	/**
	 * Log için parametreleri string haline çevirir
	 * @param joinPoint
	 * @return
	 */
	public String getArgs (JoinPoint joinPoint) {
		StringBuffer logMessage = new StringBuffer();
		Object[] args = joinPoint.getArgs();
		for (int i = 0; i < args.length; i++) {
			logMessage.append(args[i]).append(",");
		}
		if (args.length > 0) {
			logMessage.deleteCharAt(logMessage.length() - 1);
		}
		return logMessage.toString();
	}
	
	public static DomainUser getDomainUser() {
		Authentication authentication = BaseUtility.getAuthentication();
		if (authentication instanceof SgepAuthenticationToken) {
			SgepAuthenticationToken token = (SgepAuthenticationToken) authentication;
			return token.getDefaultUserDetails().getDomainUser();
		}
		return null;
	}
	
	public static Function joinPointToFunction (ProceedingJoinPoint joinPoint) {
		Assert.notNull(joinPoint, "joinPoint null olamaz");
		String method = joinPoint.getSignature().getName(); 
		Function result = new Function();
		result.setId(method);
		return result;
	}
}