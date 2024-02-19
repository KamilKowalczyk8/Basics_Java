public class J17_infiniteLoop {
    public static void main(String[] args) {
        while (true){
            int random = (int)Math.round(10*Math.random());
            System.out.println(random);
            if(random==10)break;
        }
        System.out.println("------------------------");
        for( ; ; ){
            int random = (int)Math.round(10*Math.random());
            System.out.println(random);
            if(random == 3)break;
        }
    }
}
