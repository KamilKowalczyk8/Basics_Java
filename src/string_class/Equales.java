package string_class;

public class Equales {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "HELlo";

        if (s2.equals(s1)) System.out.println("równe");

        if (s3.equals(s1))  System.out.println("równe");

        if (s3.equalsIgnoreCase(s1)) System.out.println("równe s3=s1");
    }
}
