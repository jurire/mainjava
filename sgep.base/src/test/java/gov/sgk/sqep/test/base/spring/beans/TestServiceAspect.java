package gov.sgk.sqep.test.base.spring.beans;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import gov.sgk.sgep.base.spring.aop.AServiceAspect;

@Component(value = "ServiceAspect")
@Aspect
public class TestServiceAspect extends AServiceAspect {

	final String POINTCUT = "execution(* gov.sgk.sqep.test.base.spring.beans..*.*(..))";

	@Around(POINTCUT)
	@Override
	public Object doProceed(ProceedingJoinPoint joinPoint) throws Throwable {
		return super.doProceed(joinPoint);
	}

	@AfterReturning(pointcut = POINTCUT, returning = "retVal")
	@Override
	public void doLogAfterMethod(JoinPoint joinPoint, Object retVal) {
		super.doLogAfterMethod(joinPoint, retVal);
	}

}
