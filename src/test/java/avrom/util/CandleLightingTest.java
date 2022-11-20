package avrom.util;

import net.sf.hebcal.HebrewDate;
import net.sf.hebcal.HebrewDateException;
import org.junit.Test;

public class CandleLightingTest {

	@Test
	public void testSunriseSunsetTimes() {

		SunRiseSet instance = SunRiseSet.getInstance();

		System.out.println("Netanya Sunrise : " + instance.getSunriseTime().getTime());
		System.out.println("Netanya Sunset :  " + instance.getSunsetTime().getTime());
	}

	@Test
	public void testCandleLighting () throws HebrewDateException {
		HebrewDate hebrewDate = new HebrewDate();
		hebrewDate.setDate(1);

		CandleLighting lighting = new CandleLighting(hebrewDate);
//		lighting.setProperties("cities.properties");
//		String[] keys = lighting.getLocationList().getCityLocaleKeys();
//		for (String key : keys) {
//			System.out.println(key);
//		}

		lighting.setCurrentLocaleKey("Netanya");

		System.out.println("Candlelighting/Havdala Times for: " + lighting.getCurrentLocale().getName());


		for (int i=0; i < hebrewDate.getLastDayOfMonth(); i++) {
			String candle = lighting.getCandleLighting();
			String havdala = lighting.getHavdala();

			if (candle.length() != 0) {
				System.out.println("הדלקת נרות " + hebrewDate.formatHebrewDate_Hebrew() + ' ' + candle);
			}
			if (havdala.length() != 0) {
				System.out.println("הבדלה " + hebrewDate.formatHebrewDate_Hebrew() + ' ' + havdala);
			}

			hebrewDate.forward();
		}
	}


}