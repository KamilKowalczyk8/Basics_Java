package string_class;

public class Replace {
    public static void main(String[] args) {
        String str = "Ola ma kota. Dodatkowo Ola ma psa";

        String changed = str.replaceAll("Ola","Kasia");
        System.out.println(changed);

        String changed1 = str.replaceFirst("Ola","Kasia");
        System.out.println(changed1);

    }
}
