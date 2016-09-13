
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfYbKimlikNoIleYbKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfYbKimlikNoIleYbKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="YbKimlikNoIleYbKisiBilgisi" type="{http://sgknet/SGKKPSWebServis}YbKimlikNoIleYbKisiBilgisi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfYbKimlikNoIleYbKisiBilgisi", propOrder = {
    "ybKimlikNoIleYbKisiBilgisi"
})
public class ArrayOfYbKimlikNoIleYbKisiBilgisi {

    @XmlElement(name = "YbKimlikNoIleYbKisiBilgisi", nillable = true)
    protected List<YbKimlikNoIleYbKisiBilgisi> ybKimlikNoIleYbKisiBilgisi;

    /**
     * Gets the value of the ybKimlikNoIleYbKisiBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ybKimlikNoIleYbKisiBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getYbKimlikNoIleYbKisiBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link YbKimlikNoIleYbKisiBilgisi }
     * 
     * 
     */
    public List<YbKimlikNoIleYbKisiBilgisi> getYbKimlikNoIleYbKisiBilgisi() {
        if (ybKimlikNoIleYbKisiBilgisi == null) {
            ybKimlikNoIleYbKisiBilgisi = new ArrayList<YbKimlikNoIleYbKisiBilgisi>();
        }
        return this.ybKimlikNoIleYbKisiBilgisi;
    }

}
