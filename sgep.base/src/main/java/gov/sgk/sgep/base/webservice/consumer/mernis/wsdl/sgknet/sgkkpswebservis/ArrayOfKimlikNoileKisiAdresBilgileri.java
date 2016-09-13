
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKimlikNoileKisiAdresBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKimlikNoileKisiAdresBilgileri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KimlikNoileKisiAdresBilgileri" type="{http://sgknet/SGKKPSWebServis}KimlikNoileKisiAdresBilgileri" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKimlikNoileKisiAdresBilgileri", propOrder = {
    "kimlikNoileKisiAdresBilgileri"
})
public class ArrayOfKimlikNoileKisiAdresBilgileri {

    @XmlElement(name = "KimlikNoileKisiAdresBilgileri", nillable = true)
    protected List<KimlikNoileKisiAdresBilgileri> kimlikNoileKisiAdresBilgileri;

    /**
     * Gets the value of the kimlikNoileKisiAdresBilgileri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kimlikNoileKisiAdresBilgileri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKimlikNoileKisiAdresBilgileri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KimlikNoileKisiAdresBilgileri }
     * 
     * 
     */
    public List<KimlikNoileKisiAdresBilgileri> getKimlikNoileKisiAdresBilgileri() {
        if (kimlikNoileKisiAdresBilgileri == null) {
            kimlikNoileKisiAdresBilgileri = new ArrayList<KimlikNoileKisiAdresBilgileri>();
        }
        return this.kimlikNoileKisiAdresBilgileri;
    }

}
