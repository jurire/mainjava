package gov.sgk.sgep.base.api.model.auth;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import gov.sgk.sgep.base.api.utility.BooleanToStringConverter;
import gov.sgk.sgep.utility.SgepConstants;

/**
 * 
 * @author o-mssahin
 * @since 12 Eki 2015
 *
 */
@Entity
@Table (schema=SgepConstants.SCHEMA_BASE, name="YTK_MENU")
public class Menu extends ASecModel implements Comparable<Menu> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * null olursa ana menü demektir
	 */
	@ManyToOne
	@JoinColumn(name="PARENT_ID", nullable=true, updatable=false)
	private Menu parent;
	
	@OneToMany (fetch=FetchType.EAGER, cascade=CascadeType.REMOVE)
	@JoinColumn(name="PARENT_ID", nullable=true, updatable=false, insertable=false)
	private Set<Menu> children = new LinkedHashSet<>();
	
	/**
	 * 
	 */
	private Integer sira;
	
	/**
	 * menüye basınca çağrılacak command<br>
	 * örneğin <b>abcBean.metot</b> gibi
	 */
	@Column (nullable=true, length=200)
	private String command;
	
	@Column (nullable=true, length=1000)
	private String url;
	
	@Convert (converter=BooleanToStringConverter.class)
	private Boolean ajax;
	
	@Column (nullable=true, length=1000)
	private String icon;
	
	/**
	 * işlem bitince güncellenecek component id
	 */
	@Column (nullable=true, length=100)
	private String updateId;
	
	@Override
	public final String secModelName() {
		return "Menu";
	}

	public Menu getParent() {
		return parent;
	}

	public void setParent(Menu parent) {
		this.parent = parent;
	}

	public Integer getSira() {
		return sira;
	}

	public void setSira(Integer sira) {
		this.sira = sira;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public int compareTo(Menu o) {
		Comparable  orderThis = (Comparable ) (this.sira == null ? this.getId() : this.sira);
		Comparable orderParameter = (Comparable ) (o.sira == null ? o.getId() : o.sira);
		return orderThis.compareTo(orderParameter);
	}

	public Boolean isAjax() {
		return ajax == null ? false : ajax;
	}

	public void setAjax(Boolean ajax) {
		this.ajax = ajax;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getUpdateId() {
		return updateId;
	}

	public void setUpdateId(String updateId) {
		this.updateId = updateId;
	}
	
	public boolean hasChildren () {
		return CollectionUtils.isNotEmpty(children);
	}

	@Transient
	public boolean isLeaf () {
		return !hasChildren();
	}
	
	@Transient
	public boolean isRoot () {
		return parent == null;
	}

	public Set<Menu> getChildren() {
		return children;
	}

	public void setChildren(Set<Menu> children) {
		this.children = children;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String description() {
		return String.format("id: %s, parent: %s, children: %s", getId(), parent != null ? parent.getId() : "yok", hasChildren() ? children.size() : "0");
	}
	
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * 
	 * @return null eğer parent null ise
	 */
	@Transient
	public String getParentId () {
		return parent == null ? null : parent.getId();
	}
	
	/**
	 * 
	 * @return true if Menu is not persistable
	 */
	public boolean isVirtual () {
		return StringUtils.equalsIgnoreCase(SgepConstants.MENU_ROOT_ID, this.getId());
	}

	/**
	 * menü yetkisi yapraklardan verilmiş olabilir. Bunun için yapraklardan root'ları ve yapraklardan root'a giden yolun 
	 * kişinin yetkili menülerine eklenmesi gerekir.<br> 
	 * Bu sınıf root kümesini ve yeni eklenen yollarla beraber yeni menü yetki node'larını tutar
	 * @author o-mssahin 
	 *
	 */
	public static class RootAndNewTree implements Serializable {
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		private Set<Menu> newTree;
		private Set<Menu> menuRoot;
		public Set<Menu> getNewTree() {
			return newTree;
		}
		public void setNewTree(Set<Menu> newTree) {
			this.newTree = newTree;
		}
		
		/**
		 * Root listesini döner. Tree olarak gelen veri yapılarına bu kök dizisinin verilmesi gerekir.
		 * 
		 * @return
		 */
		public Set<Menu> getMenuRoot() {
			return menuRoot;
		}
		public void setMenuRoot(Set<Menu> menuRoot) {
			this.menuRoot = menuRoot;
		}
	}
	
	public static final Menu ROOT;
	
	static {
		ROOT = new Menu();
		ROOT.setId(SgepConstants.MENU_ROOT_ID);
	}

}
