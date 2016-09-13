
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for KisiSorguMode.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="KisiSorguMode">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Normal"/>
 *     &lt;enumeration value="SoyadBos"/>
 *     &lt;enumeration value="BabaBos"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "KisiSorguMode")
@XmlEnum
public enum KisiSorguMode {

    @XmlEnumValue("Normal")
    NORMAL("Normal"),
    @XmlEnumValue("SoyadBos")
    SOYAD_BOS("SoyadBos"),
    @XmlEnumValue("BabaBos")
    BABA_BOS("BabaBos");
    private final String value;

    KisiSorguMode(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static KisiSorguMode fromValue(String v) {
        for (KisiSorguMode c: KisiSorguMode.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
