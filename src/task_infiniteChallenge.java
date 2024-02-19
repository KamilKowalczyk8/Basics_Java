import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_infiniteChallenge {
    public static void main(String[] args) throws IOException {
        String str = "quit";
        System.out.println(str.equalsIgnoreCase("Quidst"));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = 0;
        for ( ; ; ){
            System.out.println("Wpisz liczbe lub quit jesli chcesz zakonczyc program");
            String data= reader.readLine();
            if(data.equalsIgnoreCase("Quit"))break;
            int num = Integer.parseInt(data);
            number += num;
            System.out.println("Wartość number: "+number);
        }
    }
}
