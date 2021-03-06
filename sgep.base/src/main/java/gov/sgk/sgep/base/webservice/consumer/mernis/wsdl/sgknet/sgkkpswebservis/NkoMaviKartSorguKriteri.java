
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NkoMaviKartSorguKriteri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NkoMaviKartSorguKriteri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="EskiEsListele" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="KimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="NKOTipi" type="{http://sgknet/SGKKPSWebServis}NkoTur"/>
 *         &lt;element name="Vukuatli" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NkoMaviKartSorguKriteri", propOrder = {
    "extensionData",
    "eskiEsListele",
    "kimlikNo",
    "nkoTipi",
    "vukuatli"
})
public class NkoMaviKartSorguKriteri {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "EskiEsListele", required = true, type = Boolean.class, nillable = true)
    protected Boolean eskiEsListele;
    @XmlElement(name = "KimlikNo", required = true, type = Long.class, nillable = true)
    protected Long kimlikNo;
    @XmlElement(name = "NKOTipi", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected NkoTur nkoTipi;
    @XmlElement(name = "Vukuatli", required = true, type = Boolean.class, nillable = true)
    protected Boolean vukuatli;

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
     * Gets the value of the eskiEsListele property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isEskiEsListele() {
        return eskiEsListele;
    }

    /**
     * Sets the value of the eskiEsListele property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setEskiEsListele(Boolean value) {
        this.eskiEsListele = value;
    }

    /**
     * Gets the value of the kimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKimlikNo() {
        return kimlikNo;
    }

    /**
     * Sets the value of the kimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKimlikNo(Long value) {
        this.kimlikNo = value;
    }

    /**
     * Gets the value of the nkoTipi property.
     * 
     * @return
     *     possible object is
     *     {@link NkoTur }
     *     
     */
    public NkoTur getNKOTipi() {
        return nkoTipi;
    }

    /**
     * Sets the value of the nkoTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NkoTur }
     *     
     */
    public void setNKOTipi(NkoTur value) {
        this.nkoTipi = value;
    }

    /**
     * Gets the value of the vukuatli property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVukuatli() {
        return vukuatli;
    }

    /**
     * Sets the value of the vukuatli property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVukuatli(Boolean value) {
        this.vukuatli = value;
    }

}
