
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulatckimlikno.TarihBilgisi;


/**
 * <p>Java class for OlayTarihBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OlayTarihBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="BosanmaTarih" type="{NkoSorgulaTCKimlikNo}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="EvlenmeTarih" type="{NkoSorgulaTCKimlikNo}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="TescilTarih" type="{NkoSorgulaTCKimlikNo}TarihBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OlayTarihBilgisi", propOrder = {
    "extensionData",
    "bosanmaTarih",
    "evlenmeTarih",
    "tescilTarih"
})
public class OlayTarihBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "BosanmaTarih")
    protected TarihBilgisi bosanmaTarih;
    @XmlElement(name = "EvlenmeTarih")
    protected TarihBilgisi evlenmeTarih;
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
     * Gets the value of the bosanmaTarih property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getBosanmaTarih() {
        return bosanmaTarih;
    }

    /**
     * Sets the value of the bosanmaTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setBosanmaTarih(TarihBilgisi value) {
        this.bosanmaTarih = value;
    }

    /**
     * Gets the value of the evlenmeTarih property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getEvlenmeTarih() {
        return evlenmeTarih;
    }

    /**
     * Sets the value of the evlenmeTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setEvlenmeTarih(TarihBilgisi value) {
        this.evlenmeTarih = value;
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
