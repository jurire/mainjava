
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CstDegisimTuru.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CstDegisimTuru">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="YERLESIMYERI"/>
 *     &lt;enumeration value="KISIBILGISI"/>
 *     &lt;enumeration value="KISIVEYERLESIMYERI"/>
 *     &lt;enumeration value="CUZDAN"/>
 *     &lt;enumeration value="YERLESIMYERIVECUZDAN"/>
 *     &lt;enumeration value="KISIVECUZDAN"/>
 *     &lt;enumeration value="KISIVEYERLESIMYERIVECUZDAN"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CstDegisimTuru")
@XmlEnum
public enum CstDegisimTuru {

    YERLESIMYERI,
    KISIBILGISI,
    KISIVEYERLESIMYERI,
    CUZDAN,
    YERLESIMYERIVECUZDAN,
    KISIVECUZDAN,
    KISIVEYERLESIMYERIVECUZDAN;

    public String value() {
        return name();
    }

    public static CstDegisimTuru fromValue(String v) {
        return valueOf(v);
    }

}
