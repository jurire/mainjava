
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.kisisorgulakayityeri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TarihBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TarihBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{KisiSorgulaKayitYeri}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="Ay" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Gun" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Yil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TarihBilgisi", propOrder = {
    "extensionData",
    "ay",
    "gun",
    "yil"
})
public class TarihBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "Ay", required = true, type = Integer.class, nillable = true)
    protected Integer ay;
    @XmlElement(name = "Gun", required = true, type = Integer.class, nillable = true)
    protected Integer gun;
    @XmlElement(name = "Yil", required = true, type = Integer.class, nillable = true)
    protected Integer yil;

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
     * Gets the value of the ay property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAy() {
        return ay;
    }

    /**
     * Sets the value of the ay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAy(Integer value) {
        this.ay = value;
    }

    /**
     * Gets the value of the gun property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getGun() {
        return gun;
    }

    /**
     * Sets the value of the gun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setGun(Integer value) {
        this.gun = value;
    }

    /**
     * Gets the value of the yil property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYil() {
        return yil;
    }

    /**
     * Sets the value of the yil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYil(Integer value) {
        this.yil = value;
    }

}
