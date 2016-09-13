
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.tr.gov.nvi.kps._2014._09._01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanbirlesikkisibilgisisorgula.Parametre;


/**
 * <p>Java class for KoyAdresi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KoyAdresi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://kps.nvi.gov.tr/2014/09/01}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="BagimsizBolumDurum" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="BagimsizBolumTipi" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="BinaAda" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BinaBlokAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BinaDurum" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="BinaKodu" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BinaNo" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="BinaNumaratajTipi" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="BinaPafta" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BinaParsel" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BinaSiteAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BinaYapiTipi" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="Bucak" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BucakKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Csbm" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CsbmKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DisKapiNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="IcKapiNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Il" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IlKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Ilce" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IlceKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="KatNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Koy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="KoyKayitNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="KoyKodu" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Mahalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="MahalleKodu" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="TapuBagimsizBolumNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YapiKullanimAmac" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="YolAltiKatSayisi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="YolUstuKatSayisi" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KoyAdresi", propOrder = {
    "extensionData",
    "bagimsizBolumDurum",
    "bagimsizBolumTipi",
    "binaAda",
    "binaBlokAdi",
    "binaDurum",
    "binaKodu",
    "binaNo",
    "binaNumaratajTipi",
    "binaPafta",
    "binaParsel",
    "binaSiteAdi",
    "binaYapiTipi",
    "bucak",
    "bucakKodu",
    "csbm",
    "csbmKodu",
    "disKapiNo",
    "hataBilgisi",
    "icKapiNo",
    "il",
    "ilKodu",
    "ilce",
    "ilceKodu",
    "katNo",
    "koy",
    "koyKayitNo",
    "koyKodu",
    "mahalle",
    "mahalleKodu",
    "tapuBagimsizBolumNo",
    "yapiKullanimAmac",
    "yolAltiKatSayisi",
    "yolUstuKatSayisi"
})
public class KoyAdresi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "BagimsizBolumDurum")
    protected Parametre bagimsizBolumDurum;
    @XmlElement(name = "BagimsizBolumTipi")
    protected Parametre bagimsizBolumTipi;
    @XmlElement(name = "BinaAda")
    protected String binaAda;
    @XmlElement(name = "BinaBlokAdi")
    protected String binaBlokAdi;
    @XmlElement(name = "BinaDurum")
    protected Parametre binaDurum;
    @XmlElement(name = "BinaKodu", required = true, type = Long.class, nillable = true)
    protected Long binaKodu;
    @XmlElement(name = "BinaNo", required = true, type = Integer.class, nillable = true)
    protected Integer binaNo;
    @XmlElement(name = "BinaNumaratajTipi")
    protected Parametre binaNumaratajTipi;
    @XmlElement(name = "BinaPafta")
    protected String binaPafta;
    @XmlElement(name = "BinaParsel")
    protected String binaParsel;
    @XmlElement(name = "BinaSiteAdi")
    protected String binaSiteAdi;
    @XmlElement(name = "BinaYapiTipi")
    protected Parametre binaYapiTipi;
    @XmlElement(name = "Bucak")
    protected String bucak;
    @XmlElement(name = "BucakKodu", required = true, type = Integer.class, nillable = true)
    protected Integer bucakKodu;
    @XmlElement(name = "Csbm")
    protected String csbm;
    @XmlElement(name = "CsbmKodu", required = true, type = Integer.class, nillable = true)
    protected Integer csbmKodu;
    @XmlElement(name = "DisKapiNo")
    protected String disKapiNo;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "IcKapiNo")
    protected String icKapiNo;
    @XmlElement(name = "Il")
    protected String il;
    @XmlElement(name = "IlKodu", required = true, type = Integer.class, nillable = true)
    protected Integer ilKodu;
    @XmlElement(name = "Ilce")
    protected String ilce;
    @XmlElement(name = "IlceKodu", required = true, type = Integer.class, nillable = true)
    protected Integer ilceKodu;
    @XmlElement(name = "KatNo")
    protected String katNo;
    @XmlElement(name = "Koy")
    protected String koy;
    @XmlElement(name = "KoyKayitNo", required = true, type = Long.class, nillable = true)
    protected Long koyKayitNo;
    @XmlElement(name = "KoyKodu", required = true, type = Long.class, nillable = true)
    protected Long koyKodu;
    @XmlElement(name = "Mahalle")
    protected String mahalle;
    @XmlElement(name = "MahalleKodu", required = true, type = Integer.class, nillable = true)
    protected Integer mahalleKodu;
    @XmlElement(name = "TapuBagimsizBolumNo")
    protected String tapuBagimsizBolumNo;
    @XmlElement(name = "YapiKullanimAmac")
    protected Parametre yapiKullanimAmac;
    @XmlElement(name = "YolAltiKatSayisi", required = true, type = Integer.class, nillable = true)
    protected Integer yolAltiKatSayisi;
    @XmlElement(name = "YolUstuKatSayisi", required = true, type = Integer.class, nillable = true)
    protected Integer yolUstuKatSayisi;

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
     * Gets the value of the bagimsizBolumDurum property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getBagimsizBolumDurum() {
        return bagimsizBolumDurum;
    }

    /**
     * Sets the value of the bagimsizBolumDurum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setBagimsizBolumDurum(Parametre value) {
        this.bagimsizBolumDurum = value;
    }

    /**
     * Gets the value of the bagimsizBolumTipi property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getBagimsizBolumTipi() {
        return bagimsizBolumTipi;
    }

    /**
     * Sets the value of the bagimsizBolumTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setBagimsizBolumTipi(Parametre value) {
        this.bagimsizBolumTipi = value;
    }

    /**
     * Gets the value of the binaAda property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaAda() {
        return binaAda;
    }

    /**
     * Sets the value of the binaAda property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaAda(String value) {
        this.binaAda = value;
    }

    /**
     * Gets the value of the binaBlokAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaBlokAdi() {
        return binaBlokAdi;
    }

    /**
     * Sets the value of the binaBlokAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaBlokAdi(String value) {
        this.binaBlokAdi = value;
    }

    /**
     * Gets the value of the binaDurum property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getBinaDurum() {
        return binaDurum;
    }

    /**
     * Sets the value of the binaDurum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setBinaDurum(Parametre value) {
        this.binaDurum = value;
    }

    /**
     * Gets the value of the binaKodu property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBinaKodu() {
        return binaKodu;
    }

    /**
     * Sets the value of the binaKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBinaKodu(Long value) {
        this.binaKodu = value;
    }

    /**
     * Gets the value of the binaNo property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBinaNo() {
        return binaNo;
    }

    /**
     * Sets the value of the binaNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBinaNo(Integer value) {
        this.binaNo = value;
    }

    /**
     * Gets the value of the binaNumaratajTipi property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getBinaNumaratajTipi() {
        return binaNumaratajTipi;
    }

    /**
     * Sets the value of the binaNumaratajTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setBinaNumaratajTipi(Parametre value) {
        this.binaNumaratajTipi = value;
    }

    /**
     * Gets the value of the binaPafta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaPafta() {
        return binaPafta;
    }

    /**
     * Sets the value of the binaPafta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaPafta(String value) {
        this.binaPafta = value;
    }

    /**
     * Gets the value of the binaParsel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaParsel() {
        return binaParsel;
    }

    /**
     * Sets the value of the binaParsel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaParsel(String value) {
        this.binaParsel = value;
    }

    /**
     * Gets the value of the binaSiteAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaSiteAdi() {
        return binaSiteAdi;
    }

    /**
     * Sets the value of the binaSiteAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaSiteAdi(String value) {
        this.binaSiteAdi = value;
    }

    /**
     * Gets the value of the binaYapiTipi property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getBinaYapiTipi() {
        return binaYapiTipi;
    }

    /**
     * Sets the value of the binaYapiTipi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setBinaYapiTipi(Parametre value) {
        this.binaYapiTipi = value;
    }

    /**
     * Gets the value of the bucak property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBucak() {
        return bucak;
    }

    /**
     * Sets the value of the bucak property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBucak(String value) {
        this.bucak = value;
    }

    /**
     * Gets the value of the bucakKodu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getBucakKodu() {
        return bucakKodu;
    }

    /**
     * Sets the value of the bucakKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setBucakKodu(Integer value) {
        this.bucakKodu = value;
    }

    /**
     * Gets the value of the csbm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCsbm() {
        return csbm;
    }

    /**
     * Sets the value of the csbm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCsbm(String value) {
        this.csbm = value;
    }

    /**
     * Gets the value of the csbmKodu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCsbmKodu() {
        return csbmKodu;
    }

    /**
     * Sets the value of the csbmKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCsbmKodu(Integer value) {
        this.csbmKodu = value;
    }

    /**
     * Gets the value of the disKapiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisKapiNo() {
        return disKapiNo;
    }

    /**
     * Sets the value of the disKapiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisKapiNo(String value) {
        this.disKapiNo = value;
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
     * Gets the value of the icKapiNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIcKapiNo() {
        return icKapiNo;
    }

    /**
     * Sets the value of the icKapiNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIcKapiNo(String value) {
        this.icKapiNo = value;
    }

    /**
     * Gets the value of the il property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIl() {
        return il;
    }

    /**
     * Sets the value of the il property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIl(String value) {
        this.il = value;
    }

    /**
     * Gets the value of the ilKodu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIlKodu() {
        return ilKodu;
    }

    /**
     * Sets the value of the ilKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIlKodu(Integer value) {
        this.ilKodu = value;
    }

    /**
     * Gets the value of the ilce property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlce() {
        return ilce;
    }

    /**
     * Sets the value of the ilce property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlce(String value) {
        this.ilce = value;
    }

    /**
     * Gets the value of the ilceKodu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIlceKodu() {
        return ilceKodu;
    }

    /**
     * Sets the value of the ilceKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIlceKodu(Integer value) {
        this.ilceKodu = value;
    }

    /**
     * Gets the value of the katNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKatNo() {
        return katNo;
    }

    /**
     * Sets the value of the katNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKatNo(String value) {
        this.katNo = value;
    }

    /**
     * Gets the value of the koy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKoy() {
        return koy;
    }

    /**
     * Sets the value of the koy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKoy(String value) {
        this.koy = value;
    }

    /**
     * Gets the value of the koyKayitNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoyKayitNo() {
        return koyKayitNo;
    }

    /**
     * Sets the value of the koyKayitNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoyKayitNo(Long value) {
        this.koyKayitNo = value;
    }

    /**
     * Gets the value of the koyKodu property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKoyKodu() {
        return koyKodu;
    }

    /**
     * Sets the value of the koyKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKoyKodu(Long value) {
        this.koyKodu = value;
    }

    /**
     * Gets the value of the mahalle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMahalle() {
        return mahalle;
    }

    /**
     * Sets the value of the mahalle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMahalle(String value) {
        this.mahalle = value;
    }

    /**
     * Gets the value of the mahalleKodu property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMahalleKodu() {
        return mahalleKodu;
    }

    /**
     * Sets the value of the mahalleKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMahalleKodu(Integer value) {
        this.mahalleKodu = value;
    }

    /**
     * Gets the value of the tapuBagimsizBolumNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTapuBagimsizBolumNo() {
        return tapuBagimsizBolumNo;
    }

    /**
     * Sets the value of the tapuBagimsizBolumNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTapuBagimsizBolumNo(String value) {
        this.tapuBagimsizBolumNo = value;
    }

    /**
     * Gets the value of the yapiKullanimAmac property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getYapiKullanimAmac() {
        return yapiKullanimAmac;
    }

    /**
     * Sets the value of the yapiKullanimAmac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setYapiKullanimAmac(Parametre value) {
        this.yapiKullanimAmac = value;
    }

    /**
     * Gets the value of the yolAltiKatSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYolAltiKatSayisi() {
        return yolAltiKatSayisi;
    }

    /**
     * Sets the value of the yolAltiKatSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYolAltiKatSayisi(Integer value) {
        this.yolAltiKatSayisi = value;
    }

    /**
     * Gets the value of the yolUstuKatSayisi property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getYolUstuKatSayisi() {
        return yolUstuKatSayisi;
    }

    /**
     * Sets the value of the yolUstuKatSayisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setYolUstuKatSayisi(Integer value) {
        this.yolUstuKatSayisi = value;
    }

}
