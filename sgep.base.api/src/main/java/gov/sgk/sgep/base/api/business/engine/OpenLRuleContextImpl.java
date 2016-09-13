package gov.sgk.sgep.base.api.business.engine;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.Validate;

import gov.sgk.sgep.utility.Assert;

/**
 * http://openl-tablets.org/files/openl-tablets/5.14.0/OpenL%20Tablets%20-%20Reference%20Guide/index.html<br>
 * Bu sınıf RuleContextImpl'den farklı olarak argümanlara ve parametrelere gereksinim duyar. Çünkü rule'u çalıştırmak için metoda reflection'la erişmek gerekmektedir.
 * OpenLTest sınıfında örnek kullanım görebilirsiniz.<br>
 * 
 * T generic tipi çağrılacak openL rule'un sonucunun tipini gösterir.
 * 
 * @author o-mssahin
 *
 */
public class OpenLRuleContextImpl<T> extends RuleContextImpl<T> implements OpenLRuleContext<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String methodName;
	List<Class<?>> parameterTypes = new ArrayList<>();
	List<Object> arguments = new ArrayList<>();
	
	public OpenLRuleContextImpl(String methodName, String id, Map<String, Serializable> map) {
		super(id, map);
		this.setMethodName(methodName);
	}

	public OpenLRuleContextImpl(String methodName, String id) {
		this(methodName, id, null);
		
	}

	public OpenLRuleContextImpl<T> addParamType (Class<?> ... classes) {
		Validate.notNull(classes, "classes null olamaz");
		parameterTypes.addAll(Arrays.asList(classes));
		return this;
	}
	
	public OpenLRuleContextImpl<T> addArgs (Object ... args) {
		Validate.notNull(args, "args null olamaz");
		arguments.addAll(Arrays.asList(args));
		return this;
	}
	
	@Override
	public String getMethodName() {
		return methodName;
	}

	@Override
	public Class<?>[] getParameterTypes() {
		return parameterTypes.toArray(new Class<?>[]{});
	}

	@Override
	public Object[] getArgs() {
		return arguments.toArray(new Object[]{});
	}

	public void setMethodName(String methodName) {
		Assert.notEmpty(methodName, "methodName boş olamaz");
		this.methodName = methodName;
	}
	
	/**
	 * parameterTypes ve arguments listeleri temizlenir
	 * @return
	 */
	public OpenLRuleContextImpl<T> clear () {
		this.parameterTypes.clear();
		this.arguments.clear();
		return this;
	}

}
