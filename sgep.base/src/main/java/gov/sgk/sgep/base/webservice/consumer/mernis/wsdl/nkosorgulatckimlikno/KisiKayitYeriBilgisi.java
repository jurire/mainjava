
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulatckimlikno;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KisiKayitYeriBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KisiKayitYeriBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{NkoSorgulaTCKimlikNo}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="AileSiraNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BireySiraNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cilt" type="{NkoSorgulaTCKimlikNo}Parametre" minOccurs="0"/>
 *         &lt;element name="Il" type="{NkoSorgulaTCKimlikNo}Parametre" minOccurs="0"/>
 *         &lt;element name="Ilce" type="{NkoSorgulaTCKimlikNo}Parametre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KisiKayitYeriBilgisi", propOrder = {
    "extensionData",
    "aileSiraNo",
    "bireySiraNo",
    "cilt",
    "il",
    "ilce"
})
public class KisiKayitYeriBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "AileSiraNo", required = true, type = Integer.class, nillable = true)
    protected Integer aileSiraNo;
    @XmlElement(name = "BireySiraNo", required = true, type = Integer.class, nillable = true)
    protected Integer bireySiraNo;
    @XmlElement(name = "Cilt")
    protected Parametre cilt;
    @XmlElement(name = "Il")
    protected Parametre il;
    @XmlElement(name = "Ilce")
    protected Parametre ilce;

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
     *     {@link Parametre }
     *     
     */
    public Parametre getCilt() {
        return cilt;
    }

    /**
     * Sets the value of the cilt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setCilt(Parametre value) {
        this.cilt = value;
    }

    /**
     * Gets the value of the il property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getIl() {
        return il;
    }

    /**
     * Sets the value of the il property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setIl(Parametre value) {
        this.il = value;
    }

    /**
     * Gets the value of the ilce property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getIlce() {
        return ilce;
    }

    /**
     * Sets the value of the ilce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setIlce(Parametre value) {
        this.ilce = value;
    }

}
