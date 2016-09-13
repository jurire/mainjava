
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
 *         &lt;element name="TCKimlikNodanVukuatliNKOSorgulaResult" type="{http://sgknet/SGKKPSWebServis}NkoSonucu" minOccurs="0"/>
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
    "tcKimlikNodanVukuatliNKOSorgulaResult"
})
@XmlRootElement(name = "TCKimlikNodanVukuatliNKOSorgulaResponse")
public class TCKimlikNodanVukuatliNKOSorgulaResponse {

    @XmlElement(name = "TCKimlikNodanVukuatliNKOSorgulaResult")
    protected NkoSonucu tcKimlikNodanVukuatliNKOSorgulaResult;

    /**
     * Gets the value of the tcKimlikNodanVukuatliNKOSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link NkoSonucu }
     *     
     */
    public NkoSonucu getTCKimlikNodanVukuatliNKOSorgulaResult() {
        return tcKimlikNodanVukuatliNKOSorgulaResult;
    }

    /**
     * Sets the value of the tcKimlikNodanVukuatliNKOSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NkoSonucu }
     *     
     */
    public void setTCKimlikNodanVukuatliNKOSorgulaResult(NkoSonucu value) {
        this.tcKimlikNodanVukuatliNKOSorgulaResult = value;
    }

}
