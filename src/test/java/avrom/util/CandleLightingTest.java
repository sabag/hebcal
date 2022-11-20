package avrom.util;

import java.time.Clock;
import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.util.Date;
import net.sf.hebcal.HebrewDate;
import net.sf.hebcal.HebrewDateException;
import org.junit.Test;

public class CandleLightingTest {

	@Test
	public void testSunriseSunsetTimes() {

		SunRiseSet instance = SunRiseSet.getInstance();

        ZonedDateTime now = ZonedDateTime.now(Clock.systemDefaultZone());
//        ZonedDateTime now = ZonedDateTime.now(Clock.offset(Clock.systemDefaultZone(), Duration.ofHours(-5)));

        LocalTime nowTime = now.toLocalTime();

		Date sunset = instance.getSunsetTime().getTime();
		LocalTime sunsetTime = LocalTime.ofInstant(sunset.toInstant(), now.getZone());

        boolean afterSunset = nowTime.isAfter(sunsetTime);
		System.out.println("nowTime = " + nowTime);
		System.out.println("afterSunset = " + afterSunset);

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