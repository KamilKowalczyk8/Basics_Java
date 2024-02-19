package string_class;

public class startsWithEndsWith {
    public static void main(String[] args) {
        String str = "Hello World";

        if(str.startsWith("Hello")){
            System.out.println("true");
        }
        if (str.startsWith("World")){
            System.out.println("true1");
        }
        if (str.endsWith("World")){
            System.out.println("true2");
        }
    }

}
