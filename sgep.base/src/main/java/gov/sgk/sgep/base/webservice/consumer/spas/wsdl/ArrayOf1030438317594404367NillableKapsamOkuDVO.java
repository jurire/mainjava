//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 02:19:55 PM EET 
//


package gov.sgk.sgep.base.webservice.consumer.spas.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf_1030438317_594404367_nillable_KapsamOkuDVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_1030438317_594404367_nillable_KapsamOkuDVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="KapsamOkuDVO" type="{http://dvo.spas.sgk.gov.tr}KapsamOkuDVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_1030438317_594404367_nillable_KapsamOkuDVO", propOrder = {
    "kapsamOkuDVO"
})
public class ArrayOf1030438317594404367NillableKapsamOkuDVO {

    @XmlElement(name = "KapsamOkuDVO", nillable = true)
    protected List<KapsamOkuDVO> kapsamOkuDVO;

    /**
     * Gets the value of the kapsamOkuDVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the kapsamOkuDVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getKapsamOkuDVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link KapsamOkuDVO }
     * 
     * 
     */
    public List<KapsamOkuDVO> getKapsamOkuDVO() {
        if (kapsamOkuDVO == null) {
            kapsamOkuDVO = new ArrayList<KapsamOkuDVO>();
        }
        return this.kapsamOkuDVO;
    }

}
