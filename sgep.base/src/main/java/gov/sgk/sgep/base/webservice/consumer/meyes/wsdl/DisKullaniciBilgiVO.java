//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.12 at 02:20:33 PM EET 
//


package gov.sgk.sgep.base.webservice.consumer.meyes.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DisKullaniciBilgiVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DisKullaniciBilgiVO"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="disKullaniciKod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="disKullaniciOu" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="disKullaniciIslemSonuc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DisKullaniciBilgiVO", namespace = "http://vo.meyes.sgk.gov.tr", propOrder = {
    "disKullaniciKod",
    "disKullaniciOu",
    "disKullaniciIslemSonuc"
})
public class DisKullaniciBilgiVO {

    @XmlElement(required = true, nillable = true)
    protected String disKullaniciKod;
    @XmlElement(required = true, nillable = true)
    protected String disKullaniciOu;
    @XmlElement(required = true, nillable = true)
    protected String disKullaniciIslemSonuc;

    /**
     * Gets the value of the disKullaniciKod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisKullaniciKod() {
        return disKullaniciKod;
    }

    /**
     * Sets the value of the disKullaniciKod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisKullaniciKod(String value) {
        this.disKullaniciKod = value;
    }

    /**
     * Gets the value of the disKullaniciOu property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisKullaniciOu() {
        return disKullaniciOu;
    }

    /**
     * Sets the value of the disKullaniciOu property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisKullaniciOu(String value) {
        this.disKullaniciOu = value;
    }

    /**
     * Gets the value of the disKullaniciIslemSonuc property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisKullaniciIslemSonuc() {
        return disKullaniciIslemSonuc;
    }

    /**
     * Sets the value of the disKullaniciIslemSonuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisKullaniciIslemSonuc(String value) {
        this.disKullaniciIslemSonuc = value;
    }

}
