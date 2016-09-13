
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKisiBilgisiIleYbKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKisiBilgisiIleYbKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KisiBilgisiIleYbKisiBilgisi" type="{http://sgknet/SGKKPSWebServis}KisiBilgisiIleYbKisiBilgisi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKisiBilgisiIleYbKisiBilgisi", propOrder = {
    "kisiBilgisiIleYbKisiBilgisi"
})
public class ArrayOfKisiBilgisiIleYbKisiBilgisi {

    @XmlElement(name = "KisiBilgisiIleYbKisiBilgisi", nillable = true)
    protected List<KisiBilgisiIleYbKisiBilgisi> kisiBilgisiIleYbKisiBilgisi;

    /**
     * Gets the value of the kisiBilgisiIleYbKisiBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kisiBilgisiIleYbKisiBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKisiBilgisiIleYbKisiBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KisiBilgisiIleYbKisiBilgisi }
     * 
     * 
     */
    public List<KisiBilgisiIleYbKisiBilgisi> getKisiBilgisiIleYbKisiBilgisi() {
        if (kisiBilgisiIleYbKisiBilgisi == null) {
            kisiBilgisiIleYbKisiBilgisi = new ArrayList<KisiBilgisiIleYbKisiBilgisi>();
        }
        return this.kisiBilgisiIleYbKisiBilgisi;
    }

}
