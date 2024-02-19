public class J09_String {
    public static void main(String[] args) {
        String s1 = "Ala ma 1#";
        String s2 = new String("str #2");
        String s3 = s1+s2;
        System.out.println(s3.length());
        String s4 = "wiersz 1 \n dsada \t fsaf\n dsad\\dsa\u263A";
        System.out.println(s4);
    }
}
