//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 03:59:01 PM EET 
//


package gov.sgk.sgep.base.webservice.consumer.emekli4c.wsdl;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for aylikHareketBilgisi4CDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="aylikHareketBilgisi4CDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.emekli4c.intra.sgk/}baseReturnDTO">
 *       &lt;sequence>
 *         &lt;element name="aylikHareketBilgisi4cDVOs" type="{http://ws.emekli4c.intra.sgk/}aylikHareketBilgisi4CDVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "aylikHareketBilgisi4CDTO", propOrder = {
    "aylikHareketBilgisi4CDVOs"
})
public class AylikHareketBilgisi4CDTO
    extends BaseReturnDTO
{

    @XmlElement(name = "aylikHareketBilgisi4cDVOs", nillable = true)
    protected List<AylikHareketBilgisi4CDVO> aylikHareketBilgisi4CDVOs;

    /**
     * Gets the value of the aylikHareketBilgisi4CDVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the aylikHareketBilgisi4CDVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAylikHareketBilgisi4CDVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AylikHareketBilgisi4CDVO }
     * 
     * 
     */
    public List<AylikHareketBilgisi4CDVO> getAylikHareketBilgisi4CDVOs() {
        if (aylikHareketBilgisi4CDVOs == null) {
            aylikHareketBilgisi4CDVOs = new ArrayList<AylikHareketBilgisi4CDVO>();
        }
        return this.aylikHareketBilgisi4CDVOs;
    }

}
