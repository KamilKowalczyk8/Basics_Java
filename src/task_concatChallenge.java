public class task_concatChallenge {
    public static void main(String[] args) {
        String name [] = {"Kasia","Asia","Basia","Ela"};
        String sum = name[0]+" " + name[1]+" " + name[2]+" " + name[3];
        System.out.println(sum);

        //pętla foreach
        String str = " ";
        for (String names : name) {
            str = str.concat(names);
            str +=" ";
        }
        System.out.println(str);

        String txt = "Hello World";
        txt = txt.replaceAll("Hello","user");
        System.out.println(txt);
    }
}
