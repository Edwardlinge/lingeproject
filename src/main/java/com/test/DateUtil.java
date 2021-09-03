package com.test;



import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    public static Date getToday() {
        Calendar cal = Calendar.getInstance();
        clearHourTime(cal);
        return cal.getTime();
    }

    public static Date getTomorrow() {
        Calendar cal = Calendar.getInstance();
        cal.setTime(getToday());
        cal.add(Calendar.DATE, 1);
        return cal.getTime();
    }

    public static Date getLastOneDay(int last) {
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, last);
        clearHourTime(cal);
        return cal.getTime();
    }

    public static Date getMonday() {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        clearHourTime(cal);
        return cal.getTime();
    }

    private static void clearHourTime(Calendar cal) {
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
    }

    public static String getPrintDateTime() {
        SimpleDateFormat sdf = new SimpleDateFormat(SYConstants.DATE_FORMAT_TIME);
        return sdf.format(new Date());
    }

    public static String defaultFormat(Date dateTime) {
        SimpleDateFormat sdf = new SimpleDateFormat(SYConstants.DATE_FORMAT_TIME);
        return sdf.format(dateTime);
    }

    public static Date getFutureDateBefore(int oneDay) {
        Calendar c = Calendar.getInstance();
        c.add(Calendar.DATE, oneDay - 1);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

    public static Date getEndDate(Date datetime) {
        Calendar c = Calendar.getInstance();
        c.setTime(datetime);
        c.set(Calendar.HOUR_OF_DAY, 23);
        c.set(Calendar.MINUTE, 59);
        c.set(Calendar.SECOND, 59);
        c.set(Calendar.MILLISECOND, 0);
        return c.getTime();
    }

}
