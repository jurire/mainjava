
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.namespacemavikart.MaviKartliKisiBilgisiSonucu;


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
 *         &lt;element name="TCKimlikNodanMaviKartSorgulaResult" type="{NameSpaceMaviKart}MaviKartliKisiBilgisiSonucu" minOccurs="0"/>
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
    "tcKimlikNodanMaviKartSorgulaResult"
})
@XmlRootElement(name = "TCKimlikNodanMaviKartSorgulaResponse")
public class TCKimlikNodanMaviKartSorgulaResponse {

    @XmlElement(name = "TCKimlikNodanMaviKartSorgulaResult")
    protected MaviKartliKisiBilgisiSonucu tcKimlikNodanMaviKartSorgulaResult;

    /**
     * Gets the value of the tcKimlikNodanMaviKartSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link MaviKartliKisiBilgisiSonucu }
     *     
     */
    public MaviKartliKisiBilgisiSonucu getTCKimlikNodanMaviKartSorgulaResult() {
        return tcKimlikNodanMaviKartSorgulaResult;
    }

    /**
     * Sets the value of the tcKimlikNodanMaviKartSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaviKartliKisiBilgisiSonucu }
     *     
     */
    public void setTCKimlikNodanMaviKartSorgulaResult(MaviKartliKisiBilgisiSonucu value) {
        this.tcKimlikNodanMaviKartSorgulaResult = value;
    }

}
