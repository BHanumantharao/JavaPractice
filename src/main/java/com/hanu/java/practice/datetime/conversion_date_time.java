package com.hanu.java.practice.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * @author Hanumantharao Bitragunta
 */
public class conversion_date_time {

    public static void main(String[] args) {

        // LocalDate with LocalTime to LocalDateTime
        LocalDateTime ldt = LocalDate.parse("2019-03-03").atTime(LocalTime.parse("11:46"));
        System.out.print("converted date time value: "+ldt);

        // LocalTime to LocalDateTime
        LocalDateTime ldt1 = LocalTime.parse("11:50").atDate(LocalDate.parse("2019-03-03"));
        System.out.print("\n converted date time value: "+ldt1);

        // LocalDateTime to LocalDate, LocalTime
        LocalDate lDate = LocalDateTime.parse("2019-03-03T11:46").toLocalDate();
        System.out.print("\n LocalDate value from LocalDateTime: "+lDate);

        LocalTime lTime = LocalDateTime.parse("2019-03-03T11:50").toLocalTime();
        System.out.print("\n LocalTime value from LocalDateTime: "+lTime);


        /*  #############  'plus'  ||  'minus' ###############  */
        lDate = lDate.plusDays(5);
        System.out.print("\n LocalDate value plus 5 days: "+lDate+ "\t month: "+lDate.getMonth());

        lDate = lDate.plus(3, ChronoUnit.MONTHS);
        System.out.print("\n LocalDate value plus 3 months: "+lDate+" \t month:"+lDate.getMonth());

        // minus minutes from LocalTime
        System.out.print("\n Deduction time in localtime: before - "+lTime.getHour()+" after: "+lTime.minusMinutes(53));
        System.out.print("\n Deduction time in localtime: before - "+
                lTime.getHour()+" after: "+lTime.minus(500, ChronoUnit.MILLIS));

        /* https://dzone.com/articles/java-8-date-and-time */


    }
}
