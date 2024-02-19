package oop.basics.acces_modifire.public_example.Master;

public class Motorbike extends Bike{
    Motorbike(String brand,String name){
        this.brand = brand;
        this.name = name;
        setType("Motorbike");
    }

    @Override
    public void printInfo() {
        System.out.println("Motorbike");
        super.printInfo();
    }
}
