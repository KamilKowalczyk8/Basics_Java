public class task_breakContinoue {
    public static void main(String[] args) {
        for(int i = 0; i<=50;i++){
            if(i==10)break;
            System.out.println(i);
        }
        for(int i = 0; i<=50;i++){
            if(i % 3 == 0)continue;
            System.out.println(i);
        }
    }
}
