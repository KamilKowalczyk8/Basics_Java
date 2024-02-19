package string_class;

public class Length_toLowerCase_toUpperCase_charAt {
    public static void main(String[] args) {
        String str = "Ola ma kota";
        System.out.println(str.length());

        char sign = str.charAt(0);
        System.out.println(sign);

        String strUp = str.toUpperCase();
        System.out.println(strUp);

        String strLow = str.toLowerCase();
        System.out.println(strLow);
    }
}
