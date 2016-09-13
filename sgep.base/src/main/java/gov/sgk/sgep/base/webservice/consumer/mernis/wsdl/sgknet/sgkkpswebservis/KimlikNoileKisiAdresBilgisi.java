
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nskimliknodanyerlesimyeriadresbilgisisorgula.Parametre;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nskimliknodanyerlesimyeriadresbilgisisorgula.TarihBilgisi;


/**
 * <p>Java class for KimlikNoileKisiAdresBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KimlikNoileKisiAdresBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="AcikAdres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AdresNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="AdresTip" type="{NSKimlikNodanYerlesimYeriAdresBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="BeldeAdresi" type="{http://sgknet/SGKKPSWebServis}KimlikNoileBeldeAdresi" minOccurs="0"/>
 *         &lt;element name="BeyanTarihi" type="{NSKimlikNodanYerlesimYeriAdresBilgisiSorgula}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="BeyandaBulunanKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HataBilgisi" type="{NSKimlikNodanYerlesimYeriAdresBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="IlIlceMerkezAdresi" type="{http://sgknet/SGKKPSWebServis}KimlikNoileIlIlceMerkezi" minOccurs="0"/>
 *         &lt;element name="KoyAdresi" type="{http://sgknet/SGKKPSWebServis}KimlikNoileKoyAdresi" minOccurs="0"/>
 *         &lt;element name="TasinmaTarihi" type="{NSKimlikNodanYerlesimYeriAdresBilgisiSorgula}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="TescilTarihi" type="{NSKimlikNodanYerlesimYeriAdresBilgisiSorgula}TarihBilgisi" minOccurs="0"/>
 *         &lt;element name="YurtDisiAdresi" type="{http://sgknet/SGKKPSWebServis}KimlikNoileYurtDisiAdresi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KimlikNoileKisiAdresBilgisi", propOrder = {
    "extensionData",
    "acikAdres",
    "adresNo",
    "adresTip",
    "beldeAdresi",
    "beyanTarihi",
    "beyandaBulunanKimlikNo",
    "hataBilgisi",
    "ilIlceMerkezAdresi",
    "koyAdresi",
    "tasinmaTarihi",
    "tescilTarihi",
    "yurtDisiAdresi"
})
public class KimlikNoileKisiAdresBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "AcikAdres")
    protected String acikAdres;
    @XmlElement(name = "AdresNo", required = true, type = Long.class, nillable = true)
    protected Long adresNo;
    @XmlElement(name = "AdresTip")
    protected Parametre adresTip;
    @XmlElement(name = "BeldeAdresi")
    protected KimlikNoileBeldeAdresi beldeAdresi;
    @XmlElement(name = "BeyanTarihi")
    protected TarihBilgisi beyanTarihi;
    @XmlElement(name = "BeyandaBulunanKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long beyandaBulunanKimlikNo;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "IlIlceMerkezAdresi")
    protected KimlikNoileIlIlceMerkezi ilIlceMerkezAdresi;
    @XmlElement(name = "KoyAdresi")
    protected KimlikNoileKoyAdresi koyAdresi;
    @XmlElement(name = "TasinmaTarihi")
    protected TarihBilgisi tasinmaTarihi;
    @XmlElement(name = "TescilTarihi")
    protected TarihBilgisi tescilTarihi;
    @XmlElement(name = "YurtDisiAdresi")
    protected KimlikNoileYurtDisiAdresi yurtDisiAdresi;

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
     * Gets the value of the acikAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcikAdres() {
        return acikAdres;
    }

    /**
     * Sets the value of the acikAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcikAdres(String value) {
        this.acikAdres = value;
    }

    /**
     * Gets the value of the adresNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAdresNo() {
        return adresNo;
    }

    /**
     * Sets the value of the adresNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAdresNo(Long value) {
        this.adresNo = value;
    }

    /**
     * Gets the value of the adresTip property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getAdresTip() {
        return adresTip;
    }

    /**
     * Sets the value of the adresTip property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setAdresTip(Parametre value) {
        this.adresTip = value;
    }

    /**
     * Gets the value of the beldeAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link KimlikNoileBeldeAdresi }
     *     
     */
    public KimlikNoileBeldeAdresi getBeldeAdresi() {
        return beldeAdresi;
    }

    /**
     * Sets the value of the beldeAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KimlikNoileBeldeAdresi }
     *     
     */
    public void setBeldeAdresi(KimlikNoileBeldeAdresi value) {
        this.beldeAdresi = value;
    }

    /**
     * Gets the value of the beyanTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getBeyanTarihi() {
        return beyanTarihi;
    }

    /**
     * Sets the value of the beyanTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setBeyanTarihi(TarihBilgisi value) {
        this.beyanTarihi = value;
    }

    /**
     * Gets the value of the beyandaBulunanKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBeyandaBulunanKimlikNo() {
        return beyandaBulunanKimlikNo;
    }

    /**
     * Sets the value of the beyandaBulunanKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBeyandaBulunanKimlikNo(Long value) {
        this.beyandaBulunanKimlikNo = value;
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
     * Gets the value of the ilIlceMerkezAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link KimlikNoileIlIlceMerkezi }
     *     
     */
    public KimlikNoileIlIlceMerkezi getIlIlceMerkezAdresi() {
        return ilIlceMerkezAdresi;
    }

    /**
     * Sets the value of the ilIlceMerkezAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KimlikNoileIlIlceMerkezi }
     *     
     */
    public void setIlIlceMerkezAdresi(KimlikNoileIlIlceMerkezi value) {
        this.ilIlceMerkezAdresi = value;
    }

    /**
     * Gets the value of the koyAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link KimlikNoileKoyAdresi }
     *     
     */
    public KimlikNoileKoyAdresi getKoyAdresi() {
        return koyAdresi;
    }

    /**
     * Sets the value of the koyAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KimlikNoileKoyAdresi }
     *     
     */
    public void setKoyAdresi(KimlikNoileKoyAdresi value) {
        this.koyAdresi = value;
    }

    /**
     * Gets the value of the tasinmaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getTasinmaTarihi() {
        return tasinmaTarihi;
    }

    /**
     * Sets the value of the tasinmaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setTasinmaTarihi(TarihBilgisi value) {
        this.tasinmaTarihi = value;
    }

    /**
     * Gets the value of the tescilTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link TarihBilgisi }
     *     
     */
    public TarihBilgisi getTescilTarihi() {
        return tescilTarihi;
    }

    /**
     * Sets the value of the tescilTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link TarihBilgisi }
     *     
     */
    public void setTescilTarihi(TarihBilgisi value) {
        this.tescilTarihi = value;
    }

    /**
     * Gets the value of the yurtDisiAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link KimlikNoileYurtDisiAdresi }
     *     
     */
    public KimlikNoileYurtDisiAdresi getYurtDisiAdresi() {
        return yurtDisiAdresi;
    }

    /**
     * Sets the value of the yurtDisiAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KimlikNoileYurtDisiAdresi }
     *     
     */
    public void setYurtDisiAdresi(KimlikNoileYurtDisiAdresi value) {
        this.yurtDisiAdresi = value;
    }

}
