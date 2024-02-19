import org.w3c.dom.ls.LSOutput;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import static java.lang.Integer.*;

public class task_ternaryChallenge {
    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String index = read.readLine();
        int result = parseInt(index);
        System.out.println(result);
        String result1 = (result% 2 == 0) ? "parzysta" : "nieparzysta";
        System.out.println(result1);

    }
}
