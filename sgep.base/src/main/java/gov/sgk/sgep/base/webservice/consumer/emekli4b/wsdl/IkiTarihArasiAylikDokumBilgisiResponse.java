//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 03:44:27 PM EET 
//


package gov.sgk.sgep.base.webservice.consumer.emekli4b.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ikiTarihArasiAylikDokumBilgisiReturn" type="{http://business.webServisler.emektar.sgk.gov.tr}ArrayOf_1491836633_1174028189_nillable_AylikDokumForWebServiceForm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "ikiTarihArasiAylikDokumBilgisiReturn"
})
@XmlRootElement(name = "ikiTarihArasiAylikDokumBilgisiResponse")
public class IkiTarihArasiAylikDokumBilgisiResponse {

    @XmlElement(required = true, nillable = true)
    protected ArrayOf14918366331174028189NillableAylikDokumForWebServiceForm ikiTarihArasiAylikDokumBilgisiReturn;

    /**
     * Gets the value of the ikiTarihArasiAylikDokumBilgisiReturn property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOf14918366331174028189NillableAylikDokumForWebServiceForm }
     *     
     */
    public ArrayOf14918366331174028189NillableAylikDokumForWebServiceForm getIkiTarihArasiAylikDokumBilgisiReturn() {
        return ikiTarihArasiAylikDokumBilgisiReturn;
    }

    /**
     * Sets the value of the ikiTarihArasiAylikDokumBilgisiReturn property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOf14918366331174028189NillableAylikDokumForWebServiceForm }
     *     
     */
    public void setIkiTarihArasiAylikDokumBilgisiReturn(ArrayOf14918366331174028189NillableAylikDokumForWebServiceForm value) {
        this.ikiTarihArasiAylikDokumBilgisiReturn = value;
    }

}