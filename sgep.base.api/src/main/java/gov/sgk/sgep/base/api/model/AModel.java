package gov.sgk.sgep.base.api.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * 
 * @author o-mssahin
 *
 */
@MappedSuperclass
public abstract class AModel extends ACommon {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column
	private Integer islemId;

	public Integer getIslemId() {
		return islemId;
	}

	public void setIslemId(Integer islemId) {
		this.islemId = islemId;
	}
	

}
