
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

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
 *         &lt;element name="OlayBilgisiSorgulaResult" type="{http://sgknet/SGKKPSWebServis}OlayListesiSonucu" minOccurs="0"/>
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
    "olayBilgisiSorgulaResult"
})
@XmlRootElement(name = "OlayBilgisiSorgulaResponse")
public class OlayBilgisiSorgulaResponse {

    @XmlElement(name = "OlayBilgisiSorgulaResult")
    protected OlayListesiSonucu olayBilgisiSorgulaResult;

    /**
     * Gets the value of the olayBilgisiSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link OlayListesiSonucu }
     *     
     */
    public OlayListesiSonucu getOlayBilgisiSorgulaResult() {
        return olayBilgisiSorgulaResult;
    }

    /**
     * Sets the value of the olayBilgisiSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link OlayListesiSonucu }
     *     
     */
    public void setOlayBilgisiSorgulaResult(OlayListesiSonucu value) {
        this.olayBilgisiSorgulaResult = value;
    }

}
