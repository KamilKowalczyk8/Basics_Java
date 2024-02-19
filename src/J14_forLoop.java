public class J14_forLoop {
    public static void main(String[] args) {
        int j = 0;
        int arr[] = {6,5,2,7,8,89,23,414,1245,2};
        for (int i = 0;i<arr.length;i++){
            int value = arr[i];
            j++;
            System.out.println(j+"#: "+value);
        }
        String names[]={"Asia","Kasia","ania","Kamil"};
        for (int i = names.length-1; i >= 0; i--) {
            String name = names[i];
            System.out.println(name);
        }
    }
}
