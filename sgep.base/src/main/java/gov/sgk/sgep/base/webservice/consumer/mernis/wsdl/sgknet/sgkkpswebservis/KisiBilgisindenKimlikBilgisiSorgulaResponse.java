
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
 *         &lt;element name="KisiBilgisindenKimlikBilgisiSorgulaResult" type="{http://sgknet/SGKKPSWebServis}KisiBilgilerindenKisiBilgisiSonucu" minOccurs="0"/>
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
    "kisiBilgisindenKimlikBilgisiSorgulaResult"
})
@XmlRootElement(name = "KisiBilgisindenKimlikBilgisiSorgulaResponse")
public class KisiBilgisindenKimlikBilgisiSorgulaResponse {

    @XmlElement(name = "KisiBilgisindenKimlikBilgisiSorgulaResult")
    protected KisiBilgilerindenKisiBilgisiSonucu kisiBilgisindenKimlikBilgisiSorgulaResult;

    /**
     * Gets the value of the kisiBilgisindenKimlikBilgisiSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link KisiBilgilerindenKisiBilgisiSonucu }
     *     
     */
    public KisiBilgilerindenKisiBilgisiSonucu getKisiBilgisindenKimlikBilgisiSorgulaResult() {
        return kisiBilgisindenKimlikBilgisiSorgulaResult;
    }

    /**
     * Sets the value of the kisiBilgisindenKimlikBilgisiSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiBilgilerindenKisiBilgisiSonucu }
     *     
     */
    public void setKisiBilgisindenKimlikBilgisiSorgulaResult(KisiBilgilerindenKisiBilgisiSonucu value) {
        this.kisiBilgisindenKimlikBilgisiSorgulaResult = value;
    }

}
