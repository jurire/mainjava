
package gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis;

import java.math.BigDecimal;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;
import gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulatckimlikno.NkoTCKimlikNoSorguKriteri;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SGKKPSWebServisSoap", targetNamespace = "http://sgknet/SGKKPSWebServis")
@XmlSeeAlso({
	gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.ailelistesiaratcno.ObjectFactory.class,
	gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.kisisorgulakayityeri.ObjectFactory.class,
	gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.kisisorgulakisibilgi.ObjectFactory.class,
	gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.kisisorgulatckimlikno.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.namespacemavikart.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.namespacemavikartcuzdan.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulakayityeri.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulatckimlikno.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nscuzdansorgulatckimlikno.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl. nskimliknodanyerlesimyeriadresbilgisisorgula.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nskisibilgisindenkimlikbilgisisorgula.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nsparametresorgulama.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanbirlesikkisibilgisisorgula.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nstckimliknodanmavikartlivukuatsiznkosorgula.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nsvatandasdegisenler.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nsvatandasolaytarih.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nsyabancikisibilgisindenkimlikbilgisisorgula.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.olaylistele.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.ObjectFactory.class,
    gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.tr.gov.nvi.kps._2014._09._01.ObjectFactory.class
})
public interface SGKKPSWebServisSoap {


    /**
     * SGK KPS Servisi Test Metodu
     * 
     * @return
     *     returns sgknet.sgkkpswebservis.SGKKPSWSCevap
     */
    @WebMethod(operationName = "SGKKPSWSTest", action = "http://sgknet/SGKKPSWebServis/SGKKPSWSTest")
    @WebResult(name = "SGKKPSWSTestResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "SGKKPSWSTest", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.SGKKPSWSTest")
    @ResponseWrapper(localName = "SGKKPSWSTestResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.SGKKPSWSTestResponse")
    public SGKKPSWSCevap sgkkpswsTest();

    /**
     * NV\u0130 KPS Servisi Test Metodu
     * 
     * @return
     *     returns sgknet.sgkkpswebservis.SGKKPSWSCevap
     */
    @WebMethod(operationName = "NVIKPSWSTest", action = "http://sgknet/SGKKPSWebServis/NVIKPSWSTest")
    @WebResult(name = "NVIKPSWSTestResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "NVIKPSWSTest", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.NVIKPSWSTest")
    @ResponseWrapper(localName = "NVIKPSWSTestResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.NVIKPSWSTestResponse")
    public SGKKPSWSCevap nvikpswsTest();

    /**
     * TC Kimlik No'dan Ki\u015fi N�fus Bilgisi Sorgulama
     * 
     * @param sifre
     * @param tcKimlikNo
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.KisiBilgisiSonucu
     */
    @WebMethod(operationName = "TCKimlikNodanKisiBilgisiSorgula", action = "http://sgknet/SGKKPSWebServis/TCKimlikNodanKisiBilgisiSorgula")
    @WebResult(name = "TCKimlikNodanKisiBilgisiSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "TCKimlikNodanKisiBilgisiSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanKisiBilgisiSorgula")
    @ResponseWrapper(localName = "TCKimlikNodanKisiBilgisiSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanKisiBilgisiSorgulaResponse")
    public KisiBilgisiSonucu tcKimlikNodanKisiBilgisiSorgula(
        @WebParam(name = "TCKimlikNo", targetNamespace = "http://sgknet/SGKKPSWebServis")
        long tcKimlikNo,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * TC Kimlik No'dan Vukuats\u0131z (N�fus Olay Bilgileri Olmadan) N�fus Kay\u0131t �rne\u011fi (Ki\u015fi, Aile, N�fusAile Kay\u0131t �rne\u011fi) Sorgulama
     * 
     * @param sorgulanacakKisi
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.NkoSonucu
     */
    @WebMethod(operationName = "TCKimlikNodanVukuatsizNKOSorgula", action = "http://sgknet/SGKKPSWebServis/TCKimlikNodanVukuatsizNKOSorgula")
    @WebResult(name = "TCKimlikNodanVukuatsizNKOSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "TCKimlikNodanVukuatsizNKOSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanVukuatsizNKOSorgula")
    @ResponseWrapper(localName = "TCKimlikNodanVukuatsizNKOSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanVukuatsizNKOSorgulaResponse")
    public gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.NkoSonucu tcKimlikNodanVukuatsizNKOSorgula(
        @WebParam(name = "sorgulanacakKisi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        NkoTCKimlikNoSorguKriteri sorgulanacakKisi,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * TC Kimlik No'dan Vukuatl\u0131 (N�fus Olay Bilgileri ile Birlikte) N�fus Kay\u0131t �rne\u011fi (Ki\u015fi, Aile, N�fusAile Kay\u0131t �rne\u011fi) Sorgulama
     * 
     * @param sorgulanacakKisi
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.NkoSonucu
     */
    @WebMethod(operationName = "TCKimlikNodanVukuatliNKOSorgula", action = "http://sgknet/SGKKPSWebServis/TCKimlikNodanVukuatliNKOSorgula")
    @WebResult(name = "TCKimlikNodanVukuatliNKOSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "TCKimlikNodanVukuatliNKOSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanVukuatliNKOSorgula")
    @ResponseWrapper(localName = "TCKimlikNodanVukuatliNKOSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanVukuatliNKOSorgulaResponse")
    public gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.NkoSonucu tcKimlikNodanVukuatliNKOSorgula(
        @WebParam(name = "sorgulanacakKisi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        NkoTCKimlikNoSorguKriteri sorgulanacakKisi,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * TC Kimlik No'dan Ki\u015fi N�fus Bilgisi, N�fus C�zdan Bilgisi ve Adres Bilgisi Sorgulama
     * 
     * @param sifre
     * @param tcKimlikNo
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.BirlesikKisiBilgileriSonucu
     */
    @WebMethod(operationName = "TCKimlikNodanBirlesikKisiBilgisiSorgula", action = "http://sgknet/SGKKPSWebServis/TCKimlikNodanBirlesikKisiBilgisiSorgula")
    @WebResult(name = "TCKimlikNodanBirlesikKisiBilgisiSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "TCKimlikNodanBirlesikKisiBilgisiSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanBirlesikKisiBilgisiSorgula")
    @ResponseWrapper(localName = "TCKimlikNodanBirlesikKisiBilgisiSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanBirlesikKisiBilgisiSorgulaResponse")
    public BirlesikKisiBilgileriSonucu tcKimlikNodanBirlesikKisiBilgisiSorgula(
        @WebParam(name = "TCKimlikNo", targetNamespace = "http://sgknet/SGKKPSWebServis")
        long tcKimlikNo,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * TC Kimlik No'dan Ki\u015finin Kendisinin ve T�m Ailesinin (E\u015fi, Varsa Eski E\u015fi, �ocuklar, Annesi, Babas\u0131, Karde\u015fleri) Bilgilerini Sorgulama
     * 
     * @param sifre
     * @param tcKimlikNo
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.AileBilgisiSonucu
     */
    @WebMethod(operationName = "TCKimlikNodanAileBireyleriniSorgula", action = "http://sgknet/SGKKPSWebServis/TCKimlikNodanAileBireyleriniSorgula")
    @WebResult(name = "TCKimlikNodanAileBireyleriniSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "TCKimlikNodanAileBireyleriniSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanAileBireyleriniSorgula")
    @ResponseWrapper(localName = "TCKimlikNodanAileBireyleriniSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanAileBireyleriniSorgulaResponse")
    public AileBilgisiSonucu tcKimlikNodanAileBireyleriniSorgula(
        @WebParam(name = "TCKimlikNo", targetNamespace = "http://sgknet/SGKKPSWebServis")
        long tcKimlikNo,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * TC Kimlik No'dan Mavi Kart Bilgisi Sorgulama
     * 
     * @param sifre
     * @param tcKimlikNo
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns namespacemavikart.MaviKartliKisiBilgisiSonucu
     */
    @WebMethod(operationName = "TCKimlikNodanMaviKartSorgula", action = "http://sgknet/SGKKPSWebServis/TCKimlikNodanMaviKartSorgula")
    @WebResult(name = "TCKimlikNodanMaviKartSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "TCKimlikNodanMaviKartSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanMaviKartSorgula")
    @ResponseWrapper(localName = "TCKimlikNodanMaviKartSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanMaviKartSorgulaResponse")
    public gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.namespacemavikart.MaviKartliKisiBilgisiSonucu tcKimlikNodanMaviKartSorgula(
        @WebParam(name = "TCKimlikNo", targetNamespace = "http://sgknet/SGKKPSWebServis")
        long tcKimlikNo,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * Ki\u015fi Bilgilerinden Kimlik Bilgisi Sorgulama
     * 
     * @param sorgulanacakKisi
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.KisiBilgilerindenKisiBilgisiSonucu
     */
    @WebMethod(operationName = "KisiBilgisindenKimlikBilgisiSorgula", action = "http://sgknet/SGKKPSWebServis/KisiBilgisindenKimlikBilgisiSorgula")
    @WebResult(name = "KisiBilgisindenKimlikBilgisiSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "KisiBilgisindenKimlikBilgisiSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KisiBilgisindenKimlikBilgisiSorgula")
    @ResponseWrapper(localName = "KisiBilgisindenKimlikBilgisiSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KisiBilgisindenKimlikBilgisiSorgulaResponse")
    public KisiBilgilerindenKisiBilgisiSonucu kisiBilgisindenKimlikBilgisiSorgula(
        @WebParam(name = "sorgulanacakKisi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        KisiSorgulaKisiBilgiSorguKriteri sorgulanacakKisi,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * Ki\u015fi Bilgilerinden Mavi Kart Bilgisi Sorgulama
     * 
     * @param sorgulanacakKisi
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.MaviKartliKisiBilgisiSonucu
     */
    @WebMethod(operationName = "KisiBilgisindenMaviKartSorgula", action = "http://sgknet/SGKKPSWebServis/KisiBilgisindenMaviKartSorgula")
    @WebResult(name = "KisiBilgisindenMaviKartSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "KisiBilgisindenMaviKartSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KisiBilgisindenMaviKartSorgula")
    @ResponseWrapper(localName = "KisiBilgisindenMaviKartSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KisiBilgisindenMaviKartSorgulaResponse")
    public gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.sgknet.sgkkpswebservis.MaviKartliKisiBilgisiSonucu kisiBilgisindenMaviKartSorgula(
        @WebParam(name = "sorgulanacakKisi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        MaviKartSorgulaKisiBilgiSorguKriteri sorgulanacakKisi,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * N�fus Kay\u0131t Yeri Bilgilerinden Ki\u015fi Bilgisi Sorgulama
     * 
     * @param sorgulanacakKisi
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.KayitYerindenKisiBilgisiSonucu
     */
    @WebMethod(operationName = "KayitYerindenKisiBilgisiSorgula", action = "http://sgknet/SGKKPSWebServis/KayitYerindenKisiBilgisiSorgula")
    @WebResult(name = "KayitYerindenKisiBilgisiSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "KayitYerindenKisiBilgisiSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KayitYerindenKisiBilgisiSorgula")
    @ResponseWrapper(localName = "KayitYerindenKisiBilgisiSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KayitYerindenKisiBilgisiSorgulaResponse")
    public KayitYerindenKisiBilgisiSonucu kayitYerindenKisiBilgisiSorgula(
        @WebParam(name = "sorgulanacakKisi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        KayitYerindenKisiSorguKriteri sorgulanacakKisi,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * N�fus Kay\u0131t Yeri Bilgilerinden Vukuats\u0131z (N�fus Olay Bilgileri Olmadan) N�fus Kay\u0131t �rne\u011fi Sorgulama
     * 
     * @param sorgulanacakKisi
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns nkosorgulakayityeri.NkoSonucu
     */
    @WebMethod(operationName = "KayitYerindenVukuatsizNKOSorgula", action = "http://sgknet/SGKKPSWebServis/KayitYerindenVukuatsizNKOSorgula")
    @WebResult(name = "KayitYerindenVukuatsizNKOSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "KayitYerindenVukuatsizNKOSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KayitYerindenVukuatsizNKOSorgula")
    @ResponseWrapper(localName = "KayitYerindenVukuatsizNKOSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KayitYerindenVukuatsizNKOSorgulaResponse")
    public gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulakayityeri.NkoSonucu kayitYerindenVukuatsizNKOSorgula(
        @WebParam(name = "sorgulanacakKisi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        NkoKayitYeriSorguKriteri sorgulanacakKisi,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * N�fus Kay\u0131t Yeri Bilgilerinden Vukuatl\u0131 (N�fus Olay Bilgileri ile Birlikte) N�fus Kay\u0131t �rne\u011fi Sorgulama
     * 
     * @param sorgulanacakKisi
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns nkosorgulakayityeri.NkoSonucu
     */
    @WebMethod(operationName = "KayitYerindenVukuatliNKOSorgula", action = "http://sgknet/SGKKPSWebServis/KayitYerindenVukuatliNKOSorgula")
    @WebResult(name = "KayitYerindenVukuatliNKOSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "KayitYerindenVukuatliNKOSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KayitYerindenVukuatliNKOSorgula")
    @ResponseWrapper(localName = "KayitYerindenVukuatliNKOSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KayitYerindenVukuatliNKOSorgulaResponse")
    public gov.sgk.sgep.base.webservice.consumer.mernis.wsdl.nkosorgulakayityeri.NkoSonucu kayitYerindenVukuatliNKOSorgula(
        @WebParam(name = "sorgulanacakKisi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        NkoKayitYeriSorguKriteri sorgulanacakKisi,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * Yabanc\u0131 Kimlik No'dan Yabanc\u0131 Ki\u015fi N�fus Bilgisi Sorgulama
     * 
     * @param yabanciKimlikNo
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.YbKimlikNoIleYbKisiBilgisiSonucu
     */
    @WebMethod(operationName = "YabanciKimlikNodanYabanciKisiBilgisiSorgula", action = "http://sgknet/SGKKPSWebServis/YabanciKimlikNodanYabanciKisiBilgisiSorgula")
    @WebResult(name = "YabanciKimlikNodanYabanciKisiBilgisiSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "YabanciKimlikNodanYabanciKisiBilgisiSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.YabanciKimlikNodanYabanciKisiBilgisiSorgula")
    @ResponseWrapper(localName = "YabanciKimlikNodanYabanciKisiBilgisiSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.YabanciKimlikNodanYabanciKisiBilgisiSorgulaResponse")
    public YbKimlikNoIleYbKisiBilgisiSonucu yabanciKimlikNodanYabanciKisiBilgisiSorgula(
        @WebParam(name = "yabanciKimlikNo", targetNamespace = "http://sgknet/SGKKPSWebServis")
        long yabanciKimlikNo,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * Yabanc\u0131 Ki\u015fi Bilgilerinden Yabanc\u0131 Kimlik Bilgisi Sorgulama
     * 
     * @param sorgulanacakKisi
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.KisiBilgisiIleYbKisiBilgisiSonucu
     */
    @WebMethod(operationName = "YabanciKisiBilgisindenKimlikBilgisiSorgula", action = "http://sgknet/SGKKPSWebServis/YabanciKisiBilgisindenKimlikBilgisiSorgula")
    @WebResult(name = "YabanciKisiBilgisindenKimlikBilgisiSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "YabanciKisiBilgisindenKimlikBilgisiSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.YabanciKisiBilgisindenKimlikBilgisiSorgula")
    @ResponseWrapper(localName = "YabanciKisiBilgisindenKimlikBilgisiSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.YabanciKisiBilgisindenKimlikBilgisiSorgulaResponse")
    public KisiBilgisiIleYbKisiBilgisiSonucu yabanciKisiBilgisindenKimlikBilgisiSorgula(
        @WebParam(name = "sorgulanacakKisi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        KisiBilgisiIleYbKisiSorguKriteri sorgulanacakKisi,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * TC Kimlik No'dan Ki\u015fiye Verilen En Son N�fus C�zdan Bilgisini Sorgulama
     * 
     * @param sifre
     * @param tcKimlikNo
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.CuzdanBilgisiSonucu
     */
    @WebMethod(operationName = "TCKimlikNodanNufusCuzdaniSorgula", action = "http://sgknet/SGKKPSWebServis/TCKimlikNodanNufusCuzdaniSorgula")
    @WebResult(name = "TCKimlikNodanNufusCuzdaniSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "TCKimlikNodanNufusCuzdaniSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanNufusCuzdaniSorgula")
    @ResponseWrapper(localName = "TCKimlikNodanNufusCuzdaniSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanNufusCuzdaniSorgulaResponse")
    public CuzdanBilgisiSonucu tcKimlikNodanNufusCuzdaniSorgula(
        @WebParam(name = "TCKimlikNo", targetNamespace = "http://sgknet/SGKKPSWebServis")
        long tcKimlikNo,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * Belirtilen Tarih ve Olay Tipine G�re Ki\u015fi Listesi Sorgulama ve Sayfalama
     * 
     * @param tarih
     * @param sifre
     * @param tip
     * @param sayfaAnahtari
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.OlayListesiSonucu
     */
    @WebMethod(operationName = "OlayBilgisiSorgula", action = "http://sgknet/SGKKPSWebServis/OlayBilgisiSorgula")
    @WebResult(name = "OlayBilgisiSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "OlayBilgisiSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.OlayBilgisiSorgula")
    @ResponseWrapper(localName = "OlayBilgisiSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.OlayBilgisiSorgulaResponse")
    public OlayListesiSonucu olayBilgisiSorgula(
        @WebParam(name = "tarih", targetNamespace = "http://sgknet/SGKKPSWebServis")
        XMLGregorianCalendar tarih,
        @WebParam(name = "tip", targetNamespace = "http://sgknet/SGKKPSWebServis")
        CstOlay tip,
        @WebParam(name = "sayfaAnahtari", targetNamespace = "http://sgknet/SGKKPSWebServis")
        long sayfaAnahtari,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * Mavi Kartl\u0131 i�in TC Kimlik No'dan Vukuats\u0131z (N�fus Olay Bilgileri Olmadan) N�fus Kay\u0131t �rne\u011fi (Ki\u015fi, Aile, N�fusAile Kay\u0131t �rne\u011fi) Sorgulama
     * 
     * @param sorgulanacakKisi
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.NkoMaviKartSonucu
     */
    @WebMethod(operationName = "TCKimlikNodanMaviKartliVukuatsizNKOSorgula", action = "http://sgknet/SGKKPSWebServis/TCKimlikNodanMaviKartliVukuatsizNKOSorgula")
    @WebResult(name = "TCKimlikNodanMaviKartliVukuatsizNKOSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "TCKimlikNodanMaviKartliVukuatsizNKOSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanMaviKartliVukuatsizNKOSorgula")
    @ResponseWrapper(localName = "TCKimlikNodanMaviKartliVukuatsizNKOSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanMaviKartliVukuatsizNKOSorgulaResponse")
    public NkoMaviKartSonucu tcKimlikNodanMaviKartliVukuatsizNKOSorgula(
        @WebParam(name = "sorgulanacakKisi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        NkoMaviKartSorguKriteri sorgulanacakKisi,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * Mavi Kartl\u0131 i�in TC Kimlik No'dan Vukuatl\u0131 (N�fus Olay Bilgileri ile Birlikte) N�fus Kay\u0131t �rne\u011fi (Ki\u015fi, Aile, N�fusAile Kay\u0131t �rne\u011fi) Sorgulama
     * 
     * @param sorgulanacakKisi
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.NkoMaviKartSonucu
     */
    @WebMethod(operationName = "TCKimlikNodanMaviKartliVukuatliNKOSorgula", action = "http://sgknet/SGKKPSWebServis/TCKimlikNodanMaviKartliVukuatliNKOSorgula")
    @WebResult(name = "TCKimlikNodanMaviKartliVukuatliNKOSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "TCKimlikNodanMaviKartliVukuatliNKOSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanMaviKartliVukuatliNKOSorgula")
    @ResponseWrapper(localName = "TCKimlikNodanMaviKartliVukuatliNKOSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanMaviKartliVukuatliNKOSorgulaResponse")
    public NkoMaviKartSonucu tcKimlikNodanMaviKartliVukuatliNKOSorgula(
        @WebParam(name = "sorgulanacakKisi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        NkoMaviKartSorguKriteri sorgulanacakKisi,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * TC Kimlik No'dan Ki\u015fiye Verilen En Son Mavi Kart C�zdan Bilgisini Sorgulama
     * 
     * @param sifre
     * @param tcKimlikNo
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.MaviKartBilgisiSonucu
     */
    @WebMethod(operationName = "TCKimlikNodanMaviKartCuzdaniSorgula", action = "http://sgknet/SGKKPSWebServis/TCKimlikNodanMaviKartCuzdaniSorgula")
    @WebResult(name = "TCKimlikNodanMaviKartCuzdaniSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "TCKimlikNodanMaviKartCuzdaniSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanMaviKartCuzdaniSorgula")
    @ResponseWrapper(localName = "TCKimlikNodanMaviKartCuzdaniSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.TCKimlikNodanMaviKartCuzdaniSorgulaResponse")
    public MaviKartBilgisiSonucu tcKimlikNodanMaviKartCuzdaniSorgula(
        @WebParam(name = "TCKimlikNo", targetNamespace = "http://sgknet/SGKKPSWebServis")
        long tcKimlikNo,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * Verilen Tarih Aral\u0131\u011f\u0131nda Vatanda\u015f De\u011fi\u015fenleri Sorgulama ve Sayfalama
     * 
     * @param bitisTarihi
     * @param sifre
     * @param sayfaAnahtari
     * @param uygUserKulAdi
     * @param degisimTuru
     * @param baslangicTarihi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.VatandasDegisenListesiSonucu
     */
    @WebMethod(operationName = "VatandasDegisenlerSorgula", action = "http://sgknet/SGKKPSWebServis/VatandasDegisenlerSorgula")
    @WebResult(name = "VatandasDegisenlerSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "VatandasDegisenlerSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.VatandasDegisenlerSorgula")
    @ResponseWrapper(localName = "VatandasDegisenlerSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.VatandasDegisenlerSorgulaResponse")
    public VatandasDegisenListesiSonucu vatandasDegisenlerSorgula(
        @WebParam(name = "baslangicTarihi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String baslangicTarihi,
        @WebParam(name = "bitisTarihi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String bitisTarihi,
        @WebParam(name = "degisimTuru", targetNamespace = "http://sgknet/SGKKPSWebServis")
        CstDegisimTuru degisimTuru,
        @WebParam(name = "sayfaAnahtari", targetNamespace = "http://sgknet/SGKKPSWebServis")
        long sayfaAnahtari,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * Kimlik No'dan Yerle\u015fim Yeri Adres Bilgisi Sorgulama
     * 
     * @param sifre
     * @param uygUserKulAdi
     * @param kulAdi
     * @param kimlikNo
     * @return
     *     returns sgknet.sgkkpswebservis.KimlikNoileKisiAdresBilgileriSonucu
     */
    @WebMethod(operationName = "KimlikNodanYerlesimYeriAdresBilgisiSorgula", action = "http://sgknet/SGKKPSWebServis/KimlikNodanYerlesimYeriAdresBilgisiSorgula")
    @WebResult(name = "KimlikNodanYerlesimYeriAdresBilgisiSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "KimlikNodanYerlesimYeriAdresBilgisiSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KimlikNodanYerlesimYeriAdresBilgisiSorgula")
    @ResponseWrapper(localName = "KimlikNodanYerlesimYeriAdresBilgisiSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.KimlikNodanYerlesimYeriAdresBilgisiSorgulaResponse")
    public KimlikNoileKisiAdresBilgileriSonucu kimlikNodanYerlesimYeriAdresBilgisiSorgula(
        @WebParam(name = "kimlikNo", targetNamespace = "http://sgknet/SGKKPSWebServis")
        long kimlikNo,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

    /**
     * Parametre Sorgulama T�r�nden o Parametreye Ait Verileri Sorgulama
     * 
     * @param parametre
     * @return
     *     returns sgknet.sgkkpswebservis.ParametreBilgisiSonucu
     */
    @WebMethod(operationName = "ParametreSorgulama", action = "http://sgknet/SGKKPSWebServis/ParametreSorgulama")
    @WebResult(name = "ParametreSorgulamaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "ParametreSorgulama", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.ParametreSorgulama")
    @ResponseWrapper(localName = "ParametreSorgulamaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.ParametreSorgulamaResponse")
    public ParametreBilgisiSonucu parametreSorgulama(
        @WebParam(name = "parametre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String parametre);

    /**
     * TC Kimlik No'dan Olay Tarih Bilgisini Sorgulama
     * 
     * @param sifre
     * @param tcKimlikNo
     * @param uygUserKulAdi
     * @param kulAdi
     * @return
     *     returns sgknet.sgkkpswebservis.VatandasOlayTarihSonucu
     */
    @WebMethod(operationName = "VatandasOlayTarihSorgula", action = "http://sgknet/SGKKPSWebServis/VatandasOlayTarihSorgula")
    @WebResult(name = "VatandasOlayTarihSorgulaResult", targetNamespace = "http://sgknet/SGKKPSWebServis")
    @RequestWrapper(localName = "VatandasOlayTarihSorgula", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.VatandasOlayTarihSorgula")
    @ResponseWrapper(localName = "VatandasOlayTarihSorgulaResponse", targetNamespace = "http://sgknet/SGKKPSWebServis", className = "sgknet.sgkkpswebservis.VatandasOlayTarihSorgulaResponse")
    public VatandasOlayTarihSonucu vatandasOlayTarihSorgula(
        @WebParam(name = "TCKimlikNo", targetNamespace = "http://sgknet/SGKKPSWebServis")
        long tcKimlikNo,
        @WebParam(name = "kulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String kulAdi,
        @WebParam(name = "sifre", targetNamespace = "http://sgknet/SGKKPSWebServis")
        BigDecimal sifre,
        @WebParam(name = "uygUserKulAdi", targetNamespace = "http://sgknet/SGKKPSWebServis")
        String uygUserKulAdi);

}
