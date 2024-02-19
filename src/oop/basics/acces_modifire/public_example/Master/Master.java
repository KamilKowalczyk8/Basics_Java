package oop.basics.acces_modifire.public_example.Master;

public class Master {
    public static void main(String[] args) {
        Bike bike = new Bike("Mustang","Romet");
        bike.printInfo();
        Motorbike motorbike = new Motorbike("VW","Polo");
        motorbike.printInfo();
    }
}
