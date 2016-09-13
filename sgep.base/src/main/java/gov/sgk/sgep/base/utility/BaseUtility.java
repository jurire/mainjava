package gov.sgk.sgep.base.utility;


import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.MethodUtils;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.util.ReflectionUtils;

import gov.sgk.sgep.utility.Utility;

/**
 * 
 * @author o-mssahin
 * @since 21 Eki 2015
 *
 */
public abstract class BaseUtility extends Utility {

	
	private final static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(BaseUtility.class);

	/**
	 * 
	 * @param clazz
	 * @param propName
	 * @return
	 * @throws NoSuchFieldError if field can not be found
	 */
	public static Class<?> getClassOfProperty (Class<?> clazz, String propName) {
		if (StringUtils.indexOf(propName, ".") > 0) {
			String [] arr = StringUtils.split(propName, ".");
			String mainPropName = arr [0];
			Field field = ReflectionUtils.findField(clazz, mainPropName);
			return getClassOfProperty(field.getType(), StringUtils.substringAfter(propName, "."));
		} else {
			Field field = ReflectionUtils.findField(clazz, propName);
			if (field == null) {
				throw new NoSuchFieldError();
			}
			return field.getType();
		}
	}
	
	public static boolean isPropertyString (Class<?> clazz, String propName) {
		Class<?> propClass = getClassOfProperty(clazz, propName);
		return String.class.equals(propClass);
	}
	
	public static boolean isPropertyNumeric (Class<?> clazz, String propName) {
		Class<?> propClass = getClassOfProperty(clazz, propName);
		return ClassUtils.isAssignable(propClass, Number.class);
	}
	
	/**
	 * clazz must have at one constructor that takes a String parameter 
	 * 
	 * @param clazz
	 * @param value
	 * @return
	 * @throws RuntimeException while creating {@link Number} object form clazz and value
	 */
	@SuppressWarnings("unchecked")
	public static <T extends Number> T createNumber (Class<T> clazz, String value) {
		Class<T> realClass = clazz;
		try {
			if (ClassUtils.isPrimitiveOrWrapper(clazz)) {
				realClass = (Class<T>) ClassUtils.primitiveToWrapper(clazz);
			}
			return realClass.getConstructor(String.class).newInstance(value);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	/**
	 * Sistem giren kullanıcıyı çeker
	 * @return
	 */
	public static Authentication getAuthentication () {
		SecurityContext ctx = SecurityContextHolder.getContext(); 
		if (ctx.getAuthentication() != null && ctx.getAuthentication().getName() != null) {
			return SecurityContextHolder.getContext().getAuthentication();
		}
		return null;
	}
	
	public static <A extends Annotation> boolean isAnnotationPresent (JoinPoint joinPoint, Class<A> annotationType) {
		boolean result = false;
		Object o = joinPoint.getTarget();
		Class<?> targetClass = o.getClass();
		if (AnnotationUtils.isAnnotationInherited(annotationType, targetClass)) {
			LOGGER.debug("Object {}. Object: {}", annotationType.getSimpleName(), o);
			result = true;
		} else {
			Method method = findTargetMethod (joinPoint);
			if (AnnotationUtils.findAnnotation(method, annotationType) != null) {
				LOGGER.debug("Method {}. Method: {}", annotationType.getSimpleName(), method);
				result = true;
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param joinPoint
	 * @return Bean'ler proxy olarak bağlamda yer aldığı durumda target üzerindeki metodu döner
	 */
	public static Method findTargetMethod(JoinPoint joinPoint) {
		Object o = joinPoint.getTarget();
		Class<?> targetClass = o.getClass();
		
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		String methodName = joinPoint.getSignature().getName();
		Class<?> [] parameterTypes = signature.getMethod().getParameterTypes(); 
		Method method = MethodUtils.getAccessibleMethod(targetClass, methodName, parameterTypes);		
		return method;
	}

	
}
