public class task_BmiChallenge {
    public static void main(String[] args) {
        double weight = 70;
        float height = 1.85f;
        double heightConversion = (double)height;
        heightConversion = Math.pow(heightConversion,2);
        double bmi = weight / heightConversion;
        System.out.println(bmi);
        int result = (int)bmi;
        System.out.println(result);


    }
}
