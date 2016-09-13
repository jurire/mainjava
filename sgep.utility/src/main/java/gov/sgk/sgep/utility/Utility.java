package gov.sgk.sgep.utility;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;

/**
 * Sgep projelerinin kullandığı bütün utility metotları bu sınıfta yer alır.<br>
 * Örneğin toString(Object)
 * 
 * @author o-mssahin
 * @since 8 Eki 2015
 *
 */
public abstract class Utility {

	/**
	 * 
	 * @param obj
	 * @return null eğer obj null ise değilse obj.toString
	 */
	public static String toString(Object obj) {
		return Objects.toString(obj, null);
	}

	/**
	 * @param date
	 * @return dd.MM.yyyy formatında string döner
	 */
	public static String toString(Date date) {
		return toString(date, SgepConstants.DATE_FORMAT_DD_MM_YYYY);
	}

	/**
	 * Pattern'ler {@link SgepConstants}'da mevcut DATE_FORMAT ile başlıyor
	 * 
	 * @param date
	 * @param pattern
	 *            örneğin dd.MM.yyyy gibi
	 * @return
	 */
	public static String toString(Date date, String pattern) {
		return new SimpleDateFormat(pattern).format(date);
	}

	/**
	 * 
	 * @param value
	 *            "11.04.2015" gibi tarih formatında string
	 * @return {@link Date} dd.MM.yyyy formatındaki string'i tarihe çevirir
	 *         döner
	 * @throws RuntimeException
	 *             eğer parse error alırsa
	 */
	public static Date parseDate(String value) {
		try {
			return DateUtils.parseDate(value.toString(), SgepConstants.DATE_FORMAT_DD_MM_YYYY);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	/**
	 * date olarak gelen parametrenin saat, dakika ve saniye değerlerini
	 * parametrelere göre belirler
	 * 
	 * @param date
	 * @param hour
	 * @param minute
	 * @param second
	 * @return
	 */
	public static Date setDate(Date date, int hour, int minute, int second) {
		return setDate(date, hour, minute, second, 0);
	}

	/**
	 * date olarak gelen parametrenin saat, dakika, saniye ve milisaniye
	 * değerlerini parametrelere göre belirler
	 * 
	 * @param date
	 * @param hour
	 * @param minute
	 * @param second
	 * @param milisecond
	 * @return
	 */
	public static Date setDate(Date date, int hour, int minute, int second, int milisecond) {
		date = DateUtils.setHours(date, hour);
		date = DateUtils.setMinutes(date, minute);
		date = DateUtils.setSeconds(date, second);
		date = DateUtils.setMilliseconds(date, milisecond);
		return date;
	}

	public static Boolean isTcknValid(String kimlikNo) {
		if (StringUtils.isBlank(kimlikNo) || StringUtils.length(kimlikNo) != 11 || !NumberUtils.isDigits(kimlikNo)) {
			return false;
		}
		int[] hane = new int[11];
		int toplam = 0;
		for (int i = 0; i < 11; i++) {
			hane[i] = Integer.parseInt(String.valueOf(kimlikNo.charAt(i)));
			toplam += hane[i];
		}
		toplam -= hane[10];
		if ((toplam % 10) != hane[10])
			return false;
		if (((hane[0] + hane[2] + hane[4] + hane[6] + hane[8]) * 7 + (hane[1] + hane[3] + hane[5] + hane[7]) * 9) % 10 != hane[9])
			return false;
		if (((hane[0] + hane[2] + hane[4] + hane[6] + hane[8]) * 8) % 10 != hane[10])
			return false;
		return true;
	}
	
	/**
	 * 
	 * @return sonunda {@link File#separator} olacak şekilde döner
	 */
	public static String getJavaTmpdir () {
		String result = System.getProperty("java.io.tmpdir");
		if (!StringUtils.endsWith(result, File.separator)) {
			result = result + File.separator;
		}
		return result;
	}
	
	public static java.sql.Timestamp todayAsTimestamp () {
		return new Timestamp(new Date().getTime());
	}

	public static boolean toBoolean(String propValue) {
		boolean sonuc = false;
		if (StringUtils.isNotBlank(propValue)) {
			sonuc = Boolean.parseBoolean(propValue);
		}
		return sonuc;
	}
	
	/**
	 * 
	 * @param e
	 * @return e'nin tüm trace'ini String olarak döner
	 */
	public static String exceptionToString (Throwable e,Integer stringMaxLenght) {		
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		if (e != null) {
			e.printStackTrace(pw);
		} else {
			sw.write("e is null");
		}
		if (stringMaxLenght==null || stringMaxLenght==0) {		
		  return sw.toString();
		}
		else {
			return StringUtils.substring(sw.toString(), 0, stringMaxLenght) ;
		}
	}
	/**
	 * 
	 * @param e
	 * @return e'nin tüm trace'ini String olarak döner
	 */
	public static String exceptionToString (Throwable e) {
		return exceptionToString(e, 0); 
	}
	
	public static long getDateDiff(Date date1, Date date2, TimeUnit timeUnit) {
	    long diffInMillies = date2.getTime() - date1.getTime();
	    return timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
	}

}
