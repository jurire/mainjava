
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNkoMaviKart complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNkoMaviKart">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NkoMaviKart" type="{http://sgknet/SGKKPSWebServis}NkoMaviKart" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNkoMaviKart", propOrder = {
    "nkoMaviKart"
})
public class ArrayOfNkoMaviKart {

    @XmlElement(name = "NkoMaviKart", nillable = true)
    protected List<NkoMaviKart> nkoMaviKart;

    /**
     * Gets the value of the nkoMaviKart property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nkoMaviKart property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNkoMaviKart().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NkoMaviKart }
     * 
     * 
     */
    public List<NkoMaviKart> getNkoMaviKart() {
        if (nkoMaviKart == null) {
            nkoMaviKart = new ArrayList<NkoMaviKart>();
        }
        return this.nkoMaviKart;
    }

}
