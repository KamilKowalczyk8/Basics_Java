package string_class;

public class StringBuilder {
    public static void main(String[] args) {
        java.lang.StringBuilder builder = new java.lang.StringBuilder();




        builder.append("Ola ma kota");
        builder.append("Kolejny tekst");
        builder.insert(0,"Kasia ma psa");
        System.out.println(builder.toString());
        builder.replace(0,5,"Julia");
        builder.insert(12,"oraz kota");
        System.out.println(builder.toString());
         
    }


}
