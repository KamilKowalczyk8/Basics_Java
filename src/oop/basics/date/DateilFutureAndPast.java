package oop.basics.date;

import java.util.Calendar;
import java.util.Date;

public class DateilFutureAndPast {
    public static void main(String[] args) {
        Date dateNow = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateNow);
        System.out.println(dateNow);

        calendar.add(Calendar.MONTH, 2);
        calendar.add(Calendar.YEAR, 22);
        calendar.add(Calendar.DAY_OF_MONTH,2);
        calendar.add(Calendar.HOUR,1);
        calendar.add(Calendar.MINUTE,10);
        calendar.add(Calendar.SECOND,30);
        Date dateinFuture = calendar.getTime();
        System.out.println(dateinFuture);
    }
}
