
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.namespacemavikart;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfMaviKartliKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfMaviKartliKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MaviKartliKisiBilgisi" type="{NameSpaceMaviKart}MaviKartliKisiBilgisi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfMaviKartliKisiBilgisi", propOrder = {
    "maviKartliKisiBilgisi"
})
public class ArrayOfMaviKartliKisiBilgisi {

    @XmlElement(name = "MaviKartliKisiBilgisi", nillable = true)
    protected List<MaviKartliKisiBilgisi> maviKartliKisiBilgisi;

    /**
     * Gets the value of the maviKartliKisiBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maviKartliKisiBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaviKartliKisiBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaviKartliKisiBilgisi }
     * 
     * 
     */
    public List<MaviKartliKisiBilgisi> getMaviKartliKisiBilgisi() {
        if (maviKartliKisiBilgisi == null) {
            maviKartliKisiBilgisi = new ArrayList<MaviKartliKisiBilgisi>();
        }
        return this.maviKartliKisiBilgisi;
    }

}
