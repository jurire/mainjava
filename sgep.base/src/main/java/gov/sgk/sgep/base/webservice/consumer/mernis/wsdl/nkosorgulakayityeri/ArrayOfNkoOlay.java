
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulakayityeri;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNkoOlay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNkoOlay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NkoOlay" type="{NkoSorgulaKayitYeri}NkoOlay" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNkoOlay", propOrder = {
    "nkoOlay"
})
public class ArrayOfNkoOlay {

    @XmlElement(name = "NkoOlay", nillable = true)
    protected List<NkoOlay> nkoOlay;

    /**
     * Gets the value of the nkoOlay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nkoOlay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNkoOlay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NkoOlay }
     * 
     * 
     */
    public List<NkoOlay> getNkoOlay() {
        if (nkoOlay == null) {
            nkoOlay = new ArrayList<NkoOlay>();
        }
        return this.nkoOlay;
    }

}
