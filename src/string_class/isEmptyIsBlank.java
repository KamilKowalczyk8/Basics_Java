package string_class;

public class isEmptyIsBlank {
    public static void main(String[] args) {
        String emptyStr = "";
        String blankStr = "  \n ";

        if (emptyStr.isEmpty()) {
            System.out.println("jest empty");
        }
        if(blankStr.isBlank()){
            System.out.println("jest blank");
        }
    }
}
