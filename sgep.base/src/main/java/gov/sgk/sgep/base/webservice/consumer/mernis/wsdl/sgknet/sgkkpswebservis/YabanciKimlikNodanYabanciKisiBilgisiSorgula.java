
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.math.BigDecimal;
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
 *         &lt;element name="yabanciKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="kulAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="sifre" type="{http://www.w3.org/2001/XMLSchema}decimal"/>
 *         &lt;element name="uygUserKulAdi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
    "yabanciKimlikNo",
    "kulAdi",
    "sifre",
    "uygUserKulAdi"
})
@XmlRootElement(name = "YabanciKimlikNodanYabanciKisiBilgisiSorgula")
public class YabanciKimlikNodanYabanciKisiBilgisiSorgula {

    protected long yabanciKimlikNo;
    protected String kulAdi;
    @XmlElement(required = true)
    protected BigDecimal sifre;
    protected String uygUserKulAdi;

    /**
     * Gets the value of the yabanciKimlikNo property.
     * 
     */
    public long getYabanciKimlikNo() {
        return yabanciKimlikNo;
    }

    /**
     * Sets the value of the yabanciKimlikNo property.
     * 
     */
    public void setYabanciKimlikNo(long value) {
        this.yabanciKimlikNo = value;
    }

    /**
     * Gets the value of the kulAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKulAdi() {
        return kulAdi;
    }

    /**
     * Sets the value of the kulAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKulAdi(String value) {
        this.kulAdi = value;
    }

    /**
     * Gets the value of the sifre property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSifre() {
        return sifre;
    }

    /**
     * Sets the value of the sifre property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSifre(BigDecimal value) {
        this.sifre = value;
    }

    /**
     * Gets the value of the uygUserKulAdi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUygUserKulAdi() {
        return uygUserKulAdi;
    }

    /**
     * Sets the value of the uygUserKulAdi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUygUserKulAdi(String value) {
        this.uygUserKulAdi = value;
    }

}
