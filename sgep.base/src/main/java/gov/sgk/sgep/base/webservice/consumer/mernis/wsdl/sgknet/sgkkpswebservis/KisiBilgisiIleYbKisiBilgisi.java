
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nsyabancikisibilgisindenkimlikbilgisisorgula.Parametre;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nsyabancikisibilgisindenkimlikbilgisisorgula.TarihBilgisi;


/**
 * <p>Java class for KisiBilgisiIleYbKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KisiBilgisiIleYbKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnneAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnneEgmSahisId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnneKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BabaAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BabaEgmSahisId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BabaKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Cinsiyet" type="{NSYabanciKisiBilgisindenKimlikBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="DogumTarih" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DogumYer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Durum" type="{NSYabanciKisiBilgisindenKimlikBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="EgmSahisId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EsEgmSahisId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EsKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HataBilgisi" type="{NSYabanciKisiBilgisindenKimlikBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="IkametAdres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IkametAdresIl" type="{NSYabanciKisiBilgisindenKimlikBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="IkametAdresIlce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IkametDuzenleIl" type="{NSYabanciKisiBilgisindenKimlikBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="IkametSure" type="{NSYabanciKisiBilgisindenKimlikBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="IkametTezkereNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IzinBaslangicTarih" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="KazanilanTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="KimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="MedeniHal" type="{NSYabanciKisiBilgisindenKimlikBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="OlumTarih" type="{NSYabanciKisiBilgisindenKimlikBilgisiSorgula}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="Soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Ulke" type="{NSYabanciKisiBilgisindenKimlikBilgisiSorgula}Parametre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KisiBilgisiIleYbKisiBilgisi", propOrder = {
    "extensionData",
    "ad",
    "anneAd",
    "anneEgmSahisId",
    "anneKimlikNo",
    "babaAd",
    "babaEgmSahisId",
    "babaKimlikNo",
    "cinsiyet",
    "dogumTarih",
    "dogumYer",
    "durum",
    "egmSahisId",
    "esEgmSahisId",
    "esKimlikNo",
    "hataBilgisi",
    "ikametAdres",
    "ikametAdresIl",
    "ikametAdresIlce",
    "ikametDuzenleIl",
    "ikametSure",
    "ikametTezkereNo",
    "izinBaslangicTarih",
    "kazanilanTCKimlikNo",
    "kimlikNo",
    "medeniHal",
    "olumTarih",
    "soyad",
    "ulke"
})
public class KisiBilgisiIleYbKisiBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "AnneAd")
    protected String anneAd;
    @XmlElement(name = "AnneEgmSahisId")
    protected String anneEgmSahisId;
    @XmlElement(name = "AnneKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long anneKimlikNo;
    @XmlElement(name = "BabaAd")
    protected String babaAd;
    @XmlElement(name = "BabaEgmSahisId")
    protected String babaEgmSahisId;
    @XmlElement(name = "BabaKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long babaKimlikNo;
    @XmlElement(name = "Cinsiyet")
    protected Parametre cinsiyet;
    @XmlElement(name = "DogumTarih", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dogumTarih;
    @XmlElement(name = "DogumYer")
    protected String dogumYer;
    @XmlElement(name = "Durum")
    protected Parametre durum;
    @XmlElement(name = "EgmSahisId")
    protected String egmSahisId;
    @XmlElement(name = "EsEgmSahisId")
    protected String esEgmSahisId;
    @XmlElement(name = "EsKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long esKimlikNo;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "IkametAdres")
    protected String ikametAdres;
    @XmlElement(name = "IkametAdresIl")
    protected Parametre ikametAdresIl;
    @XmlElement(name = "IkametAdresIlce")
    protected String ikametAdresIlce;
    @XmlElement(name = "IkametDuzenleIl")
    protected Parametre ikametDuzenleIl;
    @XmlElement(name = "IkametSure")
    protected Parametre ikametSure;
    @XmlElement(name = "IkametTezkereNo")
    protected String ikametTezkereNo;
    @XmlElement(name = "IzinBaslangicTarih", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar izinBaslangicTarih;
    @XmlElement(name = "KazanilanTCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long kazanilanTCKimlikNo;
    @XmlElement(name = "KimlikNo", required = true, type = Long.class, nillable = true)
    protected Long kimlikNo;
    @XmlElement(name = "MedeniHal")
    protected Parametre medeniHal;
    @XmlElement(name = "OlumTarih")
    protected TarihBilgisi olumTarih;
    @XmlElement(name = "Soyad")
    protected String soyad;
    @XmlElement(name = "Ulke")
    protected Parametre ulke;

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
     * Gets the value of the anneEgmSahisId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAnneEgmSahisId() {
        return anneEgmSahisId;
    }

    /**
     * Sets the value of the anneEgmSahisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAnneEgmSahisId(String value) {
        this.anneEgmSahisId = value;
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
     * Gets the value of the babaEgmSahisId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBabaEgmSahisId() {
        return babaEgmSahisId;
    }

    /**
     * Sets the value of the babaEgmSahisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBabaEgmSahisId(String value) {
        this.babaEgmSahisId = value;
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDogumTarih() {
        return dogumTarih;
    }

    /**
     * Sets the value of the dogumTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDogumTarih(XMLGregorianCalendar value) {
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
     * Gets the value of the egmSahisId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEgmSahisId() {
        return egmSahisId;
    }

    /**
     * Sets the value of the egmSahisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEgmSahisId(String value) {
        this.egmSahisId = value;
    }

    /**
     * Gets the value of the esEgmSahisId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEsEgmSahisId() {
        return esEgmSahisId;
    }

    /**
     * Sets the value of the esEgmSahisId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEsEgmSahisId(String value) {
        this.esEgmSahisId = value;
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
     * Gets the value of the ikametAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIkametAdres() {
        return ikametAdres;
    }

    /**
     * Sets the value of the ikametAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIkametAdres(String value) {
        this.ikametAdres = value;
    }

    /**
     * Gets the value of the ikametAdresIl property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getIkametAdresIl() {
        return ikametAdresIl;
    }

    /**
     * Sets the value of the ikametAdresIl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setIkametAdresIl(Parametre value) {
        this.ikametAdresIl = value;
    }

    /**
     * Gets the value of the ikametAdresIlce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIkametAdresIlce() {
        return ikametAdresIlce;
    }

    /**
     * Sets the value of the ikametAdresIlce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIkametAdresIlce(String value) {
        this.ikametAdresIlce = value;
    }

    /**
     * Gets the value of the ikametDuzenleIl property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getIkametDuzenleIl() {
        return ikametDuzenleIl;
    }

    /**
     * Sets the value of the ikametDuzenleIl property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setIkametDuzenleIl(Parametre value) {
        this.ikametDuzenleIl = value;
    }

    /**
     * Gets the value of the ikametSure property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getIkametSure() {
        return ikametSure;
    }

    /**
     * Sets the value of the ikametSure property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setIkametSure(Parametre value) {
        this.ikametSure = value;
    }

    /**
     * Gets the value of the ikametTezkereNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIkametTezkereNo() {
        return ikametTezkereNo;
    }

    /**
     * Sets the value of the ikametTezkereNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIkametTezkereNo(String value) {
        this.ikametTezkereNo = value;
    }

    /**
     * Gets the value of the izinBaslangicTarih property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getIzinBaslangicTarih() {
        return izinBaslangicTarih;
    }

    /**
     * Sets the value of the izinBaslangicTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setIzinBaslangicTarih(XMLGregorianCalendar value) {
        this.izinBaslangicTarih = value;
    }

    /**
     * Gets the value of the kazanilanTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKazanilanTCKimlikNo() {
        return kazanilanTCKimlikNo;
    }

    /**
     * Sets the value of the kazanilanTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKazanilanTCKimlikNo(Long value) {
        this.kazanilanTCKimlikNo = value;
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

}
