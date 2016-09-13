
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
 *         &lt;element name="YabanciKisiBilgisindenKimlikBilgisiSorgulaResult" type="{http://sgknet/SGKKPSWebServis}KisiBilgisiIleYbKisiBilgisiSonucu" minOccurs="0"/>
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
    "yabanciKisiBilgisindenKimlikBilgisiSorgulaResult"
})
@XmlRootElement(name = "YabanciKisiBilgisindenKimlikBilgisiSorgulaResponse")
public class YabanciKisiBilgisindenKimlikBilgisiSorgulaResponse {

    @XmlElement(name = "YabanciKisiBilgisindenKimlikBilgisiSorgulaResult")
    protected KisiBilgisiIleYbKisiBilgisiSonucu yabanciKisiBilgisindenKimlikBilgisiSorgulaResult;

    /**
     * Gets the value of the yabanciKisiBilgisindenKimlikBilgisiSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link KisiBilgisiIleYbKisiBilgisiSonucu }
     *     
     */
    public KisiBilgisiIleYbKisiBilgisiSonucu getYabanciKisiBilgisindenKimlikBilgisiSorgulaResult() {
        return yabanciKisiBilgisindenKimlikBilgisiSorgulaResult;
    }

    /**
     * Sets the value of the yabanciKisiBilgisindenKimlikBilgisiSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiBilgisiIleYbKisiBilgisiSonucu }
     *     
     */
    public void setYabanciKisiBilgisindenKimlikBilgisiSorgulaResult(KisiBilgisiIleYbKisiBilgisiSonucu value) {
        this.yabanciKisiBilgisindenKimlikBilgisiSorgulaResult = value;
    }

}
