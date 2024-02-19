import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task_SwitchChallenge {
    public static void main(String[] args) throws IOException {
        System.out.println("Podaj miesiąc liczbą :");
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String index = read.readLine();
        int season = Integer.parseInt(index);

        switch (season){
            case 3:
            case 4:
            case 5:
                System.out.println("wiosna");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("lato");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("jesien");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("zima");
                break;

            default:
                System.out.println("default zły format danych");
        }
    }
}
