
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
 *         &lt;element name="YabanciKimlikNodanYabanciKisiBilgisiSorgulaResult" type="{http://sgknet/SGKKPSWebServis}YbKimlikNoIleYbKisiBilgisiSonucu" minOccurs="0"/>
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
    "yabanciKimlikNodanYabanciKisiBilgisiSorgulaResult"
})
@XmlRootElement(name = "YabanciKimlikNodanYabanciKisiBilgisiSorgulaResponse")
public class YabanciKimlikNodanYabanciKisiBilgisiSorgulaResponse {

    @XmlElement(name = "YabanciKimlikNodanYabanciKisiBilgisiSorgulaResult")
    protected YbKimlikNoIleYbKisiBilgisiSonucu yabanciKimlikNodanYabanciKisiBilgisiSorgulaResult;

    /**
     * Gets the value of the yabanciKimlikNodanYabanciKisiBilgisiSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link YbKimlikNoIleYbKisiBilgisiSonucu }
     *     
     */
    public YbKimlikNoIleYbKisiBilgisiSonucu getYabanciKimlikNodanYabanciKisiBilgisiSorgulaResult() {
        return yabanciKimlikNodanYabanciKisiBilgisiSorgulaResult;
    }

    /**
     * Sets the value of the yabanciKimlikNodanYabanciKisiBilgisiSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link YbKimlikNoIleYbKisiBilgisiSonucu }
     *     
     */
    public void setYabanciKimlikNodanYabanciKisiBilgisiSorgulaResult(YbKimlikNoIleYbKisiBilgisiSonucu value) {
        this.yabanciKimlikNodanYabanciKisiBilgisiSorgulaResult = value;
    }

}
