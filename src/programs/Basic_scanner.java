package programs;

import java.util.*;

public class Basic_scanner {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Podaj swoje imie: ");
        String name = in.nextLine();

        System.out.println("Twoje imie to: "+name);
    }

}