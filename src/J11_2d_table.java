public class J11_2d_table {
    public static void main(String[] args) {
        String strtab [][]={ //[2][3]
                {"one","two","three"},
                {"1","2","3"}
        };
        System.out.println(strtab[0][1]); // two
        int numtab[][]={
                {1,2,3},
                {4,5,6}
        };
        int piec = numtab[1][1];
        System.out.println(piec);
        piec = 100;
        System.out.println(piec);
    }
}
