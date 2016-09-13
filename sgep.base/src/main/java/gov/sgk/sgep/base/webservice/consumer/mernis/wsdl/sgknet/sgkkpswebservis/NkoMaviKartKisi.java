
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanmavikartlivukuatsiznkosorgula.Parametre;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanmavikartlivukuatsiznkosorgula.TarihBilgisi;


/**
 * <p>Java class for NkoMaviKartKisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NkoMaviKartKisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="AnneKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BabaKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BosanmaTarih" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="DurumBilgisi" type="{http://sgknet/SGKKPSWebServis}NkoMaviKartKisiDurumBilgisi" minOccurs="0"/>
 *         &lt;element name="EsKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="EvlenmeTarih" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="KimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TemelBilgisi" type="{http://sgknet/SGKKPSWebServis}NkoMaviKartKisiTemelBilgisi" minOccurs="0"/>
 *         &lt;element name="TescilTarih" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="Ulke" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="YakinlikKod" type="{NSTCKimlikNodanMaviKartliVukuatsizNKOSorgula}Parametre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NkoMaviKartKisi", propOrder = {
    "extensionData",
    "anneKimlikNo",
    "babaKimlikNo",
    "bosanmaTarih",
    "durumBilgisi",
    "esKimlikNo",
    "evlenmeTarih",
    "hataBilgisi",
    "kimlikNo",
    "temelBilgisi",
    "tescilTarih",
    "ulke",
    "yakinlikKod"
})
public class NkoMaviKartKisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "AnneKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long anneKimlikNo;
    @XmlElement(name = "BabaKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long babaKimlikNo;
    @XmlElement(name = "BosanmaTarih")
    protected TarihBilgisi bosanmaTarih;
    @XmlElement(name = "DurumBilgisi")
    protected NkoMaviKartKisiDurumBilgisi durumBilgisi;
    @XmlElement(name = "EsKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long esKimlikNo;
    @XmlElement(name = "EvlenmeTarih")
    protected TarihBilgisi evlenmeTarih;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "KimlikNo", required = true, type = Long.class, nillable = true)
    protected Long kimlikNo;
    @XmlElement(name = "TemelBilgisi")
    protected NkoMaviKartKisiTemelBilgisi temelBilgisi;
    @XmlElement(name = "TescilTarih")
    protected TarihBilgisi tescilTarih;
    @XmlElement(name = "Ulke")
    protected Parametre ulke;
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
     * Gets the value of the anneKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnneKimlikNo() {
        return anneKimlikNo;
    }

    /**
     * Sets the value of the anneKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnneKimlikNo(Long value) {
        this.anneKimlikNo = value;
    }

    /**
     * Gets the value of the babaKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBabaKimlikNo() {
        return babaKimlikNo;
    }

    /**
     * Sets the value of the babaKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBabaKimlikNo(Long value) {
        this.babaKimlikNo = value;
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
     * Gets the value of the durumBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link NkoMaviKartKisiDurumBilgisi }
     *     
     */
    public NkoMaviKartKisiDurumBilgisi getDurumBilgisi() {
        return durumBilgisi;
    }

    /**
     * Sets the value of the durumBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NkoMaviKartKisiDurumBilgisi }
     *     
     */
    public void setDurumBilgisi(NkoMaviKartKisiDurumBilgisi value) {
        this.durumBilgisi = value;
    }

    /**
     * Gets the value of the esKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEsKimlikNo() {
        return esKimlikNo;
    }

    /**
     * Sets the value of the esKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEsKimlikNo(Long value) {
        this.esKimlikNo = value;
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
     * Gets the value of the temelBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link NkoMaviKartKisiTemelBilgisi }
     *     
     */
    public NkoMaviKartKisiTemelBilgisi getTemelBilgisi() {
        return temelBilgisi;
    }

    /**
     * Sets the value of the temelBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link NkoMaviKartKisiTemelBilgisi }
     *     
     */
    public void setTemelBilgisi(NkoMaviKartKisiTemelBilgisi value) {
        this.temelBilgisi = value;
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

    /**
     * Gets the value of the ulke property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getUlke() {
        return ulke;
    }

    /**
     * Sets the value of the ulke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setUlke(Parametre value) {
        this.ulke = value;
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
