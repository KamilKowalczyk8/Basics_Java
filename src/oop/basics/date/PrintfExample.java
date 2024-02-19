package oop.basics.date;

import java.util.Date;

public class PrintfExample {
    public static void main(String[] args) {

        System.out.printf("Hello %s %d %f - %b . %n / %tc , to była data","World",12, 5.6f, true, new Date());

        System.out.printf("%n %n Hello %s %2$tY","World",new Date());

    }
}
