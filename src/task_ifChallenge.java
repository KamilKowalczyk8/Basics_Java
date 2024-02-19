import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Boolean.parseBoolean;

public class task_ifChallenge {
    public static void main(String[] args) throws IOException {

        System.out.println("Podaj liczbe: ");
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String index = scan.readLine();
        int result = Integer.parseInt(index);

        if(result>=1){
            System.out.println("Liczba podana jest dodatnia: "+result);
        }else if (result<=-1){
            System.out.println("Liczba podana jest ujemna: "+result);
        }else{
            System.out.println("Liczba podana jest równa zero: "+result);
        }

        //oddanie krwi

        System.out.println("Podaj swój wiek: ");
        BufferedReader read1 = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Podaj swoją wage: ");
        BufferedReader read2 = new BufferedReader(new InputStreamReader(System.in));

        String index1 = read1.readLine();
        String index2 = read2.readLine();
        int result1 = Integer.parseInt(index1);
        int result2 = Integer.parseInt(index2);

        if(result1<18 && result2<50){
            System.out.println("Twoja waga oraz wiek są za małe");
        }else if(result1<18){
            System.out.println("Twój wiek jest za mały");
        }else if(result2<50){
            System.out.println("Jesteś zbyt lekki");
        }else{
            System.out.println("Mozesz zostac dawcą krwi");
        }

        //pogoda
        System.out.println("Podaj czy pada descz");
        BufferedReader read4 = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Podaj temperature ");
        BufferedReader read3 = new BufferedReader(new InputStreamReader(System.in));

        String index4 = read4.readLine();
        boolean rain = Boolean.parseBoolean((index4));

        System.out.println(rain);

        String index3 = read3.readLine();
        int result3 = Integer.parseInt((index3));

        if(result3>40 || result3<-20){
            System.out.println("Zostan w domu");
        }else if(result3<10 && result3>-10 && rain==true){
            System.out.println("Wez parasolke");
        }else if (result3>12){
            System.out.println("Mozesz wyjsc");
        }



        //test na kierowce autobusu

        System.out.println("Czy kierowca ma prawko");
        BufferedReader read5 = new BufferedReader(new InputStreamReader(System.in));
        String index5 = read5.readLine();
        boolean license = Boolean.parseBoolean(index5);

        System.out.println("jezdził po wpływem alkoholu");
        BufferedReader read6 = new BufferedReader(new InputStreamReader(System.in));
        String index6 = read6.readLine();
        boolean alcohol = Boolean.parseBoolean(index6);

        System.out.println("jezdził za szybko");
        BufferedReader read7 = new BufferedReader(new InputStreamReader(System.in));
        String index7 = read7.readLine();
        boolean toFast = Boolean.parseBoolean(index7);

        System.out.println("doswiadeczenie zawodowe");
        BufferedReader read8 = new BufferedReader(new InputStreamReader(System.in));

        String index8 = read8.readLine();
        int experiance = Integer.parseInt(index8);
        {
            int points = 0;
            if (license == true) {
                points+= 20;
            }else if (alcohol==true){
                points-=100;
            }else if(toFast==true){
                points-=10;
            }else if(experiance>60){
                points-=20;
            }else if(experiance>10 && experiance<60){
                points+=20;
            }

            System.out.println("Liczba punktów "+points);
            if(points>=20){
                System.out.println("dostałes prace");
            }else{
                System.out.println("nie dostałes");
            }

        }

    }
}
