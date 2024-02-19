package string_class;

public class TrimStripLeadingStripTrailing {
    public static void main(String[] args) {
        String str = "   Hello World   ";

        String trim = str.trim();

        String lead = str.stripLeading();

        String trail = str.stripTrailing();

        System.out.println(trim);
        System.out.println(lead);
        System.out.println(trail);
    }
}
