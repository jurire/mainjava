//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 03:59:01 PM EET 
//


package gov.sgk.sgep.base.webservice.consumer.emekli4c.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for tescilAylikBilgisi4CDVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tescilAylikBilgisi4CDVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="adresGorunsunmu" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="aylikBaslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aylikDurdurmaTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="aylikDurumVO" type="{http://ws.emekli4c.intra.sgk/}aylikDurumVO" minOccurs="0"/>
 *         &lt;element name="emekliMaluliyetSinifVO" type="{http://ws.emekli4c.intra.sgk/}emekliMaluliyetSinifVO" minOccurs="0"/>
 *         &lt;element name="sicilNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="soyad" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="yakinlikVO" type="{http://ws.emekli4c.intra.sgk/}yakinlikVO" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tescilAylikBilgisi4CDVO", propOrder = {
    "ad",
    "adresGorunsunmu",
    "aylikBaslangicTarihi",
    "aylikDurdurmaTarihi",
    "aylikDurumVO",
    "emekliMaluliyetSinifVO",
    "sicilNo",
    "soyad",
    "yakinlikVO"
})
public class TescilAylikBilgisi4CDVO {

    protected String ad;
    protected boolean adresGorunsunmu;
    protected String aylikBaslangicTarihi;
    protected String aylikDurdurmaTarihi;
    protected AylikDurumVO aylikDurumVO;
    protected EmekliMaluliyetSinifVO emekliMaluliyetSinifVO;
    protected String sicilNo;
    protected String soyad;
    protected YakinlikVO yakinlikVO;

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
     * Gets the value of the adresGorunsunmu property.
     * 
     */
    public boolean isAdresGorunsunmu() {
        return adresGorunsunmu;
    }

    /**
     * Sets the value of the adresGorunsunmu property.
     * 
     */
    public void setAdresGorunsunmu(boolean value) {
        this.adresGorunsunmu = value;
    }

    /**
     * Gets the value of the aylikBaslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAylikBaslangicTarihi() {
        return aylikBaslangicTarihi;
    }

    /**
     * Sets the value of the aylikBaslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAylikBaslangicTarihi(String value) {
        this.aylikBaslangicTarihi = value;
    }

    /**
     * Gets the value of the aylikDurdurmaTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAylikDurdurmaTarihi() {
        return aylikDurdurmaTarihi;
    }

    /**
     * Sets the value of the aylikDurdurmaTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAylikDurdurmaTarihi(String value) {
        this.aylikDurdurmaTarihi = value;
    }

    /**
     * Gets the value of the aylikDurumVO property.
     * 
     * @return
     *     possible object is
     *     {@link AylikDurumVO }
     *     
     */
    public AylikDurumVO getAylikDurumVO() {
        return aylikDurumVO;
    }

    /**
     * Sets the value of the aylikDurumVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link AylikDurumVO }
     *     
     */
    public void setAylikDurumVO(AylikDurumVO value) {
        this.aylikDurumVO = value;
    }

    /**
     * Gets the value of the emekliMaluliyetSinifVO property.
     * 
     * @return
     *     possible object is
     *     {@link EmekliMaluliyetSinifVO }
     *     
     */
    public EmekliMaluliyetSinifVO getEmekliMaluliyetSinifVO() {
        return emekliMaluliyetSinifVO;
    }

    /**
     * Sets the value of the emekliMaluliyetSinifVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link EmekliMaluliyetSinifVO }
     *     
     */
    public void setEmekliMaluliyetSinifVO(EmekliMaluliyetSinifVO value) {
        this.emekliMaluliyetSinifVO = value;
    }

    /**
     * Gets the value of the sicilNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSicilNo() {
        return sicilNo;
    }

    /**
     * Sets the value of the sicilNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSicilNo(String value) {
        this.sicilNo = value;
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
     * Gets the value of the yakinlikVO property.
     * 
     * @return
     *     possible object is
     *     {@link YakinlikVO }
     *     
     */
    public YakinlikVO getYakinlikVO() {
        return yakinlikVO;
    }

    /**
     * Sets the value of the yakinlikVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link YakinlikVO }
     *     
     */
    public void setYakinlikVO(YakinlikVO value) {
        this.yakinlikVO = value;
    }

}
