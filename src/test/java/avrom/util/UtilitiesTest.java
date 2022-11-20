package avrom.util;

import org.junit.Test;

public class UtilitiesTest {

    @Test
    public void test(){
        double degree = Utilities.getDecimalDegree(48, 25, 0);
        System.out.println("Decimal degree: "+ degree);
        String s = Utilities.getDegreeString(degree);
        System.out.println("Degree: "+ s);

        String[] list = Utilities.getTimeZoneList();
        for (String tz : list) {
            System.out.println(tz);
        }
    }
}