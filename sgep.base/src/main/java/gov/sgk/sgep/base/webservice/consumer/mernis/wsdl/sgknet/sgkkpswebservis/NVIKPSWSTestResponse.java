
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
 *         &lt;element name="NVIKPSWSTestResult" type="{http://sgknet/SGKKPSWebServis}SGKKPSWSCevap" minOccurs="0"/>
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
    "nvikpswsTestResult"
})
@XmlRootElement(name = "NVIKPSWSTestResponse")
public class NVIKPSWSTestResponse {

    @XmlElement(name = "NVIKPSWSTestResult")
    protected SGKKPSWSCevap nvikpswsTestResult;

    /**
     * Gets the value of the nvikpswsTestResult property.
     * 
     * @return
     *     possible object is
     *     {@link SGKKPSWSCevap }
     *     
     */
    public SGKKPSWSCevap getNVIKPSWSTestResult() {
        return nvikpswsTestResult;
    }

    /**
     * Sets the value of the nvikpswsTestResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link SGKKPSWSCevap }
     *     
     */
    public void setNVIKPSWSTestResult(SGKKPSWSCevap value) {
        this.nvikpswsTestResult = value;
    }

}
