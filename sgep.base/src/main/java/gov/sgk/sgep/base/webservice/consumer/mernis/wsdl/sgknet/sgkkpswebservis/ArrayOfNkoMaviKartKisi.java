
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfNkoMaviKartKisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNkoMaviKartKisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NkoMaviKartKisi" type="{http://sgknet/SGKKPSWebServis}NkoMaviKartKisi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNkoMaviKartKisi", propOrder = {
    "nkoMaviKartKisi"
})
public class ArrayOfNkoMaviKartKisi {

    @XmlElement(name = "NkoMaviKartKisi", nillable = true)
    protected List<NkoMaviKartKisi> nkoMaviKartKisi;

    /**
     * Gets the value of the nkoMaviKartKisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nkoMaviKartKisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNkoMaviKartKisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NkoMaviKartKisi }
     * 
     * 
     */
    public List<NkoMaviKartKisi> getNkoMaviKartKisi() {
        if (nkoMaviKartKisi == null) {
            nkoMaviKartKisi = new ArrayList<NkoMaviKartKisi>();
        }
        return this.nkoMaviKartKisi;
    }

}
