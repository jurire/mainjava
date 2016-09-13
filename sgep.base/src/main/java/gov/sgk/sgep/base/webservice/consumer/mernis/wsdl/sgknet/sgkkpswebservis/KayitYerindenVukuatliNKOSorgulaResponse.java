
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulakayityeri.NkoSonucu;


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
 *         &lt;element name="KayitYerindenVukuatliNKOSorgulaResult" type="{NkoSorgulaKayitYeri}NkoSonucu" minOccurs="0"/>
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
    "kayitYerindenVukuatliNKOSorgulaResult"
})
@XmlRootElement(name = "KayitYerindenVukuatliNKOSorgulaResponse")
public class KayitYerindenVukuatliNKOSorgulaResponse {

    @XmlElement(name = "KayitYerindenVukuatliNKOSorgulaResult")
    protected NkoSonucu kayitYerindenVukuatliNKOSorgulaResult;

    /**
     * Gets the value of the kayitYerindenVukuatliNKOSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link NkoSonucu }
     *     
     */
    public NkoSonucu getKayitYerindenVukuatliNKOSorgulaResult() {
        return kayitYerindenVukuatliNKOSorgulaResult;
    }

    /**
     * Sets the value of the kayitYerindenVukuatliNKOSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NkoSonucu }
     *     
     */
    public void setKayitYerindenVukuatliNKOSorgulaResult(NkoSonucu value) {
        this.kayitYerindenVukuatliNKOSorgulaResult = value;
    }

}
