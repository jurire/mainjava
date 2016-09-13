
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CstOlay.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="CstOlay">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Bosanma"/>
 *     &lt;enumeration value="BosanmaIptal"/>
 *     &lt;enumeration value="Dogum"/>
 *     &lt;enumeration value="EvlatEdinme"/>
 *     &lt;enumeration value="EvlatliginReddi"/>
 *     &lt;enumeration value="Evlenme"/>
 *     &lt;enumeration value="EvlilikFeshi"/>
 *     &lt;enumeration value="Gaiplik"/>
 *     &lt;enumeration value="GaipliginFeshi"/>
 *     &lt;enumeration value="IdareceKayitDuzeltme"/>
 *     &lt;enumeration value="KayitDuzeltme"/>
 *     &lt;enumeration value="KayitSilme"/>
 *     &lt;enumeration value="AileBirlestirme"/>
 *     &lt;enumeration value="MukerrerKayitSilme"/>
 *     &lt;enumeration value="YerDegistirme"/>
 *     &lt;enumeration value="Olum"/>
 *     &lt;enumeration value="OlumunFeshi"/>
 *     &lt;enumeration value="SoybagiDuzeltme"/>
 *     &lt;enumeration value="SoybagininReddi"/>
 *     &lt;enumeration value="Tanima"/>
 *     &lt;enumeration value="TanimaninIptali"/>
 *     &lt;enumeration value="Vasiyetname"/>
 *     &lt;enumeration value="Vatandaslik"/>
 *     &lt;enumeration value="Velayet"/>
 *     &lt;enumeration value="Yesilkart"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CstOlay")
@XmlEnum
public enum CstOlay {

    @XmlEnumValue("Bosanma")
    BOSANMA("Bosanma"),
    @XmlEnumValue("BosanmaIptal")
    BOSANMA_IPTAL("BosanmaIptal"),
    @XmlEnumValue("Dogum")
    DOGUM("Dogum"),
    @XmlEnumValue("EvlatEdinme")
    EVLAT_EDINME("EvlatEdinme"),
    @XmlEnumValue("EvlatliginReddi")
    EVLATLIGIN_REDDI("EvlatliginReddi"),
    @XmlEnumValue("Evlenme")
    EVLENME("Evlenme"),
    @XmlEnumValue("EvlilikFeshi")
    EVLILIK_FESHI("EvlilikFeshi"),
    @XmlEnumValue("Gaiplik")
    GAIPLIK("Gaiplik"),
    @XmlEnumValue("GaipliginFeshi")
    GAIPLIGIN_FESHI("GaipliginFeshi"),
    @XmlEnumValue("IdareceKayitDuzeltme")
    IDARECE_KAYIT_DUZELTME("IdareceKayitDuzeltme"),
    @XmlEnumValue("KayitDuzeltme")
    KAYIT_DUZELTME("KayitDuzeltme"),
    @XmlEnumValue("KayitSilme")
    KAYIT_SILME("KayitSilme"),
    @XmlEnumValue("AileBirlestirme")
    AILE_BIRLESTIRME("AileBirlestirme"),
    @XmlEnumValue("MukerrerKayitSilme")
    MUKERRER_KAYIT_SILME("MukerrerKayitSilme"),
    @XmlEnumValue("YerDegistirme")
    YER_DEGISTIRME("YerDegistirme"),
    @XmlEnumValue("Olum")
    OLUM("Olum"),
    @XmlEnumValue("OlumunFeshi")
    OLUMUN_FESHI("OlumunFeshi"),
    @XmlEnumValue("SoybagiDuzeltme")
    SOYBAGI_DUZELTME("SoybagiDuzeltme"),
    @XmlEnumValue("SoybagininReddi")
    SOYBAGININ_REDDI("SoybagininReddi"),
    @XmlEnumValue("Tanima")
    TANIMA("Tanima"),
    @XmlEnumValue("TanimaninIptali")
    TANIMANIN_IPTALI("TanimaninIptali"),
    @XmlEnumValue("Vasiyetname")
    VASIYETNAME("Vasiyetname"),
    @XmlEnumValue("Vatandaslik")
    VATANDASLIK("Vatandaslik"),
    @XmlEnumValue("Velayet")
    VELAYET("Velayet"),
    @XmlEnumValue("Yesilkart")
    YESILKART("Yesilkart");
    private final String value;

    CstOlay(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CstOlay fromValue(String v) {
        for (CstOlay c: CstOlay.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
