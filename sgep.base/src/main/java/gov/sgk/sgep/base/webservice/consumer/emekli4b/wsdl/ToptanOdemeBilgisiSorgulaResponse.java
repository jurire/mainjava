//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 03:44:27 PM EET 
//


package gov.sgk.sgep.base.webservice.consumer.emekli4b.wsdl;

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
 *         &lt;element name="toptanOdemeBilgisiSorgulaReturn" type="{http://pojo.webServisler.emektar.sgk.gov.tr}ToptanOdemeDurumBilgiForm"/>
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
    "toptanOdemeBilgisiSorgulaReturn"
})
@XmlRootElement(name = "toptanOdemeBilgisiSorgulaResponse")
public class ToptanOdemeBilgisiSorgulaResponse {

    @XmlElement(required = true, nillable = true)
    protected ToptanOdemeDurumBilgiForm toptanOdemeBilgisiSorgulaReturn;

    /**
     * Gets the value of the toptanOdemeBilgisiSorgulaReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ToptanOdemeDurumBilgiForm }
     *     
     */
    public ToptanOdemeDurumBilgiForm getToptanOdemeBilgisiSorgulaReturn() {
        return toptanOdemeBilgisiSorgulaReturn;
    }

    /**
     * Sets the value of the toptanOdemeBilgisiSorgulaReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ToptanOdemeDurumBilgiForm }
     *     
     */
    public void setToptanOdemeBilgisiSorgulaReturn(ToptanOdemeDurumBilgiForm value) {
        this.toptanOdemeBilgisiSorgulaReturn = value;
    }

}
