
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanbirlesikkisibilgisisorgula;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CuzdanBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CuzdanBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnneAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BabaAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CuzdanTur" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="CuzdanVerilmeNeden" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="DogumTarih" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="DogumYer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="KayitNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="SeriNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="TCKKVerilmeNeden" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="VerildigiIlce" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="VerilmeTarih" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}TarihBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CuzdanBilgisi", propOrder = {
    "extensionData",
    "ad",
    "anneAd",
    "babaAd",
    "cuzdanTur",
    "cuzdanVerilmeNeden",
    "dogumTarih",
    "dogumYer",
    "hataBilgisi",
    "kayitNo",
    "seriNo",
    "soyad",
    "tckkVerilmeNeden",
    "tcKimlikNo",
    "verildigiIlce",
    "verilmeTarih"
})
public class CuzdanBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "AnneAd")
    protected String anneAd;
    @XmlElement(name = "BabaAd")
    protected String babaAd;
    @XmlElement(name = "CuzdanTur")
    protected Parametre cuzdanTur;
    @XmlElement(name = "CuzdanVerilmeNeden")
    protected Parametre cuzdanVerilmeNeden;
    @XmlElement(name = "DogumTarih")
    protected TarihBilgisi dogumTarih;
    @XmlElement(name = "DogumYer")
    protected String dogumYer;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "KayitNo", required = true, type = Long.class, nillable = true)
    protected Long kayitNo;
    @XmlElement(name = "SeriNo")
    protected String seriNo;
    @XmlElement(name = "Soyad")
    protected String soyad;
    @XmlElement(name = "TCKKVerilmeNeden")
    protected Parametre tckkVerilmeNeden;
    @XmlElement(name = "TCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long tcKimlikNo;
    @XmlElement(name = "VerildigiIlce")
    protected Parametre verildigiIlce;
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
     * Gets the value of the cuzdanTur property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getCuzdanTur() {
        return cuzdanTur;
    }

    /**
     * Sets the value of the cuzdanTur property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setCuzdanTur(Parametre value) {
        this.cuzdanTur = value;
    }

    /**
     * Gets the value of the cuzdanVerilmeNeden property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getCuzdanVerilmeNeden() {
        return cuzdanVerilmeNeden;
    }

    /**
     * Sets the value of the cuzdanVerilmeNeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setCuzdanVerilmeNeden(Parametre value) {
        this.cuzdanVerilmeNeden = value;
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
     * Gets the value of the kayitNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKayitNo() {
        return kayitNo;
    }

    /**
     * Sets the value of the kayitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKayitNo(Long value) {
        this.kayitNo = value;
    }

    /**
     * Gets the value of the seriNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriNo() {
        return seriNo;
    }

    /**
     * Sets the value of the seriNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriNo(String value) {
        this.seriNo = value;
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
     * Gets the value of the tckkVerilmeNeden property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getTCKKVerilmeNeden() {
        return tckkVerilmeNeden;
    }

    /**
     * Sets the value of the tckkVerilmeNeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setTCKKVerilmeNeden(Parametre value) {
        this.tckkVerilmeNeden = value;
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
     * Gets the value of the verildigiIlce property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getVerildigiIlce() {
        return verildigiIlce;
    }

    /**
     * Sets the value of the verildigiIlce property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setVerildigiIlce(Parametre value) {
        this.verildigiIlce = value;
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
