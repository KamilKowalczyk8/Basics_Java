public class task_MethodsChallenge {
    public static void main(String[] args) {
        String first = "Ola ma kota.";
        String rep = first.repeat(3);

        String changed = rep.replaceAll("Ola","Kasia");
        System.out.println(changed);
        String str = changed.replaceFirst("Kasia","Monika");
        System.out.println(str);

        int index = str.indexOf("Kasia");
        System.out.println(index);
        int index1 = str.lastIndexOf("Kasia");
        System.out.println(index1);

        System.out.println(str.substring(index));
    }
}
