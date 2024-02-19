package oop.basics;
class Wallet{
    float money;
    Wallet(){
        this.money = 2000;
    }
    Wallet(float amount){
        this.money = amount;
    }
    public void addMoney(float amount){
        this.money += amount;
    }
    public void removeMoney(float amount){
        this.money -= amount;
    }
    public void money(){
        System.out.println("stan portfela "+this.money);
    }
}
public class task_walletChallenge {
    public static void main(String[] args) {
        Wallet wallet = new Wallet(3000);
        for(int i = 1;i <= 6;i++){
            System.out.println("miesiąc"+i);
            wallet.addMoney(5000);
            wallet.removeMoney(2000);
            wallet.removeMoney(1000);
        }
        wallet.money();
    }
}
