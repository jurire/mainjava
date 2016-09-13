
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.tr.gov.nvi.kps._2014._09._01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanbirlesikkisibilgisisorgula.Parametre;


/**
 * <p>Java class for KisiAdresBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KisiAdresBilgileri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://kps.nvi.gov.tr/2014/09/01}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="DigerAdresBilgileri" type="{http://kps.nvi.gov.tr/2014/09/01}ArrayOfKisiAdresBilgisi" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="YerlesimYeriAdresi" type="{http://kps.nvi.gov.tr/2014/09/01}KisiAdresBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KisiAdresBilgileri", propOrder = {
    "extensionData",
    "digerAdresBilgileri",
    "hataBilgisi",
    "tcKimlikNo",
    "yerlesimYeriAdresi"
})
public class KisiAdresBilgileri {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "DigerAdresBilgileri")
    protected ArrayOfKisiAdresBilgisi digerAdresBilgileri;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "TCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long tcKimlikNo;
    @XmlElement(name = "YerlesimYeriAdresi")
    protected KisiAdresBilgisi yerlesimYeriAdresi;

    /**
     * Gets the value of the extensionData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDataObject }
     *     
     */
    public ExtensionDataObject getExtensionData() {
        return extensionData;
    }

    /**
     * Sets the value of the extensionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDataObject }
     *     
     */
    public void setExtensionData(ExtensionDataObject value) {
        this.extensionData = value;
    }

    /**
     * Gets the value of the digerAdresBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKisiAdresBilgisi }
     *     
     */
    public ArrayOfKisiAdresBilgisi getDigerAdresBilgileri() {
        return digerAdresBilgileri;
    }

    /**
     * Sets the value of the digerAdresBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKisiAdresBilgisi }
     *     
     */
    public void setDigerAdresBilgileri(ArrayOfKisiAdresBilgisi value) {
        this.digerAdresBilgileri = value;
    }

    /**
     * Gets the value of the hataBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getHataBilgisi() {
        return hataBilgisi;
    }

    /**
     * Sets the value of the hataBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setHataBilgisi(Parametre value) {
        this.hataBilgisi = value;
    }

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTCKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTCKimlikNo(Long value) {
        this.tcKimlikNo = value;
    }

    /**
     * Gets the value of the yerlesimYeriAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link KisiAdresBilgisi }
     *     
     */
    public KisiAdresBilgisi getYerlesimYeriAdresi() {
        return yerlesimYeriAdresi;
    }

    /**
     * Sets the value of the yerlesimYeriAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiAdresBilgisi }
     *     
     */
    public void setYerlesimYeriAdresi(KisiAdresBilgisi value) {
        this.yerlesimYeriAdresi = value;
    }

}
