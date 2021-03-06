
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulakayityeri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NkoKisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NkoKisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{NkoSorgulaKayitYeri}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="DurumBilgisi" type="{NkoSorgulaKayitYeri}KisiDurumBilgisi" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NkoSorgulaKayitYeri}Parametre" minOccurs="0"/>
 *         &lt;element name="KayitYeriBilgisi" type="{NkoSorgulaKayitYeri}KisiKayitYeriBilgisi" minOccurs="0"/>
 *         &lt;element name="KisiOlayTarihBilgisi" type="{NkoSorgulaKayitYeri}OlayTarihBilgisi" minOccurs="0"/>
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TemelBilgisi" type="{NkoSorgulaKayitYeri}KisiTemelBilgisi" minOccurs="0"/>
 *         &lt;element name="YakinlikKod" type="{NkoSorgulaKayitYeri}Parametre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NkoKisi", propOrder = {
    "extensionData",
    "durumBilgisi",
    "hataBilgisi",
    "kayitYeriBilgisi",
    "kisiOlayTarihBilgisi",
    "tcKimlikNo",
    "temelBilgisi",
    "yakinlikKod"
})
public class NkoKisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "DurumBilgisi")
    protected KisiDurumBilgisi durumBilgisi;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "KayitYeriBilgisi")
    protected KisiKayitYeriBilgisi kayitYeriBilgisi;
    @XmlElement(name = "KisiOlayTarihBilgisi")
    protected OlayTarihBilgisi kisiOlayTarihBilgisi;
    @XmlElement(name = "TCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long tcKimlikNo;
    @XmlElement(name = "TemelBilgisi")
    protected KisiTemelBilgisi temelBilgisi;
    @XmlElement(name = "YakinlikKod")
    protected Parametre yakinlikKod;

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
     * Gets the value of the durumBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link KisiDurumBilgisi }
     *     
     */
    public KisiDurumBilgisi getDurumBilgisi() {
        return durumBilgisi;
    }

    /**
     * Sets the value of the durumBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiDurumBilgisi }
     *     
     */
    public void setDurumBilgisi(KisiDurumBilgisi value) {
        this.durumBilgisi = value;
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
     * Gets the value of the kayitYeriBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link KisiKayitYeriBilgisi }
     *     
     */
    public KisiKayitYeriBilgisi getKayitYeriBilgisi() {
        return kayitYeriBilgisi;
    }

    /**
     * Sets the value of the kayitYeriBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiKayitYeriBilgisi }
     *     
     */
    public void setKayitYeriBilgisi(KisiKayitYeriBilgisi value) {
        this.kayitYeriBilgisi = value;
    }

    /**
     * Gets the value of the kisiOlayTarihBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link OlayTarihBilgisi }
     *     
     */
    public OlayTarihBilgisi getKisiOlayTarihBilgisi() {
        return kisiOlayTarihBilgisi;
    }

    /**
     * Sets the value of the kisiOlayTarihBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link OlayTarihBilgisi }
     *     
     */
    public void setKisiOlayTarihBilgisi(OlayTarihBilgisi value) {
        this.kisiOlayTarihBilgisi = value;
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
     * Gets the value of the temelBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link KisiTemelBilgisi }
     *     
     */
    public KisiTemelBilgisi getTemelBilgisi() {
        return temelBilgisi;
    }

    /**
     * Sets the value of the temelBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiTemelBilgisi }
     *     
     */
    public void setTemelBilgisi(KisiTemelBilgisi value) {
        this.temelBilgisi = value;
    }

    /**
     * Gets the value of the yakinlikKod property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getYakinlikKod() {
        return yakinlikKod;
    }

    /**
     * Sets the value of the yakinlikKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setYakinlikKod(Parametre value) {
        this.yakinlikKod = value;
    }

}
