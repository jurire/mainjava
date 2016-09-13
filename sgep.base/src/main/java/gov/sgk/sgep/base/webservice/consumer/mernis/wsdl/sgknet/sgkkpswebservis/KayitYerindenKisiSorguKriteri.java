
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KayitYerindenKisiSorguKriteri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KayitYerindenKisiSorguKriteri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="AileSiraNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BireySiraNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cilt" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ilce" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KayitYerindenKisiSorguKriteri", propOrder = {
    "extensionData",
    "aileSiraNo",
    "bireySiraNo",
    "cilt",
    "ilce"
})
public class KayitYerindenKisiSorguKriteri {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "AileSiraNo", required = true, type = Integer.class, nillable = true)
    protected Integer aileSiraNo;
    @XmlElement(name = "BireySiraNo", required = true, type = Integer.class, nillable = true)
    protected Integer bireySiraNo;
    @XmlElement(name = "Cilt", required = true, type = Integer.class, nillable = true)
    protected Integer cilt;
    @XmlElement(name = "Ilce", required = true, type = Integer.class, nillable = true)
    protected Integer ilce;

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
     * Gets the value of the cilt property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCilt() {
        return cilt;
    }

    /**
     * Sets the value of the cilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCilt(Integer value) {
        this.cilt = value;
    }

    /**
     * Gets the value of the ilce property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIlce() {
        return ilce;
    }

    /**
     * Sets the value of the ilce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIlce(Integer value) {
        this.ilce = value;
    }

}
