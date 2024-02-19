public class task_forEachChallegne {
    public static void main(String[] args) {
        int number [] = {1,2,34,56,5};
        int sum=0;
        for (int num:number) {
            System.out.println(num);
            sum+=num;
        }
        System.out.println("Suma: "+sum);
    }
}
