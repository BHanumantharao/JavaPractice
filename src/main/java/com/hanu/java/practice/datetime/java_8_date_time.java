package com.hanu.java.practice.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

/**
 * @author Hanumantharao Bitragunta
 */
public class java_8_date_time {

    /*
     *   java -7
     *   1. If i want to create object, the same class(Date) in two packages
     *   2. complex date formatting
     *   3. All Date classes are not threadsafe (not-Synchronised)
     *   4.
     *
     *
     *   java 8
     *   1. immutable (Synchronised), handing us immutable datetime objects
     *   2. allow us to have more fine-grained control over our date and time representation
     *   3.
     *
     *   @ java.util.Date: LocalDate
     *   >  a date API that represents a date without time;
     *
     *   @ java.util.Date: LocalTime
     *   > a time representation without a date;
     *
     *   @ java.util.Date: LocalDateTime
     *   > which is a combination of the previous two.
     *
     *
     *
     *
     * */


    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        localDate = LocalDate.of(1989, Month.MAY, 04);
        System.out.print(localDate);

        /* ########   LOCALDATE ###########*/
        LocalDate date = LocalDate.of(2018, 2, 13);
        System.out.print("\n local date: "+date);
        // Uses DateTimeformatter.ISO_LOCAL_DATE for which the format is: yyyy-MM-dd
        LocalDate parsedate = LocalDate.parse("2018-02-13");
        System.out.print("\n parse local date: "+parsedate);

        /* ########   LOCALTIME ###########*/
        LocalTime time = LocalTime.of(6, 30);
        System.out.print("\n local time: "+time);
        // Uses DateTimeFormatter.ISO_LOCAL_TIME for which the format is: HH:mm[:ss[.SSSSSSSSS]]
        // this means that both seconds and nanoseconds may optionally be present.
        LocalTime parsetime = LocalTime.parse("06:30");
        System.out.print("\n local parse time: "+parsetime);


        /* ########   LOCALDATETIME ###########*/
        LocalDateTime dateTime = LocalDateTime.of(2018, 2, 13, 6, 30);
        System.out.print("\n local date time: "+dateTime);
        // Uses DateTimeFormatter.ISO_LOCAL_DATE_TIME for which the format is the
        // combination of the ISO date and time format, joined by 'T': yyyy-MM-dd'T'HH:mm[:ss[.SSSSSSSSS]]
        LocalDateTime parsedateTime = LocalDateTime.parse("2018-02-13T06:30");
        System.out.print("\n local parse date time: "+parsedateTime);

    }
}
