package gov.sgk.sgep.base.api.business.engine;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.Validate;

import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 *
 */
public class RuleContextImpl<T> implements RuleContext<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Map<String, Serializable> map = new HashMap<>();
	private String id;
	
	/**
	 * Kuralın geçerli olduğu tarih sınırı
	 */
	private Date date;
	
	/**
	 * rule id "unknown" olur
	 */
	public RuleContextImpl() {
		this(SgepConstants.UNKNOWN);
	}
	
	public RuleContextImpl(String id) {
		this(id, null);
	}

	public RuleContextImpl(String id, Map<String, Serializable> map) {
		Validate.notEmpty(id, "id boş olamaz");
		this.id = id;
		if (map == null) {
			map = new HashMap<>();
		}
		this.map = map;
	}

	@Override
	public String ruleId() {
		return id;
	}

	@Override
	public Map<? extends Serializable, ? extends Serializable> objectMap() {
		return getMap();
	}

	public Map<String, Serializable> getMap() {
		return map;
	}

	public void setMap(Map<String, Serializable> map) {
		this.map = map;
	}
	
	/**
	 * 
	 * @param key
	 * @param value
	 * @return this, aynı kod üzerinden tekrar eklemek için
	 */
	public RuleContextImpl<T> addToMap (String key, Serializable value) {
		map.put(key, value);
		return this;
	}

	@Override
	public String toString() {
		return String.format("%s[ruleId: %s, context size: %d]", this.getClass().getSimpleName(), ruleId(), map.size());
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public Date ruleDate() {
		return getDate();
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}


}
