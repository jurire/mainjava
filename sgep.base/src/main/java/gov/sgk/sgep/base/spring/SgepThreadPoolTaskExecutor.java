package gov.sgk.sgep.base.spring;

import java.util.concurrent.Callable;
import java.util.concurrent.Future;

import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * İşlemler asenkron çalıştırıldığı zaman Spring SecurityContext değişkenleri threadlocal'de tutulduğu için bu tutulan değerler asenkron thread'lere okunammıyor.<br>
 * Bunu yenmek için {@link ThreadPoolTaskExecutor}'ın bazı metotlar override edilmiştir. 
 * 
 * @author o-mssahin
 *
 */
public class SgepThreadPoolTaskExecutor extends ThreadPoolTaskExecutor {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Override
	public void execute(final Runnable r) {
	    final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	    super.execute(new Runnable() {
	        public void run() {
	            try {
	            	adjustThreadLocaLProcesses(authentication);
	                r.run();
	            } finally {
	                SecurityContextHolder.clearContext();
	            }
	        }
	    });
	}
	
	public <T> Future<T> submit(final Callable<T> task) {
	    final Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
	    logger.debug("Threadpool submit task submit çalıştırılıyor");
		return super.submit(new Callable<T>() {

			@Override
			public T call() throws Exception {
				try {
					adjustThreadLocaLProcesses(authentication);
					return task.call();
				} finally {
					SecurityContextHolder.clearContext();
				}
			}
		});
	}
	
	
	/**
	 * SpringSecurity Context ayarları yapılır<br>
	 * bunun dışında başka işlemler varsa buraya yazabilirsiniz.
	 * @param authentication
	 */
	protected void adjustThreadLocaLProcesses (Authentication authentication) {
		SecurityContext ctx = SecurityContextHolder.createEmptyContext();
		ctx.setAuthentication(authentication);
		SecurityContextHolder.setContext(ctx);
	}

}
