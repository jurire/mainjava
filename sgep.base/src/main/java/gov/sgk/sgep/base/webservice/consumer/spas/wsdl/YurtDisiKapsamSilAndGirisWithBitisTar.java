//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.12.03 at 02:19:55 PM EET 
//


package gov.sgk.sgep.base.webservice.consumer.spas.wsdl;

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
 *         &lt;element name="kapsamSilDVO" type="{http://dvo.spas.sgk.gov.tr}KapsamSilDVO"/>
 *         &lt;element name="kapsamGirisDVO" type="{http://dvo.spas.sgk.gov.tr}KapsamGirisDVO"/>
 *         &lt;element name="yurtDisiSigortaliDetayDVO" type="{http://dvo.spas.sgk.gov.tr}YurtDisiSigortaliDetayDVO"/>
 *         &lt;element name="uygSifre" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
    "kapsamSilDVO",
    "kapsamGirisDVO",
    "yurtDisiSigortaliDetayDVO",
    "uygSifre"
})
@XmlRootElement(name = "yurtDisiKapsamSilAndGirisWithBitisTar")
public class YurtDisiKapsamSilAndGirisWithBitisTar {

    @XmlElement(required = true, nillable = true)
    protected KapsamSilDVO kapsamSilDVO;
    @XmlElement(required = true, nillable = true)
    protected KapsamGirisDVO kapsamGirisDVO;
    @XmlElement(required = true, nillable = true)
    protected YurtDisiSigortaliDetayDVO yurtDisiSigortaliDetayDVO;
    @XmlElement(required = true, nillable = true)
    protected String uygSifre;

    /**
     * Gets the value of the kapsamSilDVO property.
     * 
     * @return
     *     possible object is
     *     {@link KapsamSilDVO }
     *     
     */
    public KapsamSilDVO getKapsamSilDVO() {
        return kapsamSilDVO;
    }

    /**
     * Sets the value of the kapsamSilDVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link KapsamSilDVO }
     *     
     */
    public void setKapsamSilDVO(KapsamSilDVO value) {
        this.kapsamSilDVO = value;
    }

    /**
     * Gets the value of the kapsamGirisDVO property.
     * 
     * @return
     *     possible object is
     *     {@link KapsamGirisDVO }
     *     
     */
    public KapsamGirisDVO getKapsamGirisDVO() {
        return kapsamGirisDVO;
    }

    /**
     * Sets the value of the kapsamGirisDVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link KapsamGirisDVO }
     *     
     */
    public void setKapsamGirisDVO(KapsamGirisDVO value) {
        this.kapsamGirisDVO = value;
    }

    /**
     * Gets the value of the yurtDisiSigortaliDetayDVO property.
     * 
     * @return
     *     possible object is
     *     {@link YurtDisiSigortaliDetayDVO }
     *     
     */
    public YurtDisiSigortaliDetayDVO getYurtDisiSigortaliDetayDVO() {
        return yurtDisiSigortaliDetayDVO;
    }

    /**
     * Sets the value of the yurtDisiSigortaliDetayDVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link YurtDisiSigortaliDetayDVO }
     *     
     */
    public void setYurtDisiSigortaliDetayDVO(YurtDisiSigortaliDetayDVO value) {
        this.yurtDisiSigortaliDetayDVO = value;
    }

    /**
     * Gets the value of the uygSifre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUygSifre() {
        return uygSifre;
    }

    /**
     * Sets the value of the uygSifre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUygSifre(String value) {
        this.uygSifre = value;
    }

}