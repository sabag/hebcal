package net.sf.hebcal;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import org.junit.Test;

public class JewishHolidaysCalendarTest {

    @Test
    public void test() throws HebrewDateException {
        HebrewDate date = new HebrewDate(HebrewDate.HEBREW_LOCALE);
        date.setHebrewDate(7, 10, 5660);

        for (int i=1900; i < 2000; i++) {
            if (date.getDayOfWeek() == 7) {
                System.out.println(date.formatHebrewDate_Hebrew());
            }
            date.setHebrewDate(1, HebrewDate.CURRENT_DATE, date.getHebrewYear() + 1);
        }
    }

    @Test
    public void testCreateHolidayPage() throws IOException {
        File tempFile = File.createTempFile("hebcal-", ".html", new File(System.getProperty("java.io.tmpdir")));
        System.out.println(tempFile.getAbsolutePath());
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(tempFile), StandardCharsets.UTF_8)));
        out.println("<html><head><META http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"></head><pre dir=\"rtl\">");
        out.println("\u05e0\u05d9\u05e1\u05df<br>");
        out.println("אבגדהוזחטי");
        out.println("אבגדהוזחטי");

        Date startDate;
        Calendar cal = new GregorianCalendar(2022, Calendar.JANUARY, 1);
        startDate  = cal.getTime();

        JewishHolidaysCalendar hd = new JewishHolidaysCalendar(startDate, HebrewDate.HEBREW_LOCALE);
        hd.setIsraeliCalendar(true);
        for(int startGYear = hd.getGregorianYear();
            hd.getGregorianYear() == startGYear;
            hd.forward()) {
            out.println();
            out.println(hd.formatGregorianDate_English());
            out.println(hd.formatHebrewDate_Hebrew());
            out.println(hd. formatHebrewDate_English());

            JewishCalendarEvent[] holidays = hd.getEvents();
            for (JewishCalendarEvent holiday : holidays) {
                out.println(holiday.toString());
                out.println(holiday.getLocalizedString());
            }
        }
        out.flush();
        out.close();
    }

}