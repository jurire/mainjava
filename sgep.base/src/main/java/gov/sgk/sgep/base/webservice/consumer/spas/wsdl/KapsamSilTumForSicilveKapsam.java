//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 02:19:55 PM EET 
//


package gov.sgk.sgep.base.webservice.consumer.spas.wsdl;

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
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sicilNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kapsamID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="uygID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kullaniciKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uygSifre" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sicilNo",
    "kapsamID",
    "uygID",
    "kullaniciKodu",
    "uygSifre"
})
@XmlRootElement(name = "kapsamSilTumForSicilveKapsam")
public class KapsamSilTumForSicilveKapsam {

    @XmlElement(required = true, nillable = true)
    protected String sicilNo;
    protected int kapsamID;
    protected int uygID;
    @XmlElement(required = true, nillable = true)
    protected String kullaniciKodu;
    @XmlElement(required = true, nillable = true)
    protected String uygSifre;

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
     * Gets the value of the kapsamID property.
     * 
     */
    public int getKapsamID() {
        return kapsamID;
    }

    /**
     * Sets the value of the kapsamID property.
     * 
     */
    public void setKapsamID(int value) {
        this.kapsamID = value;
    }

    /**
     * Gets the value of the uygID property.
     * 
     */
    public int getUygID() {
        return uygID;
    }

    /**
     * Sets the value of the uygID property.
     * 
     */
    public void setUygID(int value) {
        this.uygID = value;
    }

    /**
     * Gets the value of the kullaniciKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKullaniciKodu() {
        return kullaniciKodu;
    }

    /**
     * Sets the value of the kullaniciKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKullaniciKodu(String value) {
        this.kullaniciKodu = value;
    }

    /**
     * Gets the value of the uygSifre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUygSifre() {
        return uygSifre;
    }

    /**
     * Sets the value of the uygSifre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUygSifre(String value) {
        this.uygSifre = value;
    }

}
