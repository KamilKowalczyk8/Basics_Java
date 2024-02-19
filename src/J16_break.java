public class J16_break {
    public static void main(String[] args) {
        for(int i = 0;i<20;i++){
            System.out.println(i);
            if(i==3)break;
        }
        System.out.println("-------------------------------");

        for(int a = 0;a<10;a++){
            if(a==2 || a==5 || a==9) continue;
            System.out.println(a);
        }
    }
}
