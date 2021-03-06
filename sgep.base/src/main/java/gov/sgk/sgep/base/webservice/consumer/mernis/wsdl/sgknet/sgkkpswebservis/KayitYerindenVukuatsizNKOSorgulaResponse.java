
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
 *         &lt;element name="KayitYerindenVukuatsizNKOSorgulaResult" type="{NkoSorgulaKayitYeri}NkoSonucu" minOccurs="0"/>
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
    "kayitYerindenVukuatsizNKOSorgulaResult"
})
@XmlRootElement(name = "KayitYerindenVukuatsizNKOSorgulaResponse")
public class KayitYerindenVukuatsizNKOSorgulaResponse {

    @XmlElement(name = "KayitYerindenVukuatsizNKOSorgulaResult")
    protected NkoSonucu kayitYerindenVukuatsizNKOSorgulaResult;

    /**
     * Gets the value of the kayitYerindenVukuatsizNKOSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link NkoSonucu }
     *     
     */
    public NkoSonucu getKayitYerindenVukuatsizNKOSorgulaResult() {
        return kayitYerindenVukuatsizNKOSorgulaResult;
    }

    /**
     * Sets the value of the kayitYerindenVukuatsizNKOSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link NkoSonucu }
     *     
     */
    public void setKayitYerindenVukuatsizNKOSorgulaResult(NkoSonucu value) {
        this.kayitYerindenVukuatsizNKOSorgulaResult = value;
    }

}
