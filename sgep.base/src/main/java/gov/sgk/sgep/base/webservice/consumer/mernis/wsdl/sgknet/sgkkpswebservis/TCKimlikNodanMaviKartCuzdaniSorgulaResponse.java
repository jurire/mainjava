
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
 *         &lt;element name="TCKimlikNodanMaviKartCuzdaniSorgulaResult" type="{http://sgknet/SGKKPSWebServis}MaviKartBilgisiSonucu" minOccurs="0"/>
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
    "tcKimlikNodanMaviKartCuzdaniSorgulaResult"
})
@XmlRootElement(name = "TCKimlikNodanMaviKartCuzdaniSorgulaResponse")
public class TCKimlikNodanMaviKartCuzdaniSorgulaResponse {

    @XmlElement(name = "TCKimlikNodanMaviKartCuzdaniSorgulaResult")
    protected MaviKartBilgisiSonucu tcKimlikNodanMaviKartCuzdaniSorgulaResult;

    /**
     * Gets the value of the tcKimlikNodanMaviKartCuzdaniSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link MaviKartBilgisiSonucu }
     *     
     */
    public MaviKartBilgisiSonucu getTCKimlikNodanMaviKartCuzdaniSorgulaResult() {
        return tcKimlikNodanMaviKartCuzdaniSorgulaResult;
    }

    /**
     * Sets the value of the tcKimlikNodanMaviKartCuzdaniSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaviKartBilgisiSonucu }
     *     
     */
    public void setTCKimlikNodanMaviKartCuzdaniSorgulaResult(MaviKartBilgisiSonucu value) {
        this.tcKimlikNodanMaviKartCuzdaniSorgulaResult = value;
    }

}
