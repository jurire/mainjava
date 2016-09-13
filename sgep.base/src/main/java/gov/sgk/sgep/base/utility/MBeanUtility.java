package gov.sgk.sgep.base.utility;

import java.lang.management.ManagementFactory;

import javax.management.MBeanServer;

import net.sf.ehcache.CacheManager;
import net.sf.ehcache.management.ManagementService;

/**
 * MBean olarak erişilebilecek nesnelerin kayıt işlemlerini gerçekleştirir.<br>
 * Spring jmx desteğiyle herhangi bir bean'i mbean olarak yayınlayabilir. Buradaki metotlar bu olanağın olmadığı durunmları ele alır.
 * <br>Örneğin {@link CacheManager}'ın mbean olarak yayınlanması gibi
 * @author o-mssahin
 * @since
 *
 */
public abstract class MBeanUtility {

	/**
	 * {@link CacheManager}'ı mbean olarak yayınlar.<br>
	 * CacheConfiguration ve CacheStatistic'ler mbean olarak yayınlanır
	 * @param cacheManager 
	 */
	public static void registerEhcache(net.sf.ehcache.CacheManager cacheManager) {
        MBeanServer mBeanServer = ManagementFactory.getPlatformMBeanServer();
        ManagementService.registerMBeans(cacheManager, mBeanServer, false, false, true, true);
	}
	
}
