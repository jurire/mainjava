
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.namespacemavikart;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MaviKartliKisiBilgisiSonucu complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MaviKartliKisiBilgisiSonucu">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{NameSpaceMaviKart}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="HataBilgisi" type="{NameSpaceMaviKart}Parametre" minOccurs="0"/>
 *         &lt;element name="SorguSonucu" type="{NameSpaceMaviKart}ArrayOfMaviKartliKisiBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MaviKartliKisiBilgisiSonucu", propOrder = {
    "extensionData",
    "hataBilgisi",
    "sorguSonucu"
})
public class MaviKartliKisiBilgisiSonucu {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "HataBilgisi")
    protected Parametre hataBilgisi;
    @XmlElement(name = "SorguSonucu")
    protected ArrayOfMaviKartliKisiBilgisi sorguSonucu;

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
     * Gets the value of the sorguSonucu property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfMaviKartliKisiBilgisi }
     *     
     */
    public ArrayOfMaviKartliKisiBilgisi getSorguSonucu() {
        return sorguSonucu;
    }

    /**
     * Sets the value of the sorguSonucu property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfMaviKartliKisiBilgisi }
     *     
     */
    public void setSorguSonucu(ArrayOfMaviKartliKisiBilgisi value) {
        this.sorguSonucu = value;
    }

}
