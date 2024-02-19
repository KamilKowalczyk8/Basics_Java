package operators;

public class Op2_incrementation {
    public static void main(String[] args) {
        int a = 10;
        a++;
        System.out.println(a);

        int b = 5;
        int c = 10 + b++;
        System.out.println(c);
        System.out.println(b);

        int g = 5;
        int z = 10 + ++g;
        System.out.println(z);
        System.out.println(g);

        int result = g+g;
        System.out.println(result);

    }
}
