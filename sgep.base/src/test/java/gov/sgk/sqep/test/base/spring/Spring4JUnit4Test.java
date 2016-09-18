package gov.sgk.sqep.test.base.spring;

import static org.junit.Assert.assertTrue;

import java.io.Serializable;
import java.net.MalformedURLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cache.CacheManager;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.jdbc.SqlConfig;
import org.springframework.test.context.jdbc.SqlGroup;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.context.WebApplicationContext;

import gov.sgk.sgep.base.api.business.IDomainSecurityService;
import gov.sgk.sgep.base.api.business.IDomainUserService;
import gov.sgk.sgep.base.api.business.ILogService;
import gov.sgk.sgep.base.api.business.engine.IBusinessRuleEngine;
import gov.sgk.sgep.base.api.business.engine.OpenLRuleContextImpl;
import gov.sgk.sgep.base.api.model.auth.Function;
import gov.sgk.sgep.base.api.model.auth.Role;
import gov.sgk.sgep.base.api.model.prm.Il;
import gov.sgk.sgep.base.api.model.system.Kimlik;
import gov.sgk.sgep.base.api.utility.ApplicationMode;
import gov.sgk.sgep.base.api.utility.ApplicationPropertyName;
import gov.sgk.sgep.base.api.utility.ITemplateEngine;
import gov.sgk.sgep.base.api.utility.QueryResult;
import gov.sgk.sgep.base.spring.aop.AServiceAspect;
import gov.sgk.sgep.base.spring.message.IMessageSource;
import gov.sgk.sgep.base.spring.security.DefaultAuthenticationProvider;
import gov.sgk.sgep.base.system.SpringContextProvider;
import gov.sgk.sgep.base.system.SystemPropertiesWrapper;
import gov.sgk.sgep.base.webservice.consumer.emekli4a.Emekli4aClient;
import gov.sgk.sgep.base.webservice.consumer.emekli4a.wsdl.TahnoGetirResponse;
import gov.sgk.sgep.base.webservice.consumer.emekli4b.Emekli4bClient;
import gov.sgk.sgep.base.webservice.consumer.emekli4b.wsdl.SigortaliAylikDurumSorgulaResponse;
import gov.sgk.sgep.base.webservice.consumer.emekli4c.Emekli4cClient;
import gov.sgk.sgep.base.webservice.consumer.emekli4c.wsdl.AylikBilgisi4CResponse;
import gov.sgk.sgep.base.webservice.consumer.mernis.MernisClient;
import gov.sgk.sgep.base.webservice.consumer.meyes.MeyesClient;
import gov.sgk.sgep.base.webservice.consumer.meyes.wsdl.KullaniciBilgiYetkiGetirResponse;
import gov.sgk.sgep.base.webservice.consumer.meyes.wsdl.KullaniciUniteResponse;
import gov.sgk.sgep.base.webservice.consumer.spas.SpasClient;
import gov.sgk.sgep.base.webservice.consumer.spas.wsdl.GetSpasTescilForOnlySicilOrTcResponse;
import gov.sgk.sgep.utility.SgepConstants;
import gov.sgk.sqep.test.base.spring.beans.ITestServiceForBaseService;
import gov.sgk.sqep.test.base.spring.beans.ITestServiceForCache;
import gov.sgk.sqep.test.base.spring.beans.TestServiceForCache;
import gov.sgk.sqep.test.base.spring.conf.EhCacheConfigTest;
import gov.sgk.sqep.test.base.spring.model.BolumTest;
import gov.sgk.sqep.test.base.spring.model.DersTest;
import gov.sgk.sqep.test.base.spring.model.OgrenciTest;

/**
 * 
 * @author o-mssahin
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TestConfiguration.class)
@TransactionConfiguration(defaultRollback = true)
@Transactional
@WebAppConfiguration
public class Spring4JUnit4Test {
	public static final String URL_PREFIX = "http://localhost";
	static {
		System.setProperty("user.language", "en");
	}
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Spring4JUnit4Test.class);

	@Autowired
	WebApplicationContext applicationContext;

	@Autowired @Qualifier ("domainUserServiceTest")	
	IDomainUserService domainUserServiceTest;

	@org.junit.Before
	public void setup () {
		AServiceAspect.DISABLE_SECURITY_FOR_TEST = true;
	}
	
	@Test
	public void testSessionFactory() {
		assertTrue(applicationContext.getBean("sessionFactory") != null);
	}
	
	@Test
	public void testAppContextApplicationPropertiesFile() {
		String propName = SpringContextProvider.getContext().getEnvironment().getProperty(ApplicationPropertyName.PROP_NAME_APPLICATION_MODE.getJvmParamName());
		assertTrue(StringUtils.equalsIgnoreCase(ApplicationMode.TEST.name(), propName));
	}
	
	//@Test
	public void testMail() {
		assertTrue(applicationContext.getBean("mailSender") != null);
		JavaMailSenderImpl mailer = (JavaMailSenderImpl) applicationContext.getBean("mailSender");
		SimpleMailMessage simpleMessage = new SimpleMailMessage();
		simpleMessage.setTo("o-psungur@sgk.gov.tr");
		simpleMessage.setText("Deneme "  + new Date());
		simpleMessage.setSubject("Deneme-konu");
		try {
			mailer.send(simpleMessage);
		} catch (MailException e) {
			Assert.assertTrue(e instanceof org.springframework.mail.MailSendException);
			Assert.assertTrue(StringUtils.indexOf(e.getMessage(), "Couldn't connect to host, port: eposta.sgk.gov.tr, 25") >= 0);
		} catch (Exception e) {
			Assert.assertTrue(false);
		}
	}
	
	@Test
	public void testQuartz() {
			
			System.out.println("ok");

	}
	
	
	@Test
	public void testAuthenticationProviderAuthOk () {
		DefaultAuthenticationProvider provider = applicationContext.getBean(DefaultAuthenticationProvider.class);
		provider.setDomainUserService(domainUserServiceTest); //testusers.properties dosyasından okunuyor
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken("ADMIN", "passadmin");
		provider.authenticate(token);
	}
	
	@Test
	public void testAuthenticationProviderAuthFail () {
		DefaultAuthenticationProvider provider = applicationContext.getBean(DefaultAuthenticationProvider.class);
		provider.setDomainUserService(domainUserServiceTest); //testusers.properties dosyasından okunuyor
		UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken("ADMIN", ".asd.asdas");
		Authentication auth = provider.authenticate(token);			
		Assert.assertTrue(auth == null);
	}
	
	@Test
	public void testCacheExistence() {
		CacheManager cacheManager = (CacheManager) SpringContextProvider.getContext().getBean("cacheManager");
		Assert.assertTrue(cacheManager != null);
		Assert.assertTrue(cacheManager.getCache(EhCacheConfigTest.CACHE_NAME_TEST) != null);
	}

	@Test
	public void testCacheReads() {
		ITestServiceForCache testServiceForCache = applicationContext.getBean(ITestServiceForCache.class);
		testServiceForCache.getPojoCachable("test");
		testServiceForCache.getPojoCachable("test");
		testServiceForCache.getPojoCachable("test");
		testServiceForCache.getPojoCachable("test");
		Assert.assertTrue("erişim sayısı 1 olmalı, EhCacheConfigTest configuration'da import edilmemiş olabilir", TestServiceForCache.readCountCachable == 1);
		testServiceForCache.getPojoNotCachable("testx");
		testServiceForCache.getPojoNotCachable("testx");
		Assert.assertTrue(TestServiceForCache.readCountNotCachable == 2);
	}
	
	@Test
	public void testSystemPropertiesWrapper () {
		SystemPropertiesWrapper sys = applicationContext.getBean(SystemPropertiesWrapper.class);
		LOGGER.info("Application Mode: " + sys.getApplicationMode());
		Assert.assertTrue("TEST".equals(sys.getApplicationMode().name()));
		LOGGER.info(sys.getProperty("abc.xyz"));
	}
	
	@Test
	public void testMessageResource () {
		IMessageSource ms = applicationContext.getBean("messageSource", IMessageSource.class);
		Assert.assertEquals("default msg1", ms.getMessage("msg1", null, Locale.ENGLISH));
		Assert.assertEquals("varsayılan msg1", ms.getMessage("msg1", null, SgepConstants.LOCALE_TURKISH));
		SystemPropertiesWrapper spw = applicationContext.getBean(SystemPropertiesWrapper.class);
		if (SgepConstants.LOCALE_TURKISH.equals(spw.getDefaultLocale())) {
			Assert.assertEquals(ms.getMessage("msg1"), "varsayılan msg1");
		} else if (Locale.ENGLISH.equals(spw.getDefaultLocale())) {
			Assert.assertEquals(ms.getMessage("msg1"), "default msg1");
		}
	}
	
	@Test
	public void testLabelResource () {
		IMessageSource ms = applicationContext.getBean("labelSource", IMessageSource.class);
		Assert.assertEquals("deneme.lbl1.en", ms.getMessage("label1", null, Locale.ENGLISH));
		Assert.assertEquals("deneme.lbl1", ms.getMessage("label1", null, SgepConstants.LOCALE_TURKISH));
		SystemPropertiesWrapper spw = applicationContext.getBean(SystemPropertiesWrapper.class);
		
		if (SgepConstants.LOCALE_TURKISH.equals(spw.getDefaultLocale())) {
			Assert.assertEquals(ms.getMessage("msg1"), "deneme.lbl1");
		} else if (Locale.ENGLISH.equals(spw.getDefaultLocale())) {
			Assert.assertEquals(ms.getMessage("msg1"), "deneme.lbl1.en");
		}
	}
	
	@Test
	@SqlGroup({
		@Sql(scripts = "/test-sec-data.sql", config = @SqlConfig(separator="GO", commentPrefix = "`")),
	})
	public void testRoleFunction () {
		IDomainSecurityService domainSecurityService = applicationContext.getBean(IDomainSecurityService.class);
		Assert.assertEquals(5, domainSecurityService.listFunction().size());
		String modulAdi = SpringContextProvider.getSystemPropertiesWrapper().getModulAdi();
		Role dbRole = domainSecurityService.getRole("ROLE_TEST", modulAdi);
		Assert.assertEquals(4, dbRole.getFunctions().size());
		Assert.assertEquals(1, dbRole.getMenus().size());
		
		dbRole.setGuncellemeZamani(new Timestamp(new Date().getTime()));
		Function function = domainSecurityService.getFuntion("sadeceAdminCagirabilir", modulAdi);
		dbRole.getFunctions().add(function);
		dbRole = domainSecurityService.getRole("ROLE_TEST", modulAdi);
		Assert.assertEquals(5, dbRole.getFunctions().size());
		domainSecurityService.updateRole(dbRole);
	}
	
	@Test
	@SqlGroup({
		@Sql(scripts = "/test-sec-data.sql", config = @SqlConfig(separator="GO", commentPrefix = "`"))
	})
	public void testRoleMenu () {
		String modulAdi = SpringContextProvider.getSystemPropertiesWrapper().getModulAdi();
		IDomainSecurityService domainSecurityService = applicationContext.getBean(IDomainSecurityService.class);
		Role dbRole = domainSecurityService.getRole("ROLE_TEST", modulAdi);
		Assert.assertEquals(1, dbRole.getMenus().size());
	}
	
	@Test
	public void testRuleEngineExistence () {
		IBusinessRuleEngine businessRuleEngine = applicationContext.getBean("businessRuleEngine", IBusinessRuleEngine.class);
		Assert.assertTrue(businessRuleEngine != null);
	}
	
	@Test
	public void testRuleEngineOpenLDesicion () {
		IBusinessRuleEngine businessRuleEngine = applicationContext.getBean("businessRuleEngine", IBusinessRuleEngine.class);
		Assert.assertTrue(businessRuleEngine != null);
		OpenLRuleContextImpl<String> context = new OpenLRuleContextImpl<>("hello1", "decision-table.xlsx");
		context.addParamType(int.class);
		context.addArgs(12);		
		String result =  (String) businessRuleEngine.execute(context);
		Assert.assertEquals("Günaydın, Dünya", result);
		
		context.clear().addParamType(int.class).addArgs(14);
		result =  (String) businessRuleEngine.execute(context);
		Assert.assertEquals("Tünaydın, Dünya", result);
	}
	
	@Test
	public void testRuleEngineOpenLLookup () {
		IBusinessRuleEngine businessRuleEngine = applicationContext.getBean("businessRuleEngine", IBusinessRuleEngine.class);
		Assert.assertTrue(businessRuleEngine != null);
		
		OpenLRuleContextImpl<Integer> context = new OpenLRuleContextImpl<Integer>("ceza", "lookup-table.xlsx");
		Sigortali sigortali = new Sigortali();
		sigortali.setKapsam("4A");
		sigortali.setSehir("KONYA");
		context.addParamType(Sigortali.class).addArgs(sigortali);
		Integer result =  businessRuleEngine.execute(context);
		org.junit.Assert.assertEquals(new Integer(1), result);
		
		context.clear();
		sigortali.setKapsam("4C");
		sigortali.setSehir("İZMİR");
		context.addParamType(Sigortali.class).addArgs(sigortali);
		result =  businessRuleEngine.execute(context);
		org.junit.Assert.assertEquals(new Integer(6), result);
		
		//Uyuşmayan kayıt olma durumunu test
		context.clear();
		sigortali.setKapsam("YOK");
		sigortali.setSehir(null);
		context.addParamType(Sigortali.class).addArgs(sigortali);
		result =  businessRuleEngine.execute(context);
		org.junit.Assert.assertEquals(new Integer(-1), result);
	}
	
	@Test
	public void testTemplateEngineExistence () {
		Object ve = applicationContext.getBean(SgepConstants.BEAN_NAME_VELOCITY_ENGINE);
		Assert.assertTrue(ve != null);
	}
	
	@Test
	public void testTemplateEngine () {
		ITemplateEngine templateEngine = applicationContext.getBean(ITemplateEngine.class);
		Sigortali sigortali = new Sigortali();
		String kapsam = "kaspam123";
		sigortali.setKapsam(kapsam);
		sigortali.setSehir("sehir456");
		Map<String, Object> map = new java.util.HashMap<>();
		map.put("sig", sigortali);
		String sonuc = templateEngine.mergeTemplateIntoString("sigortali.vm", map);
		System.out.println(sonuc);
		Assert.assertTrue(sonuc.indexOf(kapsam) >= 0);		
	}
	
	@Test
	public void testReportEngineExistence () {
		Object re = applicationContext.getBean(SgepConstants.BEAN_NAME_REPORT_ENGINE);
		Assert.assertTrue(re != null);
	}
	
	
	//@Test
	public void testMeyesClient() {
	
		MeyesClient meyesClient = SpringContextProvider.getMeyesClient();
		
		System.out.println("Meyes Web Service Response");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(" ");
		System.out.println("Kullanıcı Ünite Bilgisi Getir");
		System.out.println("-----------------------------");
		
		KullaniciUniteResponse response = meyesClient.getKullaniciUnite("00000226", "uygtest");
		System.out.print("Adı Soyadı:" + response.getKullaniciUniteReturn().getKullaniciAdi().trim());
		
		System.out.print("  ");
		
		System.out.println(response.getKullaniciUniteReturn().getKullaniciSoyadi().trim());
		System.out.println("Tc Kimlik No:" + response.getKullaniciUniteReturn().getKullaniciTcKimlikNo());
		
		System.out.println("Kullanıcı Yetki Bilgilerini Getir");
		System.out.println("---------------------------------");
		
		KullaniciBilgiYetkiGetirResponse res = meyesClient.getKullaniciBilgiYetki("00000226", "uygtest", "10.254.5.12");
		System.out.println(res.getKullaniciBilgiYetkiGetirReturn().getSonucKodu());
		

	}
	
	//@Test
	public void testSpasClient() {
	
		SpasClient spasClient = SpringContextProvider.getSpasClient();
		
		System.out.println("Spas Web Service Response");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(" ");
		System.out.println("Kullanıcı Tescil Bilgileri");
		System.out.println("-----------------------------");
		
		GetSpasTescilForOnlySicilOrTcResponse response = spasClient.getSpasTescil("11602235370");
		System.out.println("Tescil Bilgisi : " + response.getGetSpasTescilForOnlySicilOrTcReturn().getKapsamOkuDVO().get(0).getSicilNo());
		System.out.println("-----------------------------");	

	}
	
	//@Test
	public void testMernisClient(){
		MernisClient mernisClient = SpringContextProvider.getMernisClient();
		try {
			Kimlik kimlik = mernisClient.getKimlik(11602235370L);
			System.out.println(kimlik.getAdi());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//@Test
	public void testEmekli4aClient() {
		
		Emekli4aClient emekli = SpringContextProvider.getEmekli4aClient();
		
		System.out.println("Emekli  4A Web Service Response");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		System.out.println(" ");
		System.out.println("------------- Start----------------");
		
		TahnoGetirResponse response = emekli.getTahnoGetir("17485778478", "SgepSigortaYazilimlari", "283430AJNXH419154");
		System.out.println("Tahno : " + response.getTahnoGetirReturn().getEmeklilik().get(0).getTahno());
		
		System.out.println("------------- End ----------------");	

	}
	
	//@Test
	public void testEmekli4bClient(){
		Emekli4bClient emekli = SpringContextProvider.getEmekli4bClient();
		
		System.out.println("Emekli 4B web Service Response");
		System.out.println("******************************");
		System.out.println(" ");
		System.out.println("------------- Start ------------");
		SigortaliAylikDurumSorgulaResponse response = emekli.getSigortaliAylikDurum("0100693200", new Long("54838070308"));
		System.out.println("Aylık Nevi : " + response.getSigortaliAylikDurumSorgulaReturn().getAylikGelirDurumPojo().get(0).getAylikNevi());
		System.out.println("-------------- End -------------");
	}
	
	//@Test
	public void testEmekli4cClient(){
		Emekli4cClient emekli = SpringContextProvider.getEmekli4cClient();
		
		System.out.println("Emekli 4C Web Service Response");
		System.out.println("******************************");
		System.out.println(" ");
		System.out.println("--------- Start --------------");
		
		AylikBilgisi4CResponse response = emekli.getAylikBilgisi("15881674820", "SgepSigortaYazilimlari", "283430AJNXH419154", "10.253.9.11", "199");
		System.out.println("Aylık : " + response.getReturn().getAylikBilgisi4CDVOs().get(0).getAylik());
		System.out.println("------------- End ------------");
	}
	
	@Test
	public void testBaseServiceMethods () {
		ITestServiceForBaseService ts = SpringContextProvider.getContext().getBean(ITestServiceForBaseService.class);
		assertTrue(ts != null);
		
		Il il = new Il();
		il.setKodu(42);
		il.setAdi("Konya");
		il.setAktifMi(true);
		ts.addIl(il);
		il = new Il();
		il.setKodu(6);
		il.setAdi("Ankara");
		il.setAktifMi(true);
		ts.addIl(il);
		assertTrue(ts.getModelById(Il.class, 42) != null);
		assertTrue(ts.getAll(Il.class).size() == 2);
		QueryResult<Il> qr = ts.getAll(Il.class, 0, 1, null, null, null);
		Assert.assertEquals(qr.getData().size(), 1);
		qr = ts.getAll(Il.class, 0, 2, null, null, null);
		Assert.assertEquals(qr.getData().size(), 2);
		Assert.assertEquals(qr.getCount(), 2);
		
		ts.deleteModel(Il.class, 6);
		ts.deleteModel(Il.class, 42);
		addIl(20);
		qr = ts.getAll(Il.class, 0, 10, null, null, null);
		Assert.assertEquals(qr.getData().size(), 10);
		Assert.assertEquals(qr.getCount(), 20);
		
		//Ders ekle
		List<DersTest> dersler = addDers(24);
		
		//bölüm ekle
		BolumTest b = addBolum(BolumTest.BOLUM_ADI_1);
		BolumTest b1 = addBolum(BolumTest.BOLUM_ADI_2);

		//3 öğrenci eklendi
		OgrenciTest o = addOgrenci(OgrenciTest.OGRENCI_ADI_1, b, dersler.subList(0, 5)); // 0..4 dersler
		OgrenciTest o1 = addOgrenci(OgrenciTest.OGRENCI_ADI_2, b, dersler.subList(5, 8)); // 5..7 dersler
		OgrenciTest o2 = addOgrenci(OgrenciTest.OGRENCI_ADI_3, b1, dersler.subList(8, 17)); // 8..16 dersler
		
		LOGGER.info(o1 + " created");
		LOGGER.info(o2 + " created");
		
		Assert.assertEquals(ts.getAll(DersTest.class).size(), 24);
		Assert.assertEquals(ts.getModelById(OgrenciTest.class, o.getId()).getDersler().size(), 5);
		
		testGetAllHasResult (ts);
		testGetAllNoResult (ts);
		testGetAllMultipleFilter (ts);
		testGetAllCollectionOrArray (ts);
		testGetAllMultipleFilterCollectionOrArray(ts);
	}
	
	/**
	 * Birden fazla kriter gönderince
	 * 
	 * @param ts
	 */
	private void testGetAllMultipleFilter(ITestServiceForBaseService ts) {
		Map<String, Serializable> filters = new HashMap<>();
		filters.put("bolum.ad", BolumTest.BOLUM_ADI_1.substring(0,3));
		filters.put("ad", OgrenciTest.OGRENCI_ADI_1);
		QueryResult<OgrenciTest> qrOgrTest = ts.getAll(OgrenciTest.class, 0, 10, null, null, filters);
		Assert.assertEquals(qrOgrTest.getData().size(), 1);	
		
		filters.put("bolum.ad", BolumTest.BOLUM_ADI_1.substring(0,3));
		filters.put("ad", OgrenciTest.OGRENCI_ADI_1.substring(0,5));
		qrOgrTest = ts.getAll(OgrenciTest.class, 0, 10, null, null, filters);
		Assert.assertEquals(qrOgrTest.getData().size(), 2);	
		
		filters.put("bolum.ad", "xxx");
		filters.put("ad", OgrenciTest.OGRENCI_ADI_1.substring(0,5));
		qrOgrTest = ts.getAll(OgrenciTest.class, 0, 10, null, null, filters);
		Assert.assertEquals(qrOgrTest.getData().size(), 0);	
	}

	private void testGetAllHasResult(ITestServiceForBaseService ts) {
		Map<String, Serializable> filters = new HashMap<>();
		filters.put("bolum.ad", "Bo");
		QueryResult<OgrenciTest> qrOgrTest = ts.getAll(OgrenciTest.class, 0, 10, null, null, filters);
		Assert.assertEquals(qrOgrTest.getData().size(), 3);	
	}
	
	private void testGetAllNoResult(ITestServiceForBaseService ts) {
		Map<String, Serializable> filters = new HashMap<>();
		filters.put("bolum.ad", "xxo");
		QueryResult<OgrenciTest> qrOgrTest = ts.getAll(OgrenciTest.class, 0, 10, null, null, filters);
		Assert.assertEquals(qrOgrTest.getData().size(), 0);		
	}
	
	private void testGetAllCollectionOrArray(ITestServiceForBaseService ts) {
		Map<String, Serializable> filters = new HashMap<>();
		ArrayList<String> adlar = new ArrayList<>(Arrays.asList(BolumTest.BOLUM_ADI_1));
		filters.put("bolum.ad", adlar);
		QueryResult<OgrenciTest> qrOgrTest = ts.getAll(OgrenciTest.class, 0, 10, null, null, filters);
		Assert.assertEquals(qrOgrTest.getData().size(), 2);
	}
	
	private void testGetAllMultipleFilterCollectionOrArray(ITestServiceForBaseService ts) {
		Map<String, Serializable> filters = new HashMap<>();
		ArrayList<String> adlar = new ArrayList<>(Arrays.asList(BolumTest.BOLUM_ADI_1));
		filters.put("bolum.ad", adlar);
		filters.put("ad", OgrenciTest.OGRENCI_ADI_1);
		QueryResult<OgrenciTest> qrOgrTest = ts.getAll(OgrenciTest.class, 0, 10, null, null, filters);
		Assert.assertEquals(qrOgrTest.getData().size(), 1);
	}
	
	@Test
	public void testServiceAspect () {
		Object o = SpringContextProvider.getContext().getBean("ServiceAspect");
		assertTrue(o != null);
	}
	
	@Test
	public void testAspectAndLog () {
		ILogService ls = SpringContextProvider.getLogService();
		addIl(1);
		Assert.assertEquals(ls.getCountOfLog(), 1);
	}

	void addIl (int sayi) {
		ITestServiceForBaseService ts = SpringContextProvider.getContext().getBean(ITestServiceForBaseService.class);
		for (int i = 0; i < sayi; i++) {
			Il il = new Il();
			il.setKodu(i);
			il.setAdi(i + "Ders");
			il.setAktifMi(true);
			ts.addIl(il);
		}
	}
	
	List<DersTest> addDers (int sayi) {
		List<DersTest> res = new ArrayList<>();
		ITestServiceForBaseService ts = SpringContextProvider.getContext().getBean(ITestServiceForBaseService.class);
		for (int i = 0; i < sayi; i++) {
			DersTest d = new DersTest();
			ts.addDers(d);
			res.add(d);
		}
		return res;
	}
	
	BolumTest addBolum (String ad) {
		ITestServiceForBaseService ts = SpringContextProvider.getContext().getBean(ITestServiceForBaseService.class);
		BolumTest b = new BolumTest();
		b.setAd(ad);
		ts.addBolum(b);
		return b;
	}
	
	OgrenciTest addOgrenci (String ad, BolumTest bolum, List<DersTest> dersler) {
		ITestServiceForBaseService ts = SpringContextProvider.getContext().getBean(ITestServiceForBaseService.class);
		OgrenciTest o = new OgrenciTest();
		o.setBolum(bolum);
		o.setDersler(new HashSet<>(dersler));
		o.setAd(ad);
		ts.addOgrenci(o);
		return o;
	}
}