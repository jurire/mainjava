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
 * <p>Java class for maasVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maasVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ekOdemeTutar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="maasTutar" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maasVO", propOrder = {
    "ekOdemeTutar",
    "maasTutar"
})
public class MaasVO {

    protected double ekOdemeTutar;
    protected double maasTutar;

    /**
     * Gets the value of the ekOdemeTutar property.
     * 
     */
    public double getEkOdemeTutar() {
        return ekOdemeTutar;
    }

    /**
     * Sets the value of the ekOdemeTutar property.
     * 
     */
    public void setEkOdemeTutar(double value) {
        this.ekOdemeTutar = value;
    }

    /**
     * Gets the value of the maasTutar property.
     * 
     */
    public double getMaasTutar() {
        return maasTutar;
    }

    /**
     * Sets the value of the maasTutar property.
     * 
     */
    public void setMaasTutar(double value) {
        this.maasTutar = value;
    }

}
