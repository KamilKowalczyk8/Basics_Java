package operators;

public class Op3_logicalOperator {
    public static void main(String[] args) {
        System.out.println(5<10 && 20==20);
        System.out.println(5<10 && 20==19);

        System.out.println(5<10 || 20==20);
        System.out.println(5<10 || 20==19);
        System.out.println(15<10 || 20==19);
    }
}
