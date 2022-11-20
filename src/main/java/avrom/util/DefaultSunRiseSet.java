package avrom.util;

import java.util.Calendar;
import kevinboone.suntimes.Calculator;
import kevinboone.suntimes.SunTimesException;
import kevinboone.suntimes.Time;

/**
* Concrete subclass of SunRiseSet.<P>
* This uses the classes written by <A HREF="http://www.kevinboone.com/">Kevin Boone</A>.
*/
public class DefaultSunRiseSet extends SunRiseSet
{

	public Calendar getSunriseTime()
	{
		try
		{
			Time time = Calculator.getSunriseTimeUTC_z(date.get(Calendar.YEAR),
					date.get(Calendar.MONTH)+ 1, 
					date.get(Calendar.DAY_OF_MONTH), 
					longitude, latitude, Calculator.CIVIL_ZENITH);

			return getDateFromTime(time);
		}
		catch (SunTimesException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	private Calendar getDateFromTime(Time time)
	{
		Calendar cal= (Calendar) date.clone();
		cal.set(Calendar.HOUR_OF_DAY, time.getHour());
		cal.set(Calendar.MINUTE, time.getMinute());
		cal.set(Calendar.SECOND, time.getSecond());

		return cal;
	}
	public Calendar getSunsetTime()
	{
		try
		{
			Time time = Calculator.getSunsetTimeUTC_z(date.get(Calendar.YEAR),
					date.get(Calendar.MONTH)+ 1, 
					date.get(Calendar.DAY_OF_MONTH), longitude, latitude, Calculator.ZENITH);
			return getDateFromTime(time);
		}
		catch (SunTimesException e)
		{
			e.printStackTrace();
		}

		return null;
	}
}