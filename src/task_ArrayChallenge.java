import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_ArrayChallenge {
    public static void main(String[] args) throws IOException {
        String names[] = {"ala","ela","ola","basia","karol"};
        System.out.println("długość tablicy:"+(names.length-1));
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String index = reader.readLine();
        int result = Integer.parseInt(index);
        System.out.println("wybrany index: "+names[result]+" dla indeksu "+index);
    }
}
