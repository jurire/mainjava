
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OlayListesi complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OlayListesi">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ExtensionData" type="{http://sgknet/SGKKPSWebServis}ExtensionDataObject" minOccurs="0"/>
 *         &lt;element name="SayfaAnahtari" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="Sonuc" type="{http://sgknet/SGKKPSWebServis}ArrayOfOlayBilgisi" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OlayListesi", propOrder = {
    "extensionData",
    "sayfaAnahtari",
    "sonuc"
})
public class OlayListesi {

    @XmlElement(name = "ExtensionData")
    protected ExtensionDataObject extensionData;
    @XmlElement(name = "SayfaAnahtari", required = true, type = Long.class, nillable = true)
    protected Long sayfaAnahtari;
    @XmlElement(name = "Sonuc")
    protected ArrayOfOlayBilgisi sonuc;

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
     * Gets the value of the sayfaAnahtari property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getSayfaAnahtari() {
        return sayfaAnahtari;
    }

    /**
     * Sets the value of the sayfaAnahtari property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setSayfaAnahtari(Long value) {
        this.sayfaAnahtari = value;
    }

    /**
     * Gets the value of the sonuc property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfOlayBilgisi }
     *     
     */
    public ArrayOfOlayBilgisi getSonuc() {
        return sonuc;
    }

    /**
     * Sets the value of the sonuc property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfOlayBilgisi }
     *     
     */
    public void setSonuc(ArrayOfOlayBilgisi value) {
        this.sonuc = value;
    }

}
