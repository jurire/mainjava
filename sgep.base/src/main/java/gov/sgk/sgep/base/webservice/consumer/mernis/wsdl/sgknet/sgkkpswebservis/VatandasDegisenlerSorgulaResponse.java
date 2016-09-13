
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
 *         &lt;element name="VatandasDegisenlerSorgulaResult" type="{http://sgknet/SGKKPSWebServis}VatandasDegisenListesiSonucu" minOccurs="0"/>
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
    "vatandasDegisenlerSorgulaResult"
})
@XmlRootElement(name = "VatandasDegisenlerSorgulaResponse")
public class VatandasDegisenlerSorgulaResponse {

    @XmlElement(name = "VatandasDegisenlerSorgulaResult")
    protected VatandasDegisenListesiSonucu vatandasDegisenlerSorgulaResult;

    /**
     * Gets the value of the vatandasDegisenlerSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link VatandasDegisenListesiSonucu }
     *     
     */
    public VatandasDegisenListesiSonucu getVatandasDegisenlerSorgulaResult() {
        return vatandasDegisenlerSorgulaResult;
    }

    /**
     * Sets the value of the vatandasDegisenlerSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatandasDegisenListesiSonucu }
     *     
     */
    public void setVatandasDegisenlerSorgulaResult(VatandasDegisenListesiSonucu value) {
        this.vatandasDegisenlerSorgulaResult = value;
    }

}
