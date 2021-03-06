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
 * <p>Java class for maasTahakkukVO complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="maasTahakkukVO">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ay" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="maasFarkVO" type="{http://ws.emekli4c.intra.sgk/}maasFarkVO" minOccurs="0"/>
 *         &lt;element name="maasKesintiVO" type="{http://ws.emekli4c.intra.sgk/}maasKesintiVO" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="maasVO" type="{http://ws.emekli4c.intra.sgk/}maasVO" minOccurs="0"/>
 *         &lt;element name="odenenMaas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "maasTahakkukVO", propOrder = {
    "ay",
    "maasFarkVO",
    "maasKesintiVO",
    "maasVO",
    "odenenMaas"
})
public class MaasTahakkukVO {

    protected short ay;
    protected MaasFarkVO maasFarkVO;
    @XmlElement(nillable = true)
    protected List<MaasKesintiVO> maasKesintiVO;
    protected MaasVO maasVO;
    protected double odenenMaas;

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
     * Gets the value of the maasFarkVO property.
     * 
     * @return
     *     possible object is
     *     {@link MaasFarkVO }
     *     
     */
    public MaasFarkVO getMaasFarkVO() {
        return maasFarkVO;
    }

    /**
     * Sets the value of the maasFarkVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaasFarkVO }
     *     
     */
    public void setMaasFarkVO(MaasFarkVO value) {
        this.maasFarkVO = value;
    }

    /**
     * Gets the value of the maasKesintiVO property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maasKesintiVO property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaasKesintiVO().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MaasKesintiVO }
     * 
     * 
     */
    public List<MaasKesintiVO> getMaasKesintiVO() {
        if (maasKesintiVO == null) {
            maasKesintiVO = new ArrayList<MaasKesintiVO>();
        }
        return this.maasKesintiVO;
    }

    /**
     * Gets the value of the maasVO property.
     * 
     * @return
     *     possible object is
     *     {@link MaasVO }
     *     
     */
    public MaasVO getMaasVO() {
        return maasVO;
    }

    /**
     * Sets the value of the maasVO property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaasVO }
     *     
     */
    public void setMaasVO(MaasVO value) {
        this.maasVO = value;
    }

    /**
     * Gets the value of the odenenMaas property.
     * 
     */
    public double getOdenenMaas() {
        return odenenMaas;
    }

    /**
     * Sets the value of the odenenMaas property.
     * 
     */
    public void setOdenenMaas(double value) {
        this.odenenMaas = value;
    }

}
