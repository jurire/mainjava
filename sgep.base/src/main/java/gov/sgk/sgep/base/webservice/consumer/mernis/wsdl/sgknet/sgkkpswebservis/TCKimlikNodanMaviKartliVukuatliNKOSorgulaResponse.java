
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
 *         &lt;element name="TCKimlikNodanMaviKartliVukuatliNKOSorgulaResult" type="{http://sgknet/SGKKPSWebServis}NkoMaviKartSonucu" minOccurs="0"/>
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
    "tcKimlikNodanMaviKartliVukuatliNKOSorgulaResult"
})
@XmlRootElement(name = "TCKimlikNodanMaviKartliVukuatliNKOSorgulaResponse")
public class TCKimlikNodanMaviKartliVukuatliNKOSorgulaResponse {

    @XmlElement(name = "TCKimlikNodanMaviKartliVukuatliNKOSorgulaResult")
    protected NkoMaviKartSonucu tcKimlikNodanMaviKartliVukuatliNKOSorgulaResult;

    /**
     * Gets the value of the tcKimlikNodanMaviKartliVukuatliNKOSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link NkoMaviKartSonucu }
     *     
     */
    public NkoMaviKartSonucu getTCKimlikNodanMaviKartliVukuatliNKOSorgulaResult() {
        return tcKimlikNodanMaviKartliVukuatliNKOSorgulaResult;
    }

    /**
     * Sets the value of the tcKimlikNodanMaviKartliVukuatliNKOSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NkoMaviKartSonucu }
     *     
     */
    public void setTCKimlikNodanMaviKartliVukuatliNKOSorgulaResult(NkoMaviKartSonucu value) {
        this.tcKimlikNodanMaviKartliVukuatliNKOSorgulaResult = value;
    }

}
