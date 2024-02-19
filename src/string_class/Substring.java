package string_class;

public class Substring {
    public static void main(String[] args) {
        String str = "Ola ma kota";

        String strFragment = str.substring(3);

        System.out.println(strFragment);

        String strFragment1 = str.substring(4,8);

        System.out.println(strFragment1);
    }
}
