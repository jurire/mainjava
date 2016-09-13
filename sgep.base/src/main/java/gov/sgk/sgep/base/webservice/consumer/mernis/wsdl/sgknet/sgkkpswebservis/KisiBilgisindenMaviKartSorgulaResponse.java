
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
 *         &lt;element name="KisiBilgisindenMaviKartSorgulaResult" type="{http://sgknet/SGKKPSWebServis}MaviKartliKisiBilgisiSonucu" minOccurs="0"/>
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
    "kisiBilgisindenMaviKartSorgulaResult"
})
@XmlRootElement(name = "KisiBilgisindenMaviKartSorgulaResponse")
public class KisiBilgisindenMaviKartSorgulaResponse {

    @XmlElement(name = "KisiBilgisindenMaviKartSorgulaResult")
    protected MaviKartliKisiBilgisiSonucu kisiBilgisindenMaviKartSorgulaResult;

    /**
     * Gets the value of the kisiBilgisindenMaviKartSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link MaviKartliKisiBilgisiSonucu }
     *     
     */
    public MaviKartliKisiBilgisiSonucu getKisiBilgisindenMaviKartSorgulaResult() {
        return kisiBilgisindenMaviKartSorgulaResult;
    }

    /**
     * Sets the value of the kisiBilgisindenMaviKartSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaviKartliKisiBilgisiSonucu }
     *     
     */
    public void setKisiBilgisindenMaviKartSorgulaResult(MaviKartliKisiBilgisiSonucu value) {
        this.kisiBilgisindenMaviKartSorgulaResult = value;
    }

}
