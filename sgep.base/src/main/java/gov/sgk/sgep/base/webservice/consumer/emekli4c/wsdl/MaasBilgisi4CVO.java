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
 * <p>Java class for maasBilgisi4CVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maasBilgisi4CVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="maasTahakkukVO" type="{http://ws.emekli4c.intra.sgk/}maasTahakkukVO" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "maasBilgisi4CVO", propOrder = {
    "maasTahakkukVO",
    "yil"
})
public class MaasBilgisi4CVO {

    @XmlElement(nillable = true)
    protected List<MaasTahakkukVO> maasTahakkukVO;
    protected short yil;

    /**
     * Gets the value of the maasTahakkukVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maasTahakkukVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaasTahakkukVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaasTahakkukVO }
     * 
     * 
     */
    public List<MaasTahakkukVO> getMaasTahakkukVO() {
        if (maasTahakkukVO == null) {
            maasTahakkukVO = new ArrayList<MaasTahakkukVO>();
        }
        return this.maasTahakkukVO;
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
