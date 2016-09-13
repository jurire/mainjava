
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulakayityeri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Nko complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Nko">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{NkoSorgulaKayitYeri}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NkoSorgulaKayitYeri}Parametre" minOccurs="0"/>
 *         &lt;element name="Kisiler" type="{NkoSorgulaKayitYeri}ArrayOfNkoKisi" minOccurs="0"/>
 *         &lt;element name="NkoTuru" type="{NkoSorgulaKayitYeri}Parametre" minOccurs="0"/>
 *         &lt;element name="Olaylar" type="{NkoSorgulaKayitYeri}ArrayOfNkoOlay" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Nko", propOrder = {
    "extensionData",
    "hataBilgisi",
    "kisiler",
    "nkoTuru",
    "olaylar"
})
public class Nko {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "Kisiler")
    protected ArrayOfNkoKisi kisiler;
    @XmlElement(name = "NkoTuru")
    protected Parametre nkoTuru;
    @XmlElement(name = "Olaylar")
    protected ArrayOfNkoOlay olaylar;

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
     * Gets the value of the kisiler property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNkoKisi }
     *     
     */
    public ArrayOfNkoKisi getKisiler() {
        return kisiler;
    }

    /**
     * Sets the value of the kisiler property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNkoKisi }
     *     
     */
    public void setKisiler(ArrayOfNkoKisi value) {
        this.kisiler = value;
    }

    /**
     * Gets the value of the nkoTuru property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getNkoTuru() {
        return nkoTuru;
    }

    /**
     * Sets the value of the nkoTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setNkoTuru(Parametre value) {
        this.nkoTuru = value;
    }

    /**
     * Gets the value of the olaylar property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfNkoOlay }
     *     
     */
    public ArrayOfNkoOlay getOlaylar() {
        return olaylar;
    }

    /**
     * Sets the value of the olaylar property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfNkoOlay }
     *     
     */
    public void setOlaylar(ArrayOfNkoOlay value) {
        this.olaylar = value;
    }

}
