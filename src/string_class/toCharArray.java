package string_class;

public class toCharArray {
    public static void main(String[] args) {
        String str = "Ola ma kota";
        char arr[] = str.toCharArray();
        System.out.println(arr.length);

        String strArr[] = str.split(" ");

        System.out.println(strArr[0]);
        System.out.println(strArr[1]);
        System.out.println(strArr[2]);

        String s = str.toString();
        System.out.println(s);

        System.out.println(strArr.toString());

    }
}
