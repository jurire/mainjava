
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulatckimlikno;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NkoTur.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NkoTur">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="KisiKayitOrnek"/>
 *     &lt;enumeration value="AileKayitOrnek"/>
 *     &lt;enumeration value="NufusAileKayitOrnek"/>
 *     &lt;enumeration value="NufusAileKayitOrnekKardesDahil"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NkoTur")
@XmlEnum
public enum NkoTur {

    @XmlEnumValue("KisiKayitOrnek")
    KISI_KAYIT_ORNEK("KisiKayitOrnek"),
    @XmlEnumValue("AileKayitOrnek")
    AILE_KAYIT_ORNEK("AileKayitOrnek"),
    @XmlEnumValue("NufusAileKayitOrnek")
    NUFUS_AILE_KAYIT_ORNEK("NufusAileKayitOrnek"),
    @XmlEnumValue("NufusAileKayitOrnekKardesDahil")
    NUFUS_AILE_KAYIT_ORNEK_KARDES_DAHIL("NufusAileKayitOrnekKardesDahil");
    private final String value;

    NkoTur(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NkoTur fromValue(String v) {
        for (NkoTur c: NkoTur.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
