//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.12 at 02:20:33 PM EET 
//


package gov.sgk.sgep.base.webservice.consumer.meyes.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uniteKod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="uygulamaKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="yetkiKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="minKullaniciKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="genStr1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="genStr2" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uniteKod",
    "uygulamaKodu",
    "yetkiKodu",
    "minKullaniciKodu",
    "genStr1",
    "genStr2"
})
@XmlRootElement(name = "uniteYetkiKullanicilariniGetir")
public class UniteYetkiKullanicilariniGetir {

    @XmlElement(required = true, nillable = true)
    protected String uniteKod;
    @XmlElement(required = true, nillable = true)
    protected String uygulamaKodu;
    @XmlElement(required = true, nillable = true)
    protected String yetkiKodu;
    @XmlElement(required = true, nillable = true)
    protected String minKullaniciKodu;
    @XmlElement(required = true, nillable = true)
    protected String genStr1;
    @XmlElement(required = true, nillable = true)
    protected String genStr2;

    /**
     * Gets the value of the uniteKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniteKod() {
        return uniteKod;
    }

    /**
     * Sets the value of the uniteKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniteKod(String value) {
        this.uniteKod = value;
    }

    /**
     * Gets the value of the uygulamaKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUygulamaKodu() {
        return uygulamaKodu;
    }

    /**
     * Sets the value of the uygulamaKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUygulamaKodu(String value) {
        this.uygulamaKodu = value;
    }

    /**
     * Gets the value of the yetkiKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYetkiKodu() {
        return yetkiKodu;
    }

    /**
     * Sets the value of the yetkiKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYetkiKodu(String value) {
        this.yetkiKodu = value;
    }

    /**
     * Gets the value of the minKullaniciKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinKullaniciKodu() {
        return minKullaniciKodu;
    }

    /**
     * Sets the value of the minKullaniciKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinKullaniciKodu(String value) {
        this.minKullaniciKodu = value;
    }

    /**
     * Gets the value of the genStr1 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenStr1() {
        return genStr1;
    }

    /**
     * Sets the value of the genStr1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenStr1(String value) {
        this.genStr1 = value;
    }

    /**
     * Gets the value of the genStr2 property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenStr2() {
        return genStr2;
    }

    /**
     * Sets the value of the genStr2 property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenStr2(String value) {
        this.genStr2 = value;
    }

}
