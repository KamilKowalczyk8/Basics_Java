package types;
import java.math.*;

public class Big_Intiger {
    public static void main(String[] args) {
        BigInteger bigInt = new BigInteger("12333333334214214214214214");
        bigInt = bigInt.add(new BigInteger("4123412421421"));
        System.out.println("Wynik :"+bigInt);

        BigDecimal decimal = new BigDecimal("213214213543.64537654624363");
        decimal = decimal.pow(3);
        decimal = decimal.subtract(new BigDecimal("54365437646"));
        System.out.println("Wynik :"+decimal);
        int i =3;
        double b = i;
        double a = 10.0;
        int c = (int)a;
        System.out.println(b);
        System.out.println(c);

    }
}
