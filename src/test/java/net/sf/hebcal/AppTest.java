package net.sf.hebcal;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    /**
     * prove that we can print something out.
     */
    @Test
    public void testHebrewFormatString() throws Exception {

        HebrewDate hd = new HebrewDate(12,31,2011, HebrewDate.HEBREW_LOCALE);
        assertEquals("ה׳ בטבת תשע״ב", hd.formatHebrewDate_Hebrew());
        System.out.println(hd.formatHebrewDate_Hebrew());

        hd.setHebrewDate(9,30,5767);
        assertEquals("ל׳ בכסלו תשס״ז", hd.formatHebrewDate_Hebrew());
        System.out.println(hd.formatHebrewDate_Hebrew());

        hd = new HebrewDate(2,23,1976, HebrewDate.HEBREW_LOCALE);
        assertEquals("כ״ב באדר א׳ תשל״ו", hd.formatHebrewDate_Hebrew());
        System.out.println(hd.formatHebrewDate_Hebrew());

    }

    @Test
    public void testOmerAndYomTov_Pesach7() throws HebrewDateException {
        JewishHolidaysCalendar hDate = new JewishHolidaysCalendar(4,29,2024, HebrewDate.HEBREW_LOCALE);
        String value = hDate.formatHebrewDate_Hebrew();
        System.out.println(value);
        assertEquals("כ״א בניסן תשפ״ד", value);
        assertTrue(hDate.isYomTov());
    }
}
