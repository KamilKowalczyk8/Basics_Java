package string_class;

public class indexOf {
    public static void main(String[] args) {
        String str = "Ola ma kota.Kasia nie ma psa";

        int index = str.indexOf("Kasia");

        System.out.println("od którego indexu "+index);

        index = str.indexOf("Adam");
        System.out.println(index);

        index = str.indexOf("Ola",10);
        System.out.println(index);
    }
}
