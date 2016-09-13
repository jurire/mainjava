
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.kisisorgulakisibilgi.KisiDurumBilgisi;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.kisisorgulakisibilgi.KisiKayitYeriBilgisi;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.kisisorgulakisibilgi.KisiTemelBilgisi;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.kisisorgulakisibilgi.Parametre;


/**
 * <p>Java class for KisiBilgilerindenKisiBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KisiBilgilerindenKisiBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="AnneTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="BabaTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="DurumBilgisi" type="{KisiSorgulaKisiBilgi}KisiDurumBilgisi" minOccurs="0"/>
 *         &lt;element name="EsTCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="HataBilgisi" type="{KisiSorgulaKisiBilgi}Parametre" minOccurs="0"/>
 *         &lt;element name="KayitYeriBilgisi" type="{KisiSorgulaKisiBilgi}KisiKayitYeriBilgisi" minOccurs="0"/>
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="TemelBilgisi" type="{KisiSorgulaKisiBilgi}KisiTemelBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KisiBilgilerindenKisiBilgisi", propOrder = {
    "extensionData",
    "anneTCKimlikNo",
    "babaTCKimlikNo",
    "durumBilgisi",
    "esTCKimlikNo",
    "hataBilgisi",
    "kayitYeriBilgisi",
    "tcKimlikNo",
    "temelBilgisi"
})
public class KisiBilgilerindenKisiBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "AnneTCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long anneTCKimlikNo;
    @XmlElement(name = "BabaTCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long babaTCKimlikNo;
    @XmlElement(name = "DurumBilgisi")
    protected KisiDurumBilgisi durumBilgisi;
    @XmlElement(name = "EsTCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long esTCKimlikNo;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "KayitYeriBilgisi")
    protected KisiKayitYeriBilgisi kayitYeriBilgisi;
    @XmlElement(name = "TCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long tcKimlikNo;
    @XmlElement(name = "TemelBilgisi")
    protected KisiTemelBilgisi temelBilgisi;

    /**
     * Gets the value of the extensionData property.
     * 
     * @return
     *     possible object is
     *     {@link ExtensionDataObject }
     *     
     */
    public ExtensionDataObject getExtensionData() {
        return extensionData;
    }

    /**
     * Sets the value of the extensionData property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExtensionDataObject }
     *     
     */
    public void setExtensionData(ExtensionDataObject value) {
        this.extensionData = value;
    }

    /**
     * Gets the value of the anneTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAnneTCKimlikNo() {
        return anneTCKimlikNo;
    }

    /**
     * Sets the value of the anneTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAnneTCKimlikNo(Long value) {
        this.anneTCKimlikNo = value;
    }

    /**
     * Gets the value of the babaTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getBabaTCKimlikNo() {
        return babaTCKimlikNo;
    }

    /**
     * Sets the value of the babaTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setBabaTCKimlikNo(Long value) {
        this.babaTCKimlikNo = value;
    }

    /**
     * Gets the value of the durumBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link KisiDurumBilgisi }
     *     
     */
    public KisiDurumBilgisi getDurumBilgisi() {
        return durumBilgisi;
    }

    /**
     * Sets the value of the durumBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiDurumBilgisi }
     *     
     */
    public void setDurumBilgisi(KisiDurumBilgisi value) {
        this.durumBilgisi = value;
    }

    /**
     * Gets the value of the esTCKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getEsTCKimlikNo() {
        return esTCKimlikNo;
    }

    /**
     * Sets the value of the esTCKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setEsTCKimlikNo(Long value) {
        this.esTCKimlikNo = value;
    }

    /**
     * Gets the value of the hataBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getHataBilgisi() {
        return hataBilgisi;
    }

    /**
     * Sets the value of the hataBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setHataBilgisi(Parametre value) {
        this.hataBilgisi = value;
    }

    /**
     * Gets the value of the kayitYeriBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link KisiKayitYeriBilgisi }
     *     
     */
    public KisiKayitYeriBilgisi getKayitYeriBilgisi() {
        return kayitYeriBilgisi;
    }

    /**
     * Sets the value of the kayitYeriBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiKayitYeriBilgisi }
     *     
     */
    public void setKayitYeriBilgisi(KisiKayitYeriBilgisi value) {
        this.kayitYeriBilgisi = value;
    }

    /**
     * Gets the value of the tcKimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTCKimlikNo() {
        return tcKimlikNo;
    }

    /**
     * Sets the value of the tcKimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTCKimlikNo(Long value) {
        this.tcKimlikNo = value;
    }

    /**
     * Gets the value of the temelBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link KisiTemelBilgisi }
     *     
     */
    public KisiTemelBilgisi getTemelBilgisi() {
        return temelBilgisi;
    }

    /**
     * Sets the value of the temelBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiTemelBilgisi }
     *     
     */
    public void setTemelBilgisi(KisiTemelBilgisi value) {
        this.temelBilgisi = value;
    }

}
