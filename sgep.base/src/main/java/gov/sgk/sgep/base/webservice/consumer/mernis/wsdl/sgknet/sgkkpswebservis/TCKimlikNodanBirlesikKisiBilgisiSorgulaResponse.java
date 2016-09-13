
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
 *         &lt;element name="TCKimlikNodanBirlesikKisiBilgisiSorgulaResult" type="{http://sgknet/SGKKPSWebServis}BirlesikKisiBilgileriSonucu" minOccurs="0"/>
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
    "tcKimlikNodanBirlesikKisiBilgisiSorgulaResult"
})
@XmlRootElement(name = "TCKimlikNodanBirlesikKisiBilgisiSorgulaResponse")
public class TCKimlikNodanBirlesikKisiBilgisiSorgulaResponse {

    @XmlElement(name = "TCKimlikNodanBirlesikKisiBilgisiSorgulaResult")
    protected BirlesikKisiBilgileriSonucu tcKimlikNodanBirlesikKisiBilgisiSorgulaResult;

    /**
     * Gets the value of the tcKimlikNodanBirlesikKisiBilgisiSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link BirlesikKisiBilgileriSonucu }
     *     
     */
    public BirlesikKisiBilgileriSonucu getTCKimlikNodanBirlesikKisiBilgisiSorgulaResult() {
        return tcKimlikNodanBirlesikKisiBilgisiSorgulaResult;
    }

    /**
     * Sets the value of the tcKimlikNodanBirlesikKisiBilgisiSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link BirlesikKisiBilgileriSonucu }
     *     
     */
    public void setTCKimlikNodanBirlesikKisiBilgisiSorgulaResult(BirlesikKisiBilgileriSonucu value) {
        this.tcKimlikNodanBirlesikKisiBilgisiSorgulaResult = value;
    }

}
