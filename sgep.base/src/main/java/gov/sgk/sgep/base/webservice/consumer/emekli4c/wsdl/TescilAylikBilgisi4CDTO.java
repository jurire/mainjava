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
 * <p>Java class for tescilAylikBilgisi4CDTO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="tescilAylikBilgisi4CDTO">
 *   &lt;complexContent>
 *     &lt;extension base="{http://ws.emekli4c.intra.sgk/}baseReturnDTO">
 *       &lt;sequence>
 *         &lt;element name="kimlikNo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tescilAylikBilgisi4cDVOs" type="{http://ws.emekli4c.intra.sgk/}tescilAylikBilgisi4CDVO" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tescilAylikBilgisi4CDTO", propOrder = {
    "kimlikNo",
    "tescilAylikBilgisi4CDVOs"
})
public class TescilAylikBilgisi4CDTO
    extends BaseReturnDTO
{

    protected String kimlikNo;
    @XmlElement(name = "tescilAylikBilgisi4cDVOs", nillable = true)
    protected List<TescilAylikBilgisi4CDVO> tescilAylikBilgisi4CDVOs;

    /**
     * Gets the value of the kimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKimlikNo() {
        return kimlikNo;
    }

    /**
     * Sets the value of the kimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKimlikNo(String value) {
        this.kimlikNo = value;
    }

    /**
     * Gets the value of the tescilAylikBilgisi4CDVOs property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tescilAylikBilgisi4CDVOs property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTescilAylikBilgisi4CDVOs().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TescilAylikBilgisi4CDVO }
     * 
     * 
     */
    public List<TescilAylikBilgisi4CDVO> getTescilAylikBilgisi4CDVOs() {
        if (tescilAylikBilgisi4CDVOs == null) {
            tescilAylikBilgisi4CDVOs = new ArrayList<TescilAylikBilgisi4CDVO>();
        }
        return this.tescilAylikBilgisi4CDVOs;
    }

}
