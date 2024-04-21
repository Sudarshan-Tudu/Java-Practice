package org.example.api;
import java.util.*;
import java.time.*;


public class DateTime {
    public static void main(String[] args) {
        Date dt1 = new Date();
        System.out.println(dt1);

        //java.sql.Date dt2 = new java.sql.Date();

        LocalDateTime dateTime =LocalDateTime.now();
        System.out.println(dateTime);

        LocalDate.now();
        LocalTime.now();
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getNano());
    }
}
