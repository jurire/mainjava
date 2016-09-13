
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.namespacemavikartcuzdan.Parametre;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.namespacemavikartcuzdan.TarihBilgisi;


/**
 * <p>Java class for MaviKartBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaviKartBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnneAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BabaAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Birim" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Cinsiyet" type="{NameSpaceMaviKartCuzdan}Parametre" minOccurs="0"/>
 *         &lt;element name="DogumTarih" type="{NameSpaceMaviKartCuzdan}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="DogumYer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DogumYerKod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="HataBilgisi" type="{NameSpaceMaviKartCuzdan}Parametre" minOccurs="0"/>
 *         &lt;element name="KartKayitNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="KimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MedeniHal" type="{NameSpaceMaviKartCuzdan}Parametre" minOccurs="0"/>
 *         &lt;element name="No" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="OncekiSoyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Seri" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Uyruk" type="{NameSpaceMaviKartCuzdan}Parametre" minOccurs="0"/>
 *         &lt;element name="VerilisNeden" type="{NameSpaceMaviKartCuzdan}Parametre" minOccurs="0"/>
 *         &lt;element name="VerilmeTarih" type="{NameSpaceMaviKartCuzdan}TarihBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaviKartBilgisi", propOrder = {
    "extensionData",
    "ad",
    "anneAd",
    "babaAd",
    "birim",
    "cinsiyet",
    "dogumTarih",
    "dogumYer",
    "dogumYerKod",
    "hataBilgisi",
    "kartKayitNo",
    "kimlikNo",
    "medeniHal",
    "no",
    "oncekiSoyad",
    "seri",
    "soyad",
    "uyruk",
    "verilisNeden",
    "verilmeTarih"
})
public class MaviKartBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "AnneAd")
    protected String anneAd;
    @XmlElement(name = "BabaAd")
    protected String babaAd;
    @XmlElement(name = "Birim", required = true, type = Integer.class, nillable = true)
    protected Integer birim;
    @XmlElement(name = "Cinsiyet")
    protected Parametre cinsiyet;
    @XmlElement(name = "DogumTarih")
    protected TarihBilgisi dogumTarih;
    @XmlElement(name = "DogumYer")
    protected String dogumYer;
    @XmlElement(name = "DogumYerKod", required = true, type = Integer.class, nillable = true)
    protected Integer dogumYerKod;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "KartKayitNo", required = true, type = Long.class, nillable = true)
    protected Long kartKayitNo;
    @XmlElement(name = "KimlikNo", required = true, type = Long.class, nillable = true)
    protected Long kimlikNo;
    @XmlElement(name = "MedeniHal")
    protected Parametre medeniHal;
    @XmlElement(name = "No", required = true, type = Integer.class, nillable = true)
    protected Integer no;
    @XmlElement(name = "OncekiSoyad")
    protected String oncekiSoyad;
    @XmlElement(name = "Seri")
    protected String seri;
    @XmlElement(name = "Soyad")
    protected String soyad;
    @XmlElement(name = "Uyruk")
    protected Parametre uyruk;
    @XmlElement(name = "VerilisNeden")
    protected Parametre verilisNeden;
    @XmlElement(name = "VerilmeTarih")
    protected TarihBilgisi verilmeTarih;

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
     * Gets the value of the anneAd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnneAd() {
        return anneAd;
    }

    /**
     * Sets the value of the anneAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnneAd(String value) {
        this.anneAd = value;
    }

    /**
     * Gets the value of the babaAd property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBabaAd() {
        return babaAd;
    }

    /**
     * Sets the value of the babaAd property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBabaAd(String value) {
        this.babaAd = value;
    }

    /**
     * Gets the value of the birim property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBirim() {
        return birim;
    }

    /**
     * Sets the value of the birim property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBirim(Integer value) {
        this.birim = value;
    }

    /**
     * Gets the value of the cinsiyet property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getCinsiyet() {
        return cinsiyet;
    }

    /**
     * Sets the value of the cinsiyet property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setCinsiyet(Parametre value) {
        this.cinsiyet = value;
    }

    /**
     * Gets the value of the dogumTarih property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getDogumTarih() {
        return dogumTarih;
    }

    /**
     * Sets the value of the dogumTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setDogumTarih(TarihBilgisi value) {
        this.dogumTarih = value;
    }

    /**
     * Gets the value of the dogumYer property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDogumYer() {
        return dogumYer;
    }

    /**
     * Sets the value of the dogumYer property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDogumYer(String value) {
        this.dogumYer = value;
    }

    /**
     * Gets the value of the dogumYerKod property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDogumYerKod() {
        return dogumYerKod;
    }

    /**
     * Sets the value of the dogumYerKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDogumYerKod(Integer value) {
        this.dogumYerKod = value;
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
     * Gets the value of the kartKayitNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKartKayitNo() {
        return kartKayitNo;
    }

    /**
     * Sets the value of the kartKayitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKartKayitNo(Long value) {
        this.kartKayitNo = value;
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
     * Gets the value of the no property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setNo(Integer value) {
        this.no = value;
    }

    /**
     * Gets the value of the oncekiSoyad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOncekiSoyad() {
        return oncekiSoyad;
    }

    /**
     * Sets the value of the oncekiSoyad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOncekiSoyad(String value) {
        this.oncekiSoyad = value;
    }

    /**
     * Gets the value of the seri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeri() {
        return seri;
    }

    /**
     * Sets the value of the seri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeri(String value) {
        this.seri = value;
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

    /**
     * Gets the value of the uyruk property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getUyruk() {
        return uyruk;
    }

    /**
     * Sets the value of the uyruk property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setUyruk(Parametre value) {
        this.uyruk = value;
    }

    /**
     * Gets the value of the verilisNeden property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getVerilisNeden() {
        return verilisNeden;
    }

    /**
     * Sets the value of the verilisNeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setVerilisNeden(Parametre value) {
        this.verilisNeden = value;
    }

    /**
     * Gets the value of the verilmeTarih property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getVerilmeTarih() {
        return verilmeTarih;
    }

    /**
     * Sets the value of the verilmeTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setVerilmeTarih(TarihBilgisi value) {
        this.verilmeTarih = value;
    }

}
