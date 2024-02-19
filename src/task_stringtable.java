public class task_stringtable {
    public static void main(String[] args) {
        String names []= {"Kasia","asia","basia"};

        StringBuilder str = new StringBuilder();

        for (String s:names) {
            str.append(s);
            str.append(" ");
       }
        System.out.println(str);
    }
}
