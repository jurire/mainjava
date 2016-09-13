
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nskimliknodanyerlesimyeriadresbilgisisorgula.Parametre;


/**
 * <p>Java class for KimlikNoileKisiAdresBilgileri complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KimlikNoileKisiAdresBilgileri">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="DigerAdresBilgileri" type="{http://sgknet/SGKKPSWebServis}ArrayOfKimlikNoileKisiAdresBilgisi" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NSKimlikNodanYerlesimYeriAdresBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="KimlikNo" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="YerlesimYeriAdresi" type="{http://sgknet/SGKKPSWebServis}KimlikNoileKisiAdresBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KimlikNoileKisiAdresBilgileri", propOrder = {
    "extensionData",
    "digerAdresBilgileri",
    "hataBilgisi",
    "kimlikNo",
    "yerlesimYeriAdresi"
})
public class KimlikNoileKisiAdresBilgileri {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "DigerAdresBilgileri")
    protected ArrayOfKimlikNoileKisiAdresBilgisi digerAdresBilgileri;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "KimlikNo", required = true, type = Long.class, nillable = true)
    protected Long kimlikNo;
    @XmlElement(name = "YerlesimYeriAdresi")
    protected KimlikNoileKisiAdresBilgisi yerlesimYeriAdresi;

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
     * Gets the value of the digerAdresBilgileri property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfKimlikNoileKisiAdresBilgisi }
     *     
     */
    public ArrayOfKimlikNoileKisiAdresBilgisi getDigerAdresBilgileri() {
        return digerAdresBilgileri;
    }

    /**
     * Sets the value of the digerAdresBilgileri property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfKimlikNoileKisiAdresBilgisi }
     *     
     */
    public void setDigerAdresBilgileri(ArrayOfKimlikNoileKisiAdresBilgisi value) {
        this.digerAdresBilgileri = value;
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
     * Gets the value of the kimlikNo property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getKimlikNo() {
        return kimlikNo;
    }

    /**
     * Sets the value of the kimlikNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setKimlikNo(Long value) {
        this.kimlikNo = value;
    }

    /**
     * Gets the value of the yerlesimYeriAdresi property.
     * 
     * @return
     *     possible object is
     *     {@link KimlikNoileKisiAdresBilgisi }
     *     
     */
    public KimlikNoileKisiAdresBilgisi getYerlesimYeriAdresi() {
        return yerlesimYeriAdresi;
    }

    /**
     * Sets the value of the yerlesimYeriAdresi property.
     * 
     * @param value
     *     allowed object is
     *     {@link KimlikNoileKisiAdresBilgisi }
     *     
     */
    public void setYerlesimYeriAdresi(KimlikNoileKisiAdresBilgisi value) {
        this.yerlesimYeriAdresi = value;
    }

}
