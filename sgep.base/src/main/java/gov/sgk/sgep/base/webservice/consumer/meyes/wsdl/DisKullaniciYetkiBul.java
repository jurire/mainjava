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
 *         &lt;element name="kullaniciKodu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="disUygulamaAdi" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="user" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userP" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="userIp" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="updateUser" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "kullaniciKodu",
    "disUygulamaAdi",
    "user",
    "userP",
    "userIp",
    "updateUser"
})
@XmlRootElement(name = "disKullaniciYetkiBul")
public class DisKullaniciYetkiBul {

    @XmlElement(required = true, nillable = true)
    protected String kullaniciKodu;
    @XmlElement(required = true, nillable = true)
    protected String disUygulamaAdi;
    @XmlElement(required = true, nillable = true)
    protected String user;
    @XmlElement(required = true, nillable = true)
    protected String userP;
    @XmlElement(required = true, nillable = true)
    protected String userIp;
    @XmlElement(required = true, nillable = true)
    protected String updateUser;

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
     * Gets the value of the disUygulamaAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisUygulamaAdi() {
        return disUygulamaAdi;
    }

    /**
     * Sets the value of the disUygulamaAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisUygulamaAdi(String value) {
        this.disUygulamaAdi = value;
    }

    /**
     * Gets the value of the user property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUser() {
        return user;
    }

    /**
     * Sets the value of the user property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUser(String value) {
        this.user = value;
    }

    /**
     * Gets the value of the userP property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserP() {
        return userP;
    }

    /**
     * Sets the value of the userP property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserP(String value) {
        this.userP = value;
    }

    /**
     * Gets the value of the userIp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserIp() {
        return userIp;
    }

    /**
     * Sets the value of the userIp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserIp(String value) {
        this.userIp = value;
    }

    /**
     * Gets the value of the updateUser property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUpdateUser() {
        return updateUser;
    }

    /**
     * Sets the value of the updateUser property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUpdateUser(String value) {
        this.updateUser = value;
    }

}
