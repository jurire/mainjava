
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
 *         &lt;element name="TCKimlikNodanMaviKartliVukuatsizNKOSorgulaResult" type="{http://sgknet/SGKKPSWebServis}NkoMaviKartSonucu" minOccurs="0"/>
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
    "tcKimlikNodanMaviKartliVukuatsizNKOSorgulaResult"
})
@XmlRootElement(name = "TCKimlikNodanMaviKartliVukuatsizNKOSorgulaResponse")
public class TCKimlikNodanMaviKartliVukuatsizNKOSorgulaResponse {

    @XmlElement(name = "TCKimlikNodanMaviKartliVukuatsizNKOSorgulaResult")
    protected NkoMaviKartSonucu tcKimlikNodanMaviKartliVukuatsizNKOSorgulaResult;

    /**
     * Gets the value of the tcKimlikNodanMaviKartliVukuatsizNKOSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link NkoMaviKartSonucu }
     *     
     */
    public NkoMaviKartSonucu getTCKimlikNodanMaviKartliVukuatsizNKOSorgulaResult() {
        return tcKimlikNodanMaviKartliVukuatsizNKOSorgulaResult;
    }

    /**
     * Sets the value of the tcKimlikNodanMaviKartliVukuatsizNKOSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NkoMaviKartSonucu }
     *     
     */
    public void setTCKimlikNodanMaviKartliVukuatsizNKOSorgulaResult(NkoMaviKartSonucu value) {
        this.tcKimlikNodanMaviKartliVukuatsizNKOSorgulaResult = value;
    }

}
