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
 * <p>Java class for sonOdenenAylikVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="sonOdenenAylikVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ay" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="borcVO" type="{http://ws.emekli4c.intra.sgk/}borcVO" minOccurs="0"/>
 *         &lt;element name="farkVO" type="{http://ws.emekli4c.intra.sgk/}farkVO" minOccurs="0"/>
 *         &lt;element name="netOdenen" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="odemeVO" type="{http://ws.emekli4c.intra.sgk/}odemeVO" minOccurs="0"/>
 *         &lt;element name="yil" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "sonOdenenAylikVO", propOrder = {
    "ay",
    "borcVO",
    "farkVO",
    "netOdenen",
    "odemeVO",
    "yil"
})
public class SonOdenenAylikVO {

    protected short ay;
    protected BorcVO borcVO;
    protected FarkVO farkVO;
    protected double netOdenen;
    protected OdemeVO odemeVO;
    protected short yil;

    /**
     * Gets the value of the ay property.
     * 
     */
    public short getAy() {
        return ay;
    }

    /**
     * Sets the value of the ay property.
     * 
     */
    public void setAy(short value) {
        this.ay = value;
    }

    /**
     * Gets the value of the borcVO property.
     * 
     * @return
     *     possible object is
     *     {@link BorcVO }
     *     
     */
    public BorcVO getBorcVO() {
        return borcVO;
    }

    /**
     * Sets the value of the borcVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link BorcVO }
     *     
     */
    public void setBorcVO(BorcVO value) {
        this.borcVO = value;
    }

    /**
     * Gets the value of the farkVO property.
     * 
     * @return
     *     possible object is
     *     {@link FarkVO }
     *     
     */
    public FarkVO getFarkVO() {
        return farkVO;
    }

    /**
     * Sets the value of the farkVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link FarkVO }
     *     
     */
    public void setFarkVO(FarkVO value) {
        this.farkVO = value;
    }

    /**
     * Gets the value of the netOdenen property.
     * 
     */
    public double getNetOdenen() {
        return netOdenen;
    }

    /**
     * Sets the value of the netOdenen property.
     * 
     */
    public void setNetOdenen(double value) {
        this.netOdenen = value;
    }

    /**
     * Gets the value of the odemeVO property.
     * 
     * @return
     *     possible object is
     *     {@link OdemeVO }
     *     
     */
    public OdemeVO getOdemeVO() {
        return odemeVO;
    }

    /**
     * Sets the value of the odemeVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link OdemeVO }
     *     
     */
    public void setOdemeVO(OdemeVO value) {
        this.odemeVO = value;
    }

    /**
     * Gets the value of the yil property.
     * 
     */
    public short getYil() {
        return yil;
    }

    /**
     * Sets the value of the yil property.
     * 
     */
    public void setYil(short value) {
        this.yil = value;
    }

}
