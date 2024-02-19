public class J15_whileLoop {
    public static void main(String[] args) {
        int i=5;
        while (i>0){
            System.out.println(i);
            i--;
        }
        int number = 0;
        do{
            System.out.println(number*2);
            number++;
        }while(number<10);

        int numbers [] = {1,2,3,4,5,6};
        int c = 0;
        while(c<numbers.length){
            System.out.println(numbers[c]*2);
            c++;
        }

        int person [] = {1,2,3,45,6,7};
        int b = 0;
        do{
            if(b % 2 == 0) {
                System.out.println(person[b]);
                b++;
            }
        }while(b<=20);

    }
}
