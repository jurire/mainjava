
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.namespacemavikart;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaviKartliKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaviKartliKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{NameSpaceMaviKart}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="AnneTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BabaTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DogumYerKod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DurumBilgisi" type="{NameSpaceMaviKart}KisiDurumBilgisi" minOccurs="0"/>
 *         &lt;element name="EsTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HataBilgisi" type="{NameSpaceMaviKart}Parametre" minOccurs="0"/>
 *         &lt;element name="KazanilanTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="KimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TemelBilgisi" type="{NameSpaceMaviKart}KisiTemelBilgisi" minOccurs="0"/>
 *         &lt;element name="Ulke" type="{NameSpaceMaviKart}Parametre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaviKartliKisiBilgisi", propOrder = {
    "extensionData",
    "anneTCKimlikNo",
    "babaTCKimlikNo",
    "dogumYerKod",
    "durumBilgisi",
    "esTCKimlikNo",
    "hataBilgisi",
    "kazanilanTCKimlikNo",
    "kimlikNo",
    "temelBilgisi",
    "ulke"
})
public class MaviKartliKisiBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "AnneTCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long anneTCKimlikNo;
    @XmlElement(name = "BabaTCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long babaTCKimlikNo;
    @XmlElement(name = "DogumYerKod", required = true, type = Integer.class, nillable = true)
    protected Integer dogumYerKod;
    @XmlElement(name = "DurumBilgisi")
    protected KisiDurumBilgisi durumBilgisi;
    @XmlElement(name = "EsTCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long esTCKimlikNo;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "KazanilanTCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long kazanilanTCKimlikNo;
    @XmlElement(name = "KimlikNo", required = true, type = Long.class, nillable = true)
    protected Long kimlikNo;
    @XmlElement(name = "TemelBilgisi")
    protected KisiTemelBilgisi temelBilgisi;
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
     * Gets the value of the anneTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnneTCKimlikNo() {
        return anneTCKimlikNo;
    }

    /**
     * Sets the value of the anneTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnneTCKimlikNo(Long value) {
        this.anneTCKimlikNo = value;
    }

    /**
     * Gets the value of the babaTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBabaTCKimlikNo() {
        return babaTCKimlikNo;
    }

    /**
     * Sets the value of the babaTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBabaTCKimlikNo(Long value) {
        this.babaTCKimlikNo = value;
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
     * Gets the value of the durumBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link KisiDurumBilgisi }
     *     
     */
    public KisiDurumBilgisi getDurumBilgisi() {
        return durumBilgisi;
    }

    /**
     * Sets the value of the durumBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiDurumBilgisi }
     *     
     */
    public void setDurumBilgisi(KisiDurumBilgisi value) {
        this.durumBilgisi = value;
    }

    /**
     * Gets the value of the esTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEsTCKimlikNo() {
        return esTCKimlikNo;
    }

    /**
     * Sets the value of the esTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEsTCKimlikNo(Long value) {
        this.esTCKimlikNo = value;
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
     * Gets the value of the temelBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link KisiTemelBilgisi }
     *     
     */
    public KisiTemelBilgisi getTemelBilgisi() {
        return temelBilgisi;
    }

    /**
     * Sets the value of the temelBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiTemelBilgisi }
     *     
     */
    public void setTemelBilgisi(KisiTemelBilgisi value) {
        this.temelBilgisi = value;
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
