
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
 *         &lt;element name="VatandasOlayTarihSorgulaResult" type="{http://sgknet/SGKKPSWebServis}VatandasOlayTarihSonucu" minOccurs="0"/>
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
    "vatandasOlayTarihSorgulaResult"
})
@XmlRootElement(name = "VatandasOlayTarihSorgulaResponse")
public class VatandasOlayTarihSorgulaResponse {

    @XmlElement(name = "VatandasOlayTarihSorgulaResult")
    protected VatandasOlayTarihSonucu vatandasOlayTarihSorgulaResult;

    /**
     * Gets the value of the vatandasOlayTarihSorgulaResult property.
     * 
     * @return
     *     possible object is
     *     {@link VatandasOlayTarihSonucu }
     *     
     */
    public VatandasOlayTarihSonucu getVatandasOlayTarihSorgulaResult() {
        return vatandasOlayTarihSorgulaResult;
    }

    /**
     * Sets the value of the vatandasOlayTarihSorgulaResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link VatandasOlayTarihSonucu }
     *     
     */
    public void setVatandasOlayTarihSorgulaResult(VatandasOlayTarihSonucu value) {
        this.vatandasOlayTarihSorgulaResult = value;
    }

}
