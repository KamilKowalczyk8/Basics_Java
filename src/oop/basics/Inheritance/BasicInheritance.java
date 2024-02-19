package oop.basics.Inheritance;

public class BasicInheritance {
    public static void main(String[] args) {
        Vechicle vechcicle = new Vechicle();
        vechcicle.printInfo();
        Car car = new Car();
        car.printInfo();
        Car car1 = new Car("VW",160);
        car1.printInfo();
        Bicycle bicycle = new Bicycle();
        bicycle.printInfo();
        SuperCar supercar = new SuperCar();
        supercar.printInfo();
        supercar.setSportMode();
    }
}
