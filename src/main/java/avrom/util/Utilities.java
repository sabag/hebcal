package avrom.util;

import java.util.TimeZone;
/**
* Some conversion utilities.
*/

public class Utilities {
	/** Gets a degree in decimal form. */
	public static double getDecimalDegree(int degree, int minute, int second) {
		double total= (double) second / 60;
		total= (total + minute) / 60;
		total += degree;
		return total;
	}

	/** Gets a String of the form degree&deg; minute' second" from a degree in
	* decimal form. Always returns the absolute value. */
	public static String getDegreeString(double degree) {
		degree= Math.abs(degree);
		int d= (int) degree;
		degree -= d;
		degree *= 60;
		int minute= (int) degree;
		degree -= minute;
		degree *= 60;
		int second= (int) degree;

		return d + "&deg; " + minute + "' " + second + "\"";
	}

    public static String[] getTimeZoneList(){
        String[] list= TimeZone.getAvailableIDs();
        TimeZone zone;
        for (int i=0; i < list.length; i++){
            zone = TimeZone.getTimeZone(list[i]);
            int offset= zone.getRawOffset();
            offset= offset/3600000;
            list[i]= list [i] + " (" + offset + ")";
        }

        return list;
    }


}