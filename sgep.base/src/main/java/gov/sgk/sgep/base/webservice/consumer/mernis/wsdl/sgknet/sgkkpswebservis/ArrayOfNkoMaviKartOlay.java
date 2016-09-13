
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNkoMaviKartOlay complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNkoMaviKartOlay">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NkoMaviKartOlay" type="{http://sgknet/SGKKPSWebServis}NkoMaviKartOlay" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNkoMaviKartOlay", propOrder = {
    "nkoMaviKartOlay"
})
public class ArrayOfNkoMaviKartOlay {

    @XmlElement(name = "NkoMaviKartOlay", nillable = true)
    protected List<NkoMaviKartOlay> nkoMaviKartOlay;

    /**
     * Gets the value of the nkoMaviKartOlay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nkoMaviKartOlay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNkoMaviKartOlay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NkoMaviKartOlay }
     * 
     * 
     */
    public List<NkoMaviKartOlay> getNkoMaviKartOlay() {
        if (nkoMaviKartOlay == null) {
            nkoMaviKartOlay = new ArrayList<NkoMaviKartOlay>();
        }
        return this.nkoMaviKartOlay;
    }

}
