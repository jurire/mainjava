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
 * <p>Java class for odemeVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="odemeVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="aylik" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="ekOdeme" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "odemeVO", propOrder = {
    "aylik",
    "ekOdeme"
})
public class OdemeVO {

    protected double aylik;
    protected double ekOdeme;

    /**
     * Gets the value of the aylik property.
     * 
     */
    public double getAylik() {
        return aylik;
    }

    /**
     * Sets the value of the aylik property.
     * 
     */
    public void setAylik(double value) {
        this.aylik = value;
    }

    /**
     * Gets the value of the ekOdeme property.
     * 
     */
    public double getEkOdeme() {
        return ekOdeme;
    }

    /**
     * Sets the value of the ekOdeme property.
     * 
     */
    public void setEkOdeme(double value) {
        this.ekOdeme = value;
    }

}
