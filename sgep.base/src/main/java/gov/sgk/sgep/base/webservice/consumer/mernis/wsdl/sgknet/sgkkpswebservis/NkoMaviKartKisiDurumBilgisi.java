
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanmavikartlivukuatsiznkosorgula.Parametre;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanmavikartlivukuatsiznkosorgula.TarihBilgisi;


/**
 * <p>Java class for NkoMaviKartKisiDurumBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NkoMaviKartKisiDurumBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="Durum" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="MedeniHal" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="OlumTarih" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}TarihBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NkoMaviKartKisiDurumBilgisi", propOrder = {
    "extensionData",
    "durum",
    "medeniHal",
    "olumTarih"
})
public class NkoMaviKartKisiDurumBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "Durum")
    protected Parametre durum;
    @XmlElement(name = "MedeniHal")
    protected Parametre medeniHal;
    @XmlElement(name = "OlumTarih")
    protected TarihBilgisi olumTarih;

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
     * Gets the value of the durum property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getDurum() {
        return durum;
    }

    /**
     * Sets the value of the durum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setDurum(Parametre value) {
        this.durum = value;
    }

    /**
     * Gets the value of the medeniHal property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getMedeniHal() {
        return medeniHal;
    }

    /**
     * Sets the value of the medeniHal property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setMedeniHal(Parametre value) {
        this.medeniHal = value;
    }

    /**
     * Gets the value of the olumTarih property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getOlumTarih() {
        return olumTarih;
    }

    /**
     * Sets the value of the olumTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setOlumTarih(TarihBilgisi value) {
        this.olumTarih = value;
    }

}
