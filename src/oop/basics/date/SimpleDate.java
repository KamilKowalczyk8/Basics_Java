package oop.basics.date;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class SimpleDate {
    public static void main(String[] args) {
       Date date = new Date();
        System.out.println(date);
        System.out.println(date.getTime());
        SimpleDateFormat dataformat = new SimpleDateFormat("HH:mm:ss dd.MM.YYYY");
        System.out.println(dataformat.format(date));
    }
}
