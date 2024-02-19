package oop.basics;
class Carr{
    String model;
    String brand;
    String color1;
    Carr(String model,String brand,String color1){
        this.brand = brand;
        this.color1 = color1;
        this.model = model;
    }
    public String getColor(){
        return this.color1;
    }
    public void printInfo(){
        System.out.println(this.brand+this.model+this.color1);
    }
}
class CarFactory{
    public Carr buildCar(){
        String colors [] = {"black","white","red"};
        int randomIndex = (int)Math.floor(Math.random() * colors.length);
        String randColor = colors[randomIndex];
        return new Carr("Mustang","Ford",randColor);
    }
}
public class task_CarFactoryChallenge {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Carr car1 = carFactory.buildCar();
        car1.printInfo();
        System.out.println(car1.getColor());

        Carr car2 = carFactory.buildCar();
        car2.printInfo();
        System.out.println(car2.getColor());
    }
}
