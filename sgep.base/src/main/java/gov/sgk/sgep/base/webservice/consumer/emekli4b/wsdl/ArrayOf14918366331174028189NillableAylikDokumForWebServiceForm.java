//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 03:44:27 PM EET 
//


package gov.sgk.sgep.base.webservice.consumer.emekli4b.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOf_1491836633_1174028189_nillable_AylikDokumForWebServiceForm complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOf_1491836633_1174028189_nillable_AylikDokumForWebServiceForm">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AylikDokumForWebServiceForm" type="{http://pojo.webServisler.emektar.sgk.gov.tr}AylikDokumForWebServiceForm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOf_1491836633_1174028189_nillable_AylikDokumForWebServiceForm", propOrder = {
    "aylikDokumForWebServiceForm"
})
public class ArrayOf14918366331174028189NillableAylikDokumForWebServiceForm {

    @XmlElement(name = "AylikDokumForWebServiceForm", nillable = true)
    protected List<AylikDokumForWebServiceForm> aylikDokumForWebServiceForm;

    /**
     * Gets the value of the aylikDokumForWebServiceForm property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aylikDokumForWebServiceForm property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAylikDokumForWebServiceForm().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AylikDokumForWebServiceForm }
     * 
     * 
     */
    public List<AylikDokumForWebServiceForm> getAylikDokumForWebServiceForm() {
        if (aylikDokumForWebServiceForm == null) {
            aylikDokumForWebServiceForm = new ArrayList<AylikDokumForWebServiceForm>();
        }
        return this.aylikDokumForWebServiceForm;
    }

}
