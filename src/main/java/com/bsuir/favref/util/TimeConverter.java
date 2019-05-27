package com.bsuir.favref.util;

/**
 * @author a.shakarov
 * @version 1.0
 */
public class TimeConverter {

    public static final long MILLS_IN_SECOND = 1000L;
    public static final long SECONDS_IN_MINUTE = 60L;
    public static final long MINUTES_IN_HOUR = 60L;

    public static long HoursToMills(long hours) {
        return hours
                *MINUTES_IN_HOUR
                *SECONDS_IN_MINUTE
                *MILLS_IN_SECOND;
    }

}
