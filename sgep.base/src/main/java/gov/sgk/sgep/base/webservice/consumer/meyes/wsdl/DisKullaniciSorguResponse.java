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
 *         &lt;element name="disKullaniciSorguReturn" type="{http://vo.meyes.sgk.gov.tr}DisKullaniciBilgiVO"/&gt;
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
    "disKullaniciSorguReturn"
})
@XmlRootElement(name = "disKullaniciSorguResponse")
public class DisKullaniciSorguResponse {

    @XmlElement(required = true, nillable = true)
    protected DisKullaniciBilgiVO disKullaniciSorguReturn;

    /**
     * Gets the value of the disKullaniciSorguReturn property.
     * 
     * @return
     *     possible object is
     *     {@link DisKullaniciBilgiVO }
     *     
     */
    public DisKullaniciBilgiVO getDisKullaniciSorguReturn() {
        return disKullaniciSorguReturn;
    }

    /**
     * Sets the value of the disKullaniciSorguReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link DisKullaniciBilgiVO }
     *     
     */
    public void setDisKullaniciSorguReturn(DisKullaniciBilgiVO value) {
        this.disKullaniciSorguReturn = value;
    }

}
