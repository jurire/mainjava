
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
 *         &lt;element name="TCKimlikNodanNufusCuzdaniSorgulaResult" type="{http://sgknet/SGKKPSWebServis}CuzdanBilgisiSonucu" minOccurs="0"/>
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
    "tcKimlikNodanNufusCuzdaniSorgulaResult"
})
@XmlRootElement(name = "TCKimlikNodanNufusCuzdaniSorgulaResponse")
public class TCKimlikNodanNufusCuzdaniSorgulaResponse {

    @XmlElement(name = "TCKimlikNodanNufusCuzdaniSorgulaResult")
    protected CuzdanBilgisiSonucu tcKimlikNodanNufusCuzdaniSorgulaResult;

    /**
     * Gets the value of the tcKimlikNodanNufusCuzdaniSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link CuzdanBilgisiSonucu }
     *     
     */
    public CuzdanBilgisiSonucu getTCKimlikNodanNufusCuzdaniSorgulaResult() {
        return tcKimlikNodanNufusCuzdaniSorgulaResult;
    }

    /**
     * Sets the value of the tcKimlikNodanNufusCuzdaniSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link CuzdanBilgisiSonucu }
     *     
     */
    public void setTCKimlikNodanNufusCuzdaniSorgulaResult(CuzdanBilgisiSonucu value) {
        this.tcKimlikNodanNufusCuzdaniSorgulaResult = value;
    }

}
