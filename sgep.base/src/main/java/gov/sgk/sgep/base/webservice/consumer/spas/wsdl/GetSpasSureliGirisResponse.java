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
 *         &lt;element name="getSpasSureliGirisReturn" type="{http://servisler.spas.sgk.gov.tr}ArrayOf_1030438317_594404367_nillable_SureliKayitListDVO"/>
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
    "getSpasSureliGirisReturn"
})
@XmlRootElement(name = "getSpasSureliGirisResponse")
public class GetSpasSureliGirisResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOf1030438317594404367NillableSureliKayitListDVO getSpasSureliGirisReturn;

    /**
     * Gets the value of the getSpasSureliGirisReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOf1030438317594404367NillableSureliKayitListDVO }
     *     
     */
    public ArrayOf1030438317594404367NillableSureliKayitListDVO getGetSpasSureliGirisReturn() {
        return getSpasSureliGirisReturn;
    }

    /**
     * Sets the value of the getSpasSureliGirisReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOf1030438317594404367NillableSureliKayitListDVO }
     *     
     */
    public void setGetSpasSureliGirisReturn(ArrayOf1030438317594404367NillableSureliKayitListDVO value) {
        this.getSpasSureliGirisReturn = value;
    }

}