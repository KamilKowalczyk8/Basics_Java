package programs;

import java.util.Scanner;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double startCapital = 0;
        double yearlyInterest = 0;
        int numYears = 0;

        double finalCapital;

        System.out.println("Wpisz kapitał początkowy: ");
        startCapital = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz roczne oprocentowanie 5=5%: ");
        yearlyInterest = Double.valueOf(in.nextLine()).doubleValue();

        System.out.println("Wpisz ilosc lat osczędzania");
        numYears = in.nextInt();
        //numYears = Integer.valueOf(in.nextLine()).intValue();

        finalCapital = startCapital * Math.pow(1 + (yearlyInterest / 100.0d),numYears);
        System.out.println("Efekt osczędzania z procentem składanym :"+ Math.round(finalCapital));




    }
}
