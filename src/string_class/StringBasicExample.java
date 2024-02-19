package string_class;

public class StringBasicExample {
    public static void main(String[] args) {

        String s1 = "Hello World!";
        String s2 = new String("Hello World");

        String s3 = "test ".repeat(3);
        System.out.println(s3);

        String s4 = String.join(".","Kasia","2","3");
        System.out.println(s4);

        char arr[] = {'O','L','A'};
        String s5 = new String(arr);
        System.out.println(s5);
    }
}
