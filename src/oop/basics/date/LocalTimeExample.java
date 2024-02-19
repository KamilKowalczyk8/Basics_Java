package oop.basics.date;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime localtime = LocalTime.now();
        System.out.println("Goidzuna "+localtime.getHour());
        System.out.println("Minuty "+localtime.getMinute());
        System.out.println("Sekundy "+localtime.getSecond());
        localtime = localtime.plusHours(2);
        System.out.println("Goidzuna "+localtime.getHour());
    }
}
