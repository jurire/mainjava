
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanbirlesikkisibilgisisorgula.CuzdanBilgisi;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanbirlesikkisibilgisisorgula.KisiBilgisi;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanbirlesikkisibilgisisorgula.Parametre;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.tr.gov.nvi.kps._2014._09._01.KisiAdresBilgileri;


/**
 * <p>Java class for BirlesikKisiBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BirlesikKisiBilgileri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="AdresBilgileri" type="{http://kps.nvi.gov.tr/2014/09/01}KisiAdresBilgileri" minOccurs="0"/>
 *         &lt;element name="CuzdanBilgileri" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}CuzdanBilgisi" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="KisiBilgileri" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}KisiBilgisi" minOccurs="0"/>
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BirlesikKisiBilgileri", propOrder = {
    "extensionData",
    "adresBilgileri",
    "cuzdanBilgileri",
    "hataBilgisi",
    "kisiBilgileri",
    "tcKimlikNo"
})
public class BirlesikKisiBilgileri {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "AdresBilgileri")
    protected KisiAdresBilgileri adresBilgileri;
    @XmlElement(name = "CuzdanBilgileri")
    protected CuzdanBilgisi cuzdanBilgileri;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "KisiBilgileri")
    protected KisiBilgisi kisiBilgileri;
    @XmlElement(name = "TCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long tcKimlikNo;

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
     * Gets the value of the adresBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link KisiAdresBilgileri }
     *     
     */
    public KisiAdresBilgileri getAdresBilgileri() {
        return adresBilgileri;
    }

    /**
     * Sets the value of the adresBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiAdresBilgileri }
     *     
     */
    public void setAdresBilgileri(KisiAdresBilgileri value) {
        this.adresBilgileri = value;
    }

    /**
     * Gets the value of the cuzdanBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link CuzdanBilgisi }
     *     
     */
    public CuzdanBilgisi getCuzdanBilgileri() {
        return cuzdanBilgileri;
    }

    /**
     * Sets the value of the cuzdanBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link CuzdanBilgisi }
     *     
     */
    public void setCuzdanBilgileri(CuzdanBilgisi value) {
        this.cuzdanBilgileri = value;
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
     * Gets the value of the kisiBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link KisiBilgisi }
     *     
     */
    public KisiBilgisi getKisiBilgileri() {
        return kisiBilgileri;
    }

    /**
     * Sets the value of the kisiBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiBilgisi }
     *     
     */
    public void setKisiBilgileri(KisiBilgisi value) {
        this.kisiBilgileri = value;
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

}
