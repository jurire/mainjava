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
 *         &lt;element name="sureliKayitGirisDVO" type="{http://dvo.spas.sgk.gov.tr}SureliKayitGirisDVO"/>
 *         &lt;element name="uygID" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "sureliKayitGirisDVO",
    "uygID",
    "uygSifre"
})
@XmlRootElement(name = "sureliGirisWithBitisTar")
public class SureliGirisWithBitisTar {

    @XmlElement(required = true, nillable = true)
    protected SureliKayitGirisDVO sureliKayitGirisDVO;
    protected int uygID;
    @XmlElement(required = true, nillable = true)
    protected String uygSifre;

    /**
     * Gets the value of the sureliKayitGirisDVO property.
     * 
     * @return
     *     possible object is
     *     {@link SureliKayitGirisDVO }
     *     
     */
    public SureliKayitGirisDVO getSureliKayitGirisDVO() {
        return sureliKayitGirisDVO;
    }

    /**
     * Sets the value of the sureliKayitGirisDVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link SureliKayitGirisDVO }
     *     
     */
    public void setSureliKayitGirisDVO(SureliKayitGirisDVO value) {
        this.sureliKayitGirisDVO = value;
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
