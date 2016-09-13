
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulakayityeri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KisiKayitYeriKodBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KisiKayitYeriKodBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{NkoSorgulaKayitYeri}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="AileSiraNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BireySiraNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="CiltKod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="IlceKod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KisiKayitYeriKodBilgisi", propOrder = {
    "extensionData",
    "aileSiraNo",
    "bireySiraNo",
    "ciltKod",
    "ilceKod"
})
public class KisiKayitYeriKodBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "AileSiraNo", required = true, type = Integer.class, nillable = true)
    protected Integer aileSiraNo;
    @XmlElement(name = "BireySiraNo", required = true, type = Integer.class, nillable = true)
    protected Integer bireySiraNo;
    @XmlElement(name = "CiltKod", required = true, type = Integer.class, nillable = true)
    protected Integer ciltKod;
    @XmlElement(name = "IlceKod", required = true, type = Integer.class, nillable = true)
    protected Integer ilceKod;

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
     * Gets the value of the aileSiraNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAileSiraNo() {
        return aileSiraNo;
    }

    /**
     * Sets the value of the aileSiraNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAileSiraNo(Integer value) {
        this.aileSiraNo = value;
    }

    /**
     * Gets the value of the bireySiraNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBireySiraNo() {
        return bireySiraNo;
    }

    /**
     * Sets the value of the bireySiraNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBireySiraNo(Integer value) {
        this.bireySiraNo = value;
    }

    /**
     * Gets the value of the ciltKod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCiltKod() {
        return ciltKod;
    }

    /**
     * Sets the value of the ciltKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCiltKod(Integer value) {
        this.ciltKod = value;
    }

    /**
     * Gets the value of the ilceKod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIlceKod() {
        return ilceKod;
    }

    /**
     * Sets the value of the ilceKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIlceKod(Integer value) {
        this.ilceKod = value;
    }

}
