package gov.sgk.sgep.base.api.domain;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Sisteme giren kullanıcı
 * 
 * @author o-mssahin
 * @since 7 Eki 2015
 *
 */
public class DomainUser implements Serializable {
	public static final String USER_NAME_ADMIN = "admin";
	
	public static final String USER_NAME_TEST = "test";
	public static final String USER_NAME_DUMMY = "dummy";
	
	
	public static final DomainUser DUMMY;
	
	static {
		DUMMY = new DomainUser();
		DUMMY.setLoginName(USER_NAME_DUMMY);
		DUMMY.setPassword("PASSWORD");
		DUMMY.setUniteKod("5");
		DUMMY.setRoles(Arrays.asList(IRole.DUMMY, IRole.TEST));
	}
	

	private static final long serialVersionUID = 1L;
	private String adi;
	private String soyadi;
	private String dogumTarihi;
	private String tcKimlikNo;
	private String uniteKod;
	private String loginName;
	private String password;
	
	/**
	 * Kullanıcının id'si olarak kullanılır
	 */
	private Serializable id;
	private List<? extends IRole> roles;
	

	public DomainUser (){
		super();
	}
	
	public DomainUser (String loginName, String password){
		super();
		this.loginName = loginName;
		this.password = password;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public String getDogumTarihi() {
		return dogumTarihi;
	}

	public void setDogumTarihi(String dogumTarihi) {
		this.dogumTarihi = dogumTarihi;
	}

	public String getTcKimlikNo() {
		return tcKimlikNo;
	}

	public void setTcKimlikNo(String tcKimlikNo) {
		this.tcKimlikNo = tcKimlikNo;
	}

	public String getUniteKod() {
		return uniteKod;
	}

	public void setUniteKod(String uniteKod) {
		this.uniteKod = uniteKod;
	}

	public String getLoginName() {
		return loginName;
	}
	
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<? extends IRole> getRoles() {
		return roles;
	}
	
	public void setRoles(List<? extends IRole> roles) {
		this.roles = roles;
	}

	@Override
	public String toString (){
		return ToStringBuilder.reflectionToString(this, ToStringStyle.NO_CLASS_NAME_STYLE);
		//return loginName;
	}

	/**
	 * @return the id
	 */
	public Serializable getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Serializable id) {
		this.id = id;
	}
	
}
