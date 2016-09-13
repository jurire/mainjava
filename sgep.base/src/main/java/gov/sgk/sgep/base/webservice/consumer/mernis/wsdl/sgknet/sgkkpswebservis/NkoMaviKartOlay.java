
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanmavikartlivukuatsiznkosorgula.Parametre;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanmavikartlivukuatsiznkosorgula.TarihBilgisi;


/**
 * <p>Java class for NkoMaviKartOlay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NkoMaviKartOlay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Dusunce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="KisiKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OlayTarih" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="OlayTipi" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="Soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NkoMaviKartOlay", propOrder = {
    "extensionData",
    "ad",
    "dusunce",
    "hataBilgisi",
    "kisiKimlikNo",
    "olayTarih",
    "olayTipi",
    "soyad"
})
public class NkoMaviKartOlay {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "Dusunce")
    protected String dusunce;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "KisiKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long kisiKimlikNo;
    @XmlElement(name = "OlayTarih")
    protected TarihBilgisi olayTarih;
    @XmlElement(name = "OlayTipi")
    protected Parametre olayTipi;
    @XmlElement(name = "Soyad")
    protected String soyad;

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
     * Gets the value of the ad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAd() {
        return ad;
    }

    /**
     * Sets the value of the ad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAd(String value) {
        this.ad = value;
    }

    /**
     * Gets the value of the dusunce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDusunce() {
        return dusunce;
    }

    /**
     * Sets the value of the dusunce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDusunce(String value) {
        this.dusunce = value;
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
     * Gets the value of the kisiKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKisiKimlikNo() {
        return kisiKimlikNo;
    }

    /**
     * Sets the value of the kisiKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKisiKimlikNo(Long value) {
        this.kisiKimlikNo = value;
    }

    /**
     * Gets the value of the olayTarih property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getOlayTarih() {
        return olayTarih;
    }

    /**
     * Sets the value of the olayTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setOlayTarih(TarihBilgisi value) {
        this.olayTarih = value;
    }

    /**
     * Gets the value of the olayTipi property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getOlayTipi() {
        return olayTipi;
    }

    /**
     * Sets the value of the olayTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setOlayTipi(Parametre value) {
        this.olayTipi = value;
    }

    /**
     * Gets the value of the soyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSoyad() {
        return soyad;
    }

    /**
     * Sets the value of the soyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSoyad(String value) {
        this.soyad = value;
    }

}
