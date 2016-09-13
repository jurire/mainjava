
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfKayitYerindenKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfKayitYerindenKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KayitYerindenKisiBilgisi" type="{http://sgknet/SGKKPSWebServis}KayitYerindenKisiBilgisi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKayitYerindenKisiBilgisi", propOrder = {
    "kayitYerindenKisiBilgisi"
})
public class ArrayOfKayitYerindenKisiBilgisi {

    @XmlElement(name = "KayitYerindenKisiBilgisi", nillable = true)
    protected List<KayitYerindenKisiBilgisi> kayitYerindenKisiBilgisi;

    /**
     * Gets the value of the kayitYerindenKisiBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kayitYerindenKisiBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKayitYerindenKisiBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KayitYerindenKisiBilgisi }
     * 
     * 
     */
    public List<KayitYerindenKisiBilgisi> getKayitYerindenKisiBilgisi() {
        if (kayitYerindenKisiBilgisi == null) {
            kayitYerindenKisiBilgisi = new ArrayList<KayitYerindenKisiBilgisi>();
        }
        return this.kayitYerindenKisiBilgisi;
    }

}
