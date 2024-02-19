import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_stringChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in)
        );

        System.out.println("Podaj swoje imie: ");
        String name = reader.readLine();
        System.out.println("twoje imie to:"+name);
        System.out.println("Podaj swoje miejsce zamieszkania: ");
        String place = reader.readLine();
        System.out.println(" place: "+place);
        String result = place + name;
        System.out.println(result.length());
    }
}
