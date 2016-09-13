
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.ailelistesiaratcno.KisiBilgisi;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.ailelistesiaratcno.Parametre;


/**
 * <p>Java class for AileBilgisi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AileBilgisi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="AileKisiListesi" type="{http://sgknet/SGKKPSWebServis}ArrayOfAileKisiBilgisi" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{AileListesiAraTCNo}Parametre" minOccurs="0"/>
 *         &lt;element name="KisiBilgisi" type="{AileListesiAraTCNo}KisiBilgisi" minOccurs="0"/>
 *         &lt;element name="TCKimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AileBilgisi", propOrder = {
    "extensionData",
    "aileKisiListesi",
    "hataBilgisi",
    "kisiBilgisi",
    "tcKimlikNo"
})
public class AileBilgisi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "AileKisiListesi")
    protected ArrayOfAileKisiBilgisi aileKisiListesi;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "KisiBilgisi")
    protected KisiBilgisi kisiBilgisi;
    @XmlElement(name = "TCKimlikNo", required = true, type = Long.class, nillable = true)
    protected Long tcKimlikNo;

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
     * Gets the value of the aileKisiListesi property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfAileKisiBilgisi }
     *     
     */
    public ArrayOfAileKisiBilgisi getAileKisiListesi() {
        return aileKisiListesi;
    }

    /**
     * Sets the value of the aileKisiListesi property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfAileKisiBilgisi }
     *     
     */
    public void setAileKisiListesi(ArrayOfAileKisiBilgisi value) {
        this.aileKisiListesi = value;
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
     * Gets the value of the kisiBilgisi property.
     * 
     * @return
     *     possible object is
     *     {@link KisiBilgisi }
     *     
     */
    public KisiBilgisi getKisiBilgisi() {
        return kisiBilgisi;
    }

    /**
     * Sets the value of the kisiBilgisi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KisiBilgisi }
     *     
     */
    public void setKisiBilgisi(KisiBilgisi value) {
        this.kisiBilgisi = value;
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

}
