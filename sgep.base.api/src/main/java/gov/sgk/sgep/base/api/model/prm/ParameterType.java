package gov.sgk.sgep.base.api.model.prm;

import java.io.Serializable;

import gov.sgk.sgep.base.api.model.ACommon;
import gov.sgk.sgep.base.api.model.AModel;
import gov.sgk.sgep.utility.Assert;

public class ParameterType extends AModel {
	
	/**
	 * 
	 */
	
	private static final long serialVersionUID = 1L;
	private String id;
	private String ad;
	private String table;
	private Class<? extends ACommon> clazz;

	public ParameterType(String id, String ad, Class<? extends ACommon> clazz) {
		this.setId(id);
		this.setAd(ad);
		this.setTable(ad);
		this.setClazz(clazz);
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		Assert.notEmpty(ad, "ad boş olamaz");
		this.ad = ad;
	}

	public void setId(String id) {
		Assert.notEmpty(id, "id boş olamaz");
		this.id = id;
	}

	@Override
	public Serializable getId() {
		return id;
	}

	public String getTable() {
		return table;
	}

	public void setTable(String table) {
		Assert.notEmpty(table, "table boş olamaz");
		this.table = table;
	}

	public Class<? extends ACommon> getClazz() {
		return clazz;
	}

	public void setClazz(Class<? extends ACommon> clazz) {
		Assert.notNull(clazz, "clazz null olamaz");
		this.clazz = clazz;
	}

}
