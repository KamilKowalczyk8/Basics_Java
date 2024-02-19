public class J18_forEach {
    public static void main(String[] args) {
        String numbers[] = {"ANIA","Kasia","Basia","Ela"};
                for(String num:numbers){
                    if (num.equalsIgnoreCase("Ania"))continue;
                    System.out.println(num);
                }
    }
}
