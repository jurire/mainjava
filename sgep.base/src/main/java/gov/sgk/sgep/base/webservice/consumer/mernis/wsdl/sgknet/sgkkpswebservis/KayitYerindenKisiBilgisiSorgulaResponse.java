
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
 *         &lt;element name="KayitYerindenKisiBilgisiSorgulaResult" type="{http://sgknet/SGKKPSWebServis}KayitYerindenKisiBilgisiSonucu" minOccurs="0"/>
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
    "kayitYerindenKisiBilgisiSorgulaResult"
})
@XmlRootElement(name = "KayitYerindenKisiBilgisiSorgulaResponse")
public class KayitYerindenKisiBilgisiSorgulaResponse {

    @XmlElement(name = "KayitYerindenKisiBilgisiSorgulaResult")
    protected KayitYerindenKisiBilgisiSonucu kayitYerindenKisiBilgisiSorgulaResult;

    /**
     * Gets the value of the kayitYerindenKisiBilgisiSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link KayitYerindenKisiBilgisiSonucu }
     *     
     */
    public KayitYerindenKisiBilgisiSonucu getKayitYerindenKisiBilgisiSorgulaResult() {
        return kayitYerindenKisiBilgisiSorgulaResult;
    }

    /**
     * Sets the value of the kayitYerindenKisiBilgisiSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KayitYerindenKisiBilgisiSonucu }
     *     
     */
    public void setKayitYerindenKisiBilgisiSorgulaResult(KayitYerindenKisiBilgisiSonucu value) {
        this.kayitYerindenKisiBilgisiSorgulaResult = value;
    }

}
