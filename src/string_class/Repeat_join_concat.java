package string_class;

public class Repeat_join_concat {
    public static void main(String[] args) {
        String str = "info";
        str = str.repeat(3);
        System.out.println(str);

        String join = String.join("-","Raz","Dwa","Trzy");

        System.out.println(join);

        String con = "Ola".concat("ma")+"kota".concat(".");
        System.out.println(con);
    }
}
