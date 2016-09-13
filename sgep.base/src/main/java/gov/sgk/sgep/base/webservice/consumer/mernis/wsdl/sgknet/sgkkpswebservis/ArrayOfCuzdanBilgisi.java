
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nscuzdansorgulatckimlikno.CuzdanBilgisi;


/**
 * <p>Java class for ArrayOfCuzdanBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfCuzdanBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CuzdanBilgisi" type="{NSCuzdanSorgulaTCKimlikNo}CuzdanBilgisi" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfCuzdanBilgisi", propOrder = {
    "cuzdanBilgisi"
})
public class ArrayOfCuzdanBilgisi {

    @XmlElement(name = "CuzdanBilgisi", nillable = true)
    protected List<CuzdanBilgisi> cuzdanBilgisi;

    /**
     * Gets the value of the cuzdanBilgisi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cuzdanBilgisi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCuzdanBilgisi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CuzdanBilgisi }
     * 
     * 
     */
    public List<CuzdanBilgisi> getCuzdanBilgisi() {
        if (cuzdanBilgisi == null) {
            cuzdanBilgisi = new ArrayList<CuzdanBilgisi>();
        }
        return this.cuzdanBilgisi;
    }

}
