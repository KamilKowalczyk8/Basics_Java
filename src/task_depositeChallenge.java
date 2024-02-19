public class task_depositeChallenge {
    public static void main(String[] args) {
        float deposite = 1000.00f;
        float numDays = 180;
        float interestRate = 0.06f;
        final float daysInYear = 365;
        float tax = 0.19f;
        //wzór na obliczenie
        double interest = deposite * numDays * interestRate / daysInYear;
        double meta = interest * tax;
        double profit = interest - meta;
        System.out.println("zysk :"+profit);
    }
}
