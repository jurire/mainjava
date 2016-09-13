
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SGKKPSWSCevap complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SGKKPSWSCevap">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Mesaj" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Kod" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SGKKPSWSCevap", propOrder = {
    "mesaj",
    "kod"
})
public class SGKKPSWSCevap {

    @XmlElement(name = "Mesaj")
    protected String mesaj;
    @XmlElement(name = "Kod")
    protected int kod;

    /**
     * Gets the value of the mesaj property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesaj() {
        return mesaj;
    }

    /**
     * Sets the value of the mesaj property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesaj(String value) {
        this.mesaj = value;
    }

    /**
     * Gets the value of the kod property.
     * 
     */
    public int getKod() {
        return kod;
    }

    /**
     * Sets the value of the kod property.
     * 
     */
    public void setKod(int value) {
        this.kod = value;
    }

}
