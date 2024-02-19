package types;

public class Number_Convertion {
    public static void main(String[] args) {
        //jawna
        int i = 5;
        double a = 20.0d / (double)i;
        System.out.println(a);
        // niejawna
        int g =4;
        double b = 10.0d * g;
        System.out.println(b);

        double d2= 5.5;
        int num = 10 * (int)d2;
        //przy rzutowanoi mamy utrate ułamku
        // przy float/double na całkowity czesc ułamkowa jest tracona
        System.out.println(num);

        byte small = (byte)200;
        //rzutowanie z short na byte co powoduje utrate informacji
        System.out.println(small);

    }
}
