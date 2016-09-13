
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.olaylistele.Parametre;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.olaylistele.TarihBilgisi;


/**
 * <p>Java class for OlayBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OlayBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{OlayListele}Parametre" minOccurs="0"/>
 *         &lt;element name="OlayKayitNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="OlayTarih" type="{OlayListele}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="OlayTip" type="{OlayListele}Parametre" minOccurs="0"/>
 *         &lt;element name="SayfaAnahtari" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TescilTarih" type="{OlayListele}TarihBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OlayBilgisi", propOrder = {
    "extensionData",
    "hataBilgisi",
    "olayKayitNo",
    "olayTarih",
    "olayTip",
    "sayfaAnahtari",
    "tcKimlikNo",
    "tescilTarih"
})
public class OlayBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "OlayKayitNo", required = true, type = Long.class, nillable = true)
    protected Long olayKayitNo;
    @XmlElement(name = "OlayTarih")
    protected TarihBilgisi olayTarih;
    @XmlElement(name = "OlayTip")
    protected Parametre olayTip;
    @XmlElement(name = "SayfaAnahtari", required = true, nillable = true)
    protected BigDecimal sayfaAnahtari;
    @XmlElement(name = "TCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long tcKimlikNo;
    @XmlElement(name = "TescilTarih")
    protected TarihBilgisi tescilTarih;

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
     * Gets the value of the olayKayitNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getOlayKayitNo() {
        return olayKayitNo;
    }

    /**
     * Sets the value of the olayKayitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setOlayKayitNo(Long value) {
        this.olayKayitNo = value;
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
     * Gets the value of the olayTip property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getOlayTip() {
        return olayTip;
    }

    /**
     * Sets the value of the olayTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setOlayTip(Parametre value) {
        this.olayTip = value;
    }

    /**
     * Gets the value of the sayfaAnahtari property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSayfaAnahtari() {
        return sayfaAnahtari;
    }

    /**
     * Sets the value of the sayfaAnahtari property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSayfaAnahtari(BigDecimal value) {
        this.sayfaAnahtari = value;
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
     * Gets the value of the tescilTarih property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getTescilTarih() {
        return tescilTarih;
    }

    /**
     * Sets the value of the tescilTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setTescilTarih(TarihBilgisi value) {
        this.tescilTarih = value;
    }

}
