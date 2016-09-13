package gov.sgk.sgep.base.web.backing.parameter;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.FlowEvent;
import org.primefaces.event.RowEditEvent;
import org.primefaces.event.SelectEvent;

import gov.sgk.sgep.base.api.business.IBaseService;
import gov.sgk.sgep.base.api.model.ACommon;
import gov.sgk.sgep.base.api.model.prm.ParameterModel;
import gov.sgk.sgep.base.api.model.prm.ParameterType;
import gov.sgk.sgep.base.api.utility.exception.BaseError;
import gov.sgk.sgep.base.ui.columns.ColumnModel;
import gov.sgk.sgep.base.ui.columns.ReflectionColumnModelBuilder;
import gov.sgk.sgep.base.web.backing.ABaseManagedBean;
import gov.sgk.sgep.utility.Assert;
import gov.sgk.sgep.utility.Utility;

/**
 * 
 * @author o-mssahin
 *
 */
@ManagedBean(name = "parameterMB")
@ViewScoped
public class ParameterManagedBean extends ABaseManagedBean {

	private static final long serialVersionUID = 1L;

	/**
	 * Parametre seçildiği zaman her parametrenin kolonları aynı olmayacaktır.<br> 
	 * Bu kolonların tanımını tutan alan
	 */
	private List<ColumnModel> columns = new ArrayList<ColumnModel>(0);

	/**
	 * Parametre ayrıntısına giderken master detail için gerekli olan level'ı
	 * tutuyor
	 */
	private int currentLevel = 1;

	private List<ParameterType> paramList;
	private String detailsTitle;
	
	/**
	 * Listeden seçilen parametreyi tutar
	 */
	private ParameterType selectedParameter;
	private List<ParameterType> seciliTurler;
	
	/**
	 * Seçilen parametrenin verisini tutar
	 */
	private List<ACommon> data;
	

	@PostConstruct
	public void init() {
		setDetailsTitle("");
		setParamList(this.getParameterService().listParameterType(null, null));
	}

	public List<ACommon> getData(){
		return data;
    }
	
	public void onChangeClass(){
       	//arrangeColumns();
    }
	
	private void arrangeColumns () {
		Class<? extends ACommon> clazz = selectedParameter.getClazz();
		columns = new ReflectionColumnModelBuilder(clazz).setExcludedProperties("id", "gecerlillikTarihiBaslangic", "gecerlillikTarihiBitis").build();
	}
	
	@SuppressWarnings("unchecked")
	private void arrangeData () {
		Assert.notNull(selectedParameter, "SelectedParameter null olamaz");
		Class<? extends ACommon> clazz = selectedParameter.getClazz();
        try {
        	data = (List<ACommon>) getParameterService().getAll(clazz);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
		
	}
	
	public void onRowSelect(SelectEvent event) {

		System.out.println(getSelectedParameter());

		/*
		 * addInfoMessage(((ParameterType) event.getObject()).getAd());
		 * FacesMessage msg = new FacesMessage("Satır Seçildi", ((ParameterType)
		 * event.getObject()).getAd());
		 * FacesContext.getCurrentInstance().addMessage(null, msg);
		 * ParameterType cObject = ((ParameterType) event.getObject());
		 * System.out.println(cObject.getId() + " was clicked");
		 * 
		 * ExternalContext ec =
		 * FacesContext.getCurrentInstance().getExternalContext(); if
		 * (cObject.getTable().equals("İl")) { try {
		 * ec.redirect(ec.getRequestContextPath() +
		 * "/pages/secure/parametreEkranlari/il.xhtml"); } catch (IOException e)
		 * { e.printStackTrace(); } return; } if
		 * (cObject.getTable().equals("İlçe")) { try {
		 * ec.redirect(ec.getRequestContextPath() +
		 * "/pages/secure/parametreEkranlari/ilce.xhtml"); } catch (IOException
		 * e) { e.printStackTrace(); } return; } try {
		 * ec.redirect(ec.getRequestContextPath() + "/notFound.xhtml"); } catch
		 * (IOException e) { e.printStackTrace(); }
		 */

	}

	// public void onRowUnselect(UnselectEvent event) {
	// FacesMessage msg = new FacesMessage("Unselected", ((ParameterType)
	// event.getObject()).getId());
	// FacesContext.getCurrentInstance().addMessage(null, msg);
	// }

	@Override
	protected IBaseService getServiceForLoading() {
		return getParameterService();
	}

	public List<ParameterType> getParamList() {
		return paramList;
	}

	public void setParamList(List<ParameterType> paramList) {
		this.paramList = paramList;
	}

	public List<ParameterType> getSeciliTurler() {
		return seciliTurler;
	}

	public void setSeciliTurler(List<ParameterType> seciliTurler) {
		this.seciliTurler = seciliTurler;
	}

	public int getCurrentLevel() {
		return currentLevel;
	}

	public void setCurrentLevel(int currentLevel) {
		this.currentLevel = currentLevel;
	}

	public List<ColumnModel> getColumns() {
		return columns;
	}

	public void setColumns(List<ColumnModel> columns) {
		this.columns = columns;
	}
	
	public String onFlowProcess(FlowEvent event) {
		String step = event.getNewStep();
		arrangeData();
		if ("parametreListesi".equals(step)) {
			setDetailsTitle("");
		} else if ("details".equals(step)) {
			setDetailsTitle(selectedParameter.getTable());
		}
		arrangeColumns();
		return event.getNewStep();
	}

	public ParameterType getSelectedParameter() {
		return selectedParameter;
	}

	public void setSelectedParameter(ParameterType selectedParameter) {
		this.selectedParameter = selectedParameter;
	}

	public String getDetailsTitle() {
		return detailsTitle;
	}

	public void setDetailsTitle(String detailsTitle) {
		this.detailsTitle = detailsTitle;
	}
	
	public void onRowEdit(RowEditEvent event) {
		ParameterModel model = (ParameterModel) event.getObject();
		if (model.getEklemeZamani() == null) {
			model.setEklemeZamani(Utility.todayAsTimestamp());
			getParameterService().addModel(model);
	        addInfoMessage("Satır eklendi: " + model.getClass().getSimpleName() + ": Id: " + model.getId());
		} else {
	        getParameterService().updateParameter(model);
	        addInfoMessage("Satır güncellendi: " + model.getClass().getSimpleName() + ": Id: " + model.getId());
		}
    }
     
    public void onRowCancel(RowEditEvent event) {
        addInfoMessage("Edit Cancelled " + ((ACommon) event.getObject()).getId());
    }

	public void setData(List<ACommon> data) {
		this.data = data;
	}
	
	@SuppressWarnings("unchecked")
	public void actionYeniParametre () {
		Class<ACommon> clazz = (Class<ACommon>) selectedParameter.getClazz();
		try {
			data.add(0, clazz.newInstance());
		} catch (Exception e) {
			throw new BaseError(e);
		}
	}


}