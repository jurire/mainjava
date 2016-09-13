
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="parametre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "parametre"
})
@XmlRootElement(name = "ParametreSorgulama")
public class ParametreSorgulama {

    protected String parametre;

    /**
     * Gets the value of the parametre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParametre() {
        return parametre;
    }

    /**
     * Sets the value of the parametre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParametre(String value) {
        this.parametre = value;
    }

}
