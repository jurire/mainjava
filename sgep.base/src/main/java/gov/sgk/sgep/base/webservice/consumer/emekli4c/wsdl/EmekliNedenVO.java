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
 * <p>Java class for emekliNedenVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="emekliNedenVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nedenKodu" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nedenKoduAciklama" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "emekliNedenVO", propOrder = {
    "nedenKodu",
    "nedenKoduAciklama"
})
public class EmekliNedenVO {

    protected String nedenKodu;
    protected String nedenKoduAciklama;

    /**
     * Gets the value of the nedenKodu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNedenKodu() {
        return nedenKodu;
    }

    /**
     * Sets the value of the nedenKodu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNedenKodu(String value) {
        this.nedenKodu = value;
    }

    /**
     * Gets the value of the nedenKoduAciklama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNedenKoduAciklama() {
        return nedenKoduAciklama;
    }

    /**
     * Sets the value of the nedenKoduAciklama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNedenKoduAciklama(String value) {
        this.nedenKoduAciklama = value;
    }

}
