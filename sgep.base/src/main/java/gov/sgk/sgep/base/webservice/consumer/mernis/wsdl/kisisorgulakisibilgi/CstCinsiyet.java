
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.kisisorgulakisibilgi;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CstCinsiyet.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CstCinsiyet">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bilinmeyen"/>
 *     &lt;enumeration value="Erkek"/>
 *     &lt;enumeration value="Kadin"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CstCinsiyet")
@XmlEnum
public enum CstCinsiyet {

    @XmlEnumValue("Bilinmeyen")
    BILINMEYEN("Bilinmeyen"),
    @XmlEnumValue("Erkek")
    ERKEK("Erkek"),
    @XmlEnumValue("Kadin")
    KADIN("Kadin");
    private final String value;

    CstCinsiyet(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CstCinsiyet fromValue(String v) {
        for (CstCinsiyet c: CstCinsiyet.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
