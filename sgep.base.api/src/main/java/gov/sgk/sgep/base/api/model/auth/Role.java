package gov.sgk.sgep.base.api.model.auth;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.Predicate;
import org.apache.commons.lang3.StringUtils;

import gov.sgk.sgep.base.api.domain.IRole;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 * @since 12 Eki 2015
 *
 */
@Entity
@Table (schema=SgepConstants.SCHEMA_BASE, name="YTK_ROL",
	uniqueConstraints={@UniqueConstraint(columnNames={"modulAdi", "isim"})})
public class Role extends ASecModel implements IRole, Comparable<Role> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Ekransal yetki
	 */
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(	schema=SgepConstants.SCHEMA_BASE,
		name = "YTK_ROL_MENU", 
		joinColumns = { 
			@JoinColumn(name = "ROL_ID", nullable = false, updatable = false) 
		}, 
		inverseJoinColumns = { 
			@JoinColumn(name = "MENU_ID", nullable = false, updatable = false) 
		})
	private Set<Menu> menus;
	
	/**
	 * Metot çağrı yetkisi
	 */
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(schema=SgepConstants.SCHEMA_BASE,
		name = "YTK_ROL_FONKSIYON",
		joinColumns = {
			@JoinColumn(name = "ROL_ID", nullable = false, updatable = false) 
		}, 
		inverseJoinColumns = { 
			@JoinColumn(name = "FONKSIYON_ID",  nullable = false,  updatable = false) 
		})
	private Set<Function> functions;

	public Set<Menu> getMenus() {
		return menus;
	}

	public void setMenus(Set<Menu> menus) {
		this.menus = menus;
	}

	public Set<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(Set<Function> functions) {
		this.functions = functions;
	}


	public static IRole createRole (final String role) {
		return new IRole() {
			private static final long serialVersionUID = 1L;
			@Override
			public String getId() {
				return role;
			}
			@Override
			public String toString() {
				return getId();
			}
			@Override
			public boolean hasFunction(String functionId) {
				return true;
			}
			@Override
			public Function getFunction(String functionId) {
				Function function = new Function();
				function.setId(functionId);
				function.setAktifMi(false);
				return function;
			}
		};
	}

	@Override
	public boolean hasFunction(final String functionId) {
		if (CollectionUtils.isNotEmpty(functions)) {
			return CollectionUtils.find(functions, new Predicate<Function>() {
				@Override
				public boolean evaluate(Function object) {
					return StringUtils.equalsIgnoreCase(functionId, object.getId());
				}
			}) != null;
		}
		return false;
	}

	/**
	 * @return eğer bulunamazsa {@link Function#DUMMY} döner
	 */
	@Override
	@Transient
	public Function getFunction(final String functionId) {
		Function result = Function.DUMMY;
		if (CollectionUtils.isNotEmpty(functions)) {
			result = CollectionUtils.find(functions, new Predicate<Function>() {
				@Override
				public boolean evaluate(Function object) {
					return StringUtils.equalsIgnoreCase(functionId, object.getId());
				}
			});
		}
		return result;
	}

	@Override
	public final String secModelName() {
		return "Rol";
	}

	@Override
	public int compareTo(Role o) {
		return this.getId().compareTo(o.getId());
	}

}
