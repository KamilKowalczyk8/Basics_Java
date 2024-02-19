public class MathRoundCeilFloor {
    public static void main(String[] args) {
        //zaokrągleinie do najblizszej liczby całkowitej
        double a = 5.51;
        System.out.println(Math.round(a));
        System.out.println(Math.round(5.49));

        //utrata ułamka
        System.out.println((int)5.45d);

        //Math.ceil;
        System.out.println(Math.ceil(5.45));

        //Math.floor
        System.out.println(Math.floor(5.67));
    }
}
