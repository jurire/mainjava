
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulakayityeri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNkoKisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNkoKisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NkoKisi" type="{NkoSorgulaKayitYeri}NkoKisi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNkoKisi", propOrder = {
    "nkoKisi"
})
public class ArrayOfNkoKisi {

    @XmlElement(name = "NkoKisi", nillable = true)
    protected List<NkoKisi> nkoKisi;

    /**
     * Gets the value of the nkoKisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nkoKisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNkoKisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NkoKisi }
     * 
     * 
     */
    public List<NkoKisi> getNkoKisi() {
        if (nkoKisi == null) {
            nkoKisi = new ArrayList<NkoKisi>();
        }
        return this.nkoKisi;
    }

}
