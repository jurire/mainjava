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
 *         &lt;element name="kapsamSilReturn" type="{http://dvo.spas.sgk.gov.tr}CevapDVO"/>
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
    "kapsamSilReturn"
})
@XmlRootElement(name = "kapsamSilResponse")
public class KapsamSilResponse {

    @XmlElement(required = true, nillable = true)
    protected CevapDVO kapsamSilReturn;

    /**
     * Gets the value of the kapsamSilReturn property.
     * 
     * @return
     *     possible object is
     *     {@link CevapDVO }
     *     
     */
    public CevapDVO getKapsamSilReturn() {
        return kapsamSilReturn;
    }

    /**
     * Sets the value of the kapsamSilReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link CevapDVO }
     *     
     */
    public void setKapsamSilReturn(CevapDVO value) {
        this.kapsamSilReturn = value;
    }

}