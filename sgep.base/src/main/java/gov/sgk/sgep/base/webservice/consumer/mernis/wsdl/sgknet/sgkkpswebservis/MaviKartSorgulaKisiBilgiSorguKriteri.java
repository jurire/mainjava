
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nskisibilgisindenkimlikbilgisisorgula.CstCinsiyet;


/**
 * <p>Java class for MaviKartSorgulaKisiBilgiSorguKriteri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaviKartSorgulaKisiBilgiSorguKriteri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="Ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AnneAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BabaAd" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Cinsiyet" type="{NSKisiBilgisindenKimlikBilgisiSorgula}CstCinsiyet"/>
 *         &lt;element name="DogumAy" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DogumGun" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="DogumYer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DogumYil" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="Soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaviKartSorgulaKisiBilgiSorguKriteri", propOrder = {
    "extensionData",
    "ad",
    "anneAd",
    "babaAd",
    "cinsiyet",
    "dogumAy",
    "dogumGun",
    "dogumYer",
    "dogumYil",
    "soyad"
})
public class MaviKartSorgulaKisiBilgiSorguKriteri {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "Ad")
    protected String ad;
    @XmlElement(name = "AnneAd")
    protected String anneAd;
    @XmlElement(name = "BabaAd")
    protected String babaAd;
    @XmlElement(name = "Cinsiyet", required = true, nillable = true)
    @XmlSchemaType(name = "string")
    protected CstCinsiyet cinsiyet;
    @XmlElement(name = "DogumAy", required = true, type = Integer.class, nillable = true)
    protected Integer dogumAy;
    @XmlElement(name = "DogumGun", required = true, type = Integer.class, nillable = true)
    protected Integer dogumGun;
    @XmlElement(name = "DogumYer")
    protected String dogumYer;
    @XmlElement(name = "DogumYil", required = true, type = Integer.class, nillable = true)
    protected Integer dogumYil;
    @XmlElement(name = "Soyad")
    protected String soyad;

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
     * Gets the value of the cinsiyet property.
     * 
     * @return
     *     possible object is
     *     {@link CstCinsiyet }
     *     
     */
    public CstCinsiyet getCinsiyet() {
        return cinsiyet;
    }

    /**
     * Sets the value of the cinsiyet property.
     * 
     * @param value
     *     allowed object is
     *     {@link CstCinsiyet }
     *     
     */
    public void setCinsiyet(CstCinsiyet value) {
        this.cinsiyet = value;
    }

    /**
     * Gets the value of the dogumAy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDogumAy() {
        return dogumAy;
    }

    /**
     * Sets the value of the dogumAy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDogumAy(Integer value) {
        this.dogumAy = value;
    }

    /**
     * Gets the value of the dogumGun property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDogumGun() {
        return dogumGun;
    }

    /**
     * Sets the value of the dogumGun property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDogumGun(Integer value) {
        this.dogumGun = value;
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
     * Gets the value of the dogumYil property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getDogumYil() {
        return dogumYil;
    }

    /**
     * Sets the value of the dogumYil property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setDogumYil(Integer value) {
        this.dogumYil = value;
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

}
