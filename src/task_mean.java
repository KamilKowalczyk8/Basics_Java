public class task_mean {
    public static void main(String[] args) {
        double tab[] ={1,2,3,4};
        double result = (tab[0]+tab[1]+tab[2]+tab[3])/tab.length;
        System.out.println("Średnia: "+result);
        result++;
        System.out.println("inkrementacja wynik: "+result);
        result--;
        System.out.println("dekrementacja wynik: "+result);
    }
}
