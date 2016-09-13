
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="baslangicTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="bitisTarihi" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="degisimTuru" type="{http://sgknet/SGKKPSWebServis}CstDegisimTuru"/>
 *         &lt;element name="sayfaAnahtari" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
    "baslangicTarihi",
    "bitisTarihi",
    "degisimTuru",
    "sayfaAnahtari",
    "kulAdi",
    "sifre",
    "uygUserKulAdi"
})
@XmlRootElement(name = "VatandasDegisenlerSorgula")
public class VatandasDegisenlerSorgula {

    protected String baslangicTarihi;
    protected String bitisTarihi;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected CstDegisimTuru degisimTuru;
    protected long sayfaAnahtari;
    protected String kulAdi;
    @XmlElement(required = true)
    protected BigDecimal sifre;
    protected String uygUserKulAdi;

    /**
     * Gets the value of the baslangicTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaslangicTarihi() {
        return baslangicTarihi;
    }

    /**
     * Sets the value of the baslangicTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaslangicTarihi(String value) {
        this.baslangicTarihi = value;
    }

    /**
     * Gets the value of the bitisTarihi property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBitisTarihi() {
        return bitisTarihi;
    }

    /**
     * Sets the value of the bitisTarihi property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBitisTarihi(String value) {
        this.bitisTarihi = value;
    }

    /**
     * Gets the value of the degisimTuru property.
     * 
     * @return
     *     possible object is
     *     {@link CstDegisimTuru }
     *     
     */
    public CstDegisimTuru getDegisimTuru() {
        return degisimTuru;
    }

    /**
     * Sets the value of the degisimTuru property.
     * 
     * @param value
     *     allowed object is
     *     {@link CstDegisimTuru }
     *     
     */
    public void setDegisimTuru(CstDegisimTuru value) {
        this.degisimTuru = value;
    }

    /**
     * Gets the value of the sayfaAnahtari property.
     * 
     */
    public long getSayfaAnahtari() {
        return sayfaAnahtari;
    }

    /**
     * Sets the value of the sayfaAnahtari property.
     * 
     */
    public void setSayfaAnahtari(long value) {
        this.sayfaAnahtari = value;
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
