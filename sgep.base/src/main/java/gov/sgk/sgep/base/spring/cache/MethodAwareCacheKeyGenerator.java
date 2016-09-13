package gov.sgk.sgep.base.spring.cache;

import java.lang.reflect.Method;

import org.springframework.cache.interceptor.SimpleKeyGenerator;

/**
 * {@literal @}Cachable ile işaretlenen metotlarda cache key'i parametrelerle ve metotla oluşturur.
 * 
 * @author o-mssahin
 * @since 11.11.2015
 */
public class MethodAwareCacheKeyGenerator extends SimpleKeyGenerator {

    /**
     * {@inheritDoc}
     */
    @Override
    public Object generate(Object target, Method method, Object... params) {
        Object hash = super.generate(target, method, params);
        Integer hashCode = hash.hashCode();
        hashCode = 31 * hashCode + method.hashCode();
        return hashCode;
    }
}