
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.tr.gov.nvi.kps._2014._09._01;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanbirlesikkisibilgisisorgula.Parametre;


/**
 * <p>Java class for YurtDisiAdresi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="YurtDisiAdresi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://kps.nvi.gov.tr/2014/09/01}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="DisTemsDuzeltmeBeyanTarih" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DisTemsDuzeltmeKararTarih" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="DisTemsDuzeltmeNeden" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="DisTemsilcilik" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *         &lt;element name="YabanciAdres" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YabanciSehir" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="YabanciUlke" type="{NSTCKimlikNodanBirlesikKisiBilgisiSorgula}Parametre" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "YurtDisiAdresi", propOrder = {
    "extensionData",
    "disTemsDuzeltmeBeyanTarih",
    "disTemsDuzeltmeKararTarih",
    "disTemsDuzeltmeNeden",
    "disTemsilcilik",
    "hataBilgisi",
    "yabanciAdres",
    "yabanciSehir",
    "yabanciUlke"
})
public class YurtDisiAdresi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "DisTemsDuzeltmeBeyanTarih", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disTemsDuzeltmeBeyanTarih;
    @XmlElement(name = "DisTemsDuzeltmeKararTarih", required = true, nillable = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar disTemsDuzeltmeKararTarih;
    @XmlElement(name = "DisTemsDuzeltmeNeden")
    protected Parametre disTemsDuzeltmeNeden;
    @XmlElement(name = "DisTemsilcilik")
    protected Parametre disTemsilcilik;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "YabanciAdres")
    protected String yabanciAdres;
    @XmlElement(name = "YabanciSehir")
    protected String yabanciSehir;
    @XmlElement(name = "YabanciUlke")
    protected Parametre yabanciUlke;

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
     * Gets the value of the disTemsDuzeltmeBeyanTarih property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisTemsDuzeltmeBeyanTarih() {
        return disTemsDuzeltmeBeyanTarih;
    }

    /**
     * Sets the value of the disTemsDuzeltmeBeyanTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisTemsDuzeltmeBeyanTarih(XMLGregorianCalendar value) {
        this.disTemsDuzeltmeBeyanTarih = value;
    }

    /**
     * Gets the value of the disTemsDuzeltmeKararTarih property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDisTemsDuzeltmeKararTarih() {
        return disTemsDuzeltmeKararTarih;
    }

    /**
     * Sets the value of the disTemsDuzeltmeKararTarih property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDisTemsDuzeltmeKararTarih(XMLGregorianCalendar value) {
        this.disTemsDuzeltmeKararTarih = value;
    }

    /**
     * Gets the value of the disTemsDuzeltmeNeden property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getDisTemsDuzeltmeNeden() {
        return disTemsDuzeltmeNeden;
    }

    /**
     * Sets the value of the disTemsDuzeltmeNeden property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setDisTemsDuzeltmeNeden(Parametre value) {
        this.disTemsDuzeltmeNeden = value;
    }

    /**
     * Gets the value of the disTemsilcilik property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getDisTemsilcilik() {
        return disTemsilcilik;
    }

    /**
     * Sets the value of the disTemsilcilik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setDisTemsilcilik(Parametre value) {
        this.disTemsilcilik = value;
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
     * Gets the value of the yabanciAdres property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYabanciAdres() {
        return yabanciAdres;
    }

    /**
     * Sets the value of the yabanciAdres property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYabanciAdres(String value) {
        this.yabanciAdres = value;
    }

    /**
     * Gets the value of the yabanciSehir property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getYabanciSehir() {
        return yabanciSehir;
    }

    /**
     * Sets the value of the yabanciSehir property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setYabanciSehir(String value) {
        this.yabanciSehir = value;
    }

    /**
     * Gets the value of the yabanciUlke property.
     * 
     * @return
     *     possible object is
     *     {@link Parametre }
     *     
     */
    public Parametre getYabanciUlke() {
        return yabanciUlke;
    }

    /**
     * Sets the value of the yabanciUlke property.
     * 
     * @param value
     *     allowed object is
     *     {@link Parametre }
     *     
     */
    public void setYabanciUlke(Parametre value) {
        this.yabanciUlke = value;
    }

}
