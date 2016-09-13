
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
 *         &lt;element name="TCKimlikNodanVukuatsizNKOSorgulaResult" type="{http://sgknet/SGKKPSWebServis}NkoSonucu" minOccurs="0"/>
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
    "tcKimlikNodanVukuatsizNKOSorgulaResult"
})
@XmlRootElement(name = "TCKimlikNodanVukuatsizNKOSorgulaResponse")
public class TCKimlikNodanVukuatsizNKOSorgulaResponse {

    @XmlElement(name = "TCKimlikNodanVukuatsizNKOSorgulaResult")
    protected NkoSonucu tcKimlikNodanVukuatsizNKOSorgulaResult;

    /**
     * Gets the value of the tcKimlikNodanVukuatsizNKOSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link NkoSonucu }
     *     
     */
    public NkoSonucu getTCKimlikNodanVukuatsizNKOSorgulaResult() {
        return tcKimlikNodanVukuatsizNKOSorgulaResult;
    }

    /**
     * Sets the value of the tcKimlikNodanVukuatsizNKOSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NkoSonucu }
     *     
     */
    public void setTCKimlikNodanVukuatsizNKOSorgulaResult(NkoSonucu value) {
        this.tcKimlikNodanVukuatsizNKOSorgulaResult = value;
    }

}
