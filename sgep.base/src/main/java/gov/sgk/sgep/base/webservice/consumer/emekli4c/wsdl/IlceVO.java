//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.16 at 03:59:01 PM EET 
//


package gov.sgk.sgep.base.webservice.consumer.emekli4c.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ilceVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ilceVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ilVO" type="{http://ws.emekli4c.intra.sgk/}ilVO" minOccurs="0"/>
 *         &lt;element name="ilceAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="no" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ilceVO", propOrder = {
    "ilVO",
    "ilceAdi",
    "no"
})
public class IlceVO {

    protected IlVO ilVO;
    protected String ilceAdi;
    protected short no;

    /**
     * Gets the value of the ilVO property.
     * 
     * @return
     *     possible object is
     *     {@link IlVO }
     *     
     */
    public IlVO getIlVO() {
        return ilVO;
    }

    /**
     * Sets the value of the ilVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link IlVO }
     *     
     */
    public void setIlVO(IlVO value) {
        this.ilVO = value;
    }

    /**
     * Gets the value of the ilceAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIlceAdi() {
        return ilceAdi;
    }

    /**
     * Sets the value of the ilceAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIlceAdi(String value) {
        this.ilceAdi = value;
    }

    /**
     * Gets the value of the no property.
     * 
     */
    public short getNo() {
        return no;
    }

    /**
     * Sets the value of the no property.
     * 
     */
    public void setNo(short value) {
        this.no = value;
    }

}
