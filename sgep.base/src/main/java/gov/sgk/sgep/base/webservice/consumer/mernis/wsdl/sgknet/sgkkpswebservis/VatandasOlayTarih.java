
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nsvatandasolaytarih.Parametre;


/**
 * <p>Java class for VatandasOlayTarih complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VatandasOlayTarih">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="Dusunceler" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NSVatandasOlayTarih}Parametre" minOccurs="0"/>
 *         &lt;element name="IptalGeriAlmaTarih" type="{http://sgknet/SGKKPSWebServis}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="KaybetmeTarih" type="{http://sgknet/SGKKPSWebServis}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="KazanmaTarih" type="{http://sgknet/SGKKPSWebServis}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="Olay" type="{NSVatandasOlayTarih}Parametre" minOccurs="0"/>
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="YabanciDevletVatKazTarih" type="{http://sgknet/SGKKPSWebServis}TarihBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VatandasOlayTarih", propOrder = {
    "extensionData",
    "dusunceler",
    "hataBilgisi",
    "iptalGeriAlmaTarih",
    "kaybetmeTarih",
    "kazanmaTarih",
    "olay",
    "tcKimlikNo",
    "yabanciDevletVatKazTarih"
})
public class VatandasOlayTarih {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "Dusunceler")
    protected String dusunceler;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "IptalGeriAlmaTarih")
    protected TarihBilgisi iptalGeriAlmaTarih;
    @XmlElement(name = "KaybetmeTarih")
    protected TarihBilgisi kaybetmeTarih;
    @XmlElement(name = "KazanmaTarih")
    protected TarihBilgisi kazanmaTarih;
    @XmlElement(name = "Olay")
    protected Parametre olay;
    @XmlElement(name = "TCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long tcKimlikNo;
    @XmlElement(name = "YabanciDevletVatKazTarih")
    protected TarihBilgisi yabanciDevletVatKazTarih;

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
     * Gets the value of the dusunceler property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDusunceler() {
        return dusunceler;
    }

    /**
     * Sets the value of the dusunceler property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDusunceler(String value) {
        this.dusunceler = value;
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
     * Gets the value of the iptalGeriAlmaTarih property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getIptalGeriAlmaTarih() {
        return iptalGeriAlmaTarih;
    }

    /**
     * Sets the value of the iptalGeriAlmaTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setIptalGeriAlmaTarih(TarihBilgisi value) {
        this.iptalGeriAlmaTarih = value;
    }

    /**
     * Gets the value of the kaybetmeTarih property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getKaybetmeTarih() {
        return kaybetmeTarih;
    }

    /**
     * Sets the value of the kaybetmeTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setKaybetmeTarih(TarihBilgisi value) {
        this.kaybetmeTarih = value;
    }

    /**
     * Gets the value of the kazanmaTarih property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getKazanmaTarih() {
        return kazanmaTarih;
    }

    /**
     * Sets the value of the kazanmaTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setKazanmaTarih(TarihBilgisi value) {
        this.kazanmaTarih = value;
    }

    /**
     * Gets the value of the olay property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getOlay() {
        return olay;
    }

    /**
     * Sets the value of the olay property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setOlay(Parametre value) {
        this.olay = value;
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
     * Gets the value of the yabanciDevletVatKazTarih property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getYabanciDevletVatKazTarih() {
        return yabanciDevletVatKazTarih;
    }

    /**
     * Sets the value of the yabanciDevletVatKazTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setYabanciDevletVatKazTarih(TarihBilgisi value) {
        this.yabanciDevletVatKazTarih = value;
    }

}
