
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
 *         &lt;element name="KimlikNodanYerlesimYeriAdresBilgisiSorgulaResult" type="{http://sgknet/SGKKPSWebServis}KimlikNoileKisiAdresBilgileriSonucu" minOccurs="0"/>
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
    "kimlikNodanYerlesimYeriAdresBilgisiSorgulaResult"
})
@XmlRootElement(name = "KimlikNodanYerlesimYeriAdresBilgisiSorgulaResponse")
public class KimlikNodanYerlesimYeriAdresBilgisiSorgulaResponse {

    @XmlElement(name = "KimlikNodanYerlesimYeriAdresBilgisiSorgulaResult")
    protected KimlikNoileKisiAdresBilgileriSonucu kimlikNodanYerlesimYeriAdresBilgisiSorgulaResult;

    /**
     * Gets the value of the kimlikNodanYerlesimYeriAdresBilgisiSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link KimlikNoileKisiAdresBilgileriSonucu }
     *     
     */
    public KimlikNoileKisiAdresBilgileriSonucu getKimlikNodanYerlesimYeriAdresBilgisiSorgulaResult() {
        return kimlikNodanYerlesimYeriAdresBilgisiSorgulaResult;
    }

    /**
     * Sets the value of the kimlikNodanYerlesimYeriAdresBilgisiSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link KimlikNoileKisiAdresBilgileriSonucu }
     *     
     */
    public void setKimlikNodanYerlesimYeriAdresBilgisiSorgulaResult(KimlikNoileKisiAdresBilgileriSonucu value) {
        this.kimlikNodanYerlesimYeriAdresBilgisiSorgulaResult = value;
    }

}
