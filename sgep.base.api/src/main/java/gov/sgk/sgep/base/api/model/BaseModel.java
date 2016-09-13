package gov.sgk.sgep.base.api.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Id'si ortak olarak verilmiş BaseModel
 * @author o-mssahin
 *
 */
@MappedSuperclass
public abstract class BaseModel extends AModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	public Serializable getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


}
