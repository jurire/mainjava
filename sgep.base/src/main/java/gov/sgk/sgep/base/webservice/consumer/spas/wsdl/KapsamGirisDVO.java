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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KapsamGirisDVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KapsamGirisDVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sicilNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kapBitTar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="tcKimlik" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kapsamID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kapBasTar" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="uygID" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="kullaniciKodu" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kapKod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KapsamGirisDVO", namespace = "http://dvo.spas.sgk.gov.tr", propOrder = {
    "sicilNo",
    "kapBitTar",
    "tcKimlik",
    "kapsamID",
    "kapBasTar",
    "uygID",
    "kullaniciKodu",
    "kapKod"
})
public class KapsamGirisDVO {

    @XmlElement(required = true, nillable = true)
    protected String sicilNo;
    @XmlElement(required = true, nillable = true)
    protected String kapBitTar;
    @XmlElement(required = true, nillable = true)
    protected String tcKimlik;
    protected int kapsamID;
    @XmlElement(required = true, nillable = true)
    protected String kapBasTar;
    protected int uygID;
    @XmlElement(required = true, nillable = true)
    protected String kullaniciKodu;
    protected int kapKod;

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
     * Gets the value of the kapBitTar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKapBitTar() {
        return kapBitTar;
    }

    /**
     * Sets the value of the kapBitTar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKapBitTar(String value) {
        this.kapBitTar = value;
    }

    /**
     * Gets the value of the tcKimlik property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTcKimlik() {
        return tcKimlik;
    }

    /**
     * Sets the value of the tcKimlik property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTcKimlik(String value) {
        this.tcKimlik = value;
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
     * Gets the value of the kapBasTar property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKapBasTar() {
        return kapBasTar;
    }

    /**
     * Sets the value of the kapBasTar property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKapBasTar(String value) {
        this.kapBasTar = value;
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
     * Gets the value of the kapKod property.
     * 
     */
    public int getKapKod() {
        return kapKod;
    }

    /**
     * Sets the value of the kapKod property.
     * 
     */
    public void setKapKod(int value) {
        this.kapKod = value;
    }

}
