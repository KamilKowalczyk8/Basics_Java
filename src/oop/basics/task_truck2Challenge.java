package oop.basics;
class Truck{
    String factory;
    String model;
    int numWheels;
    String color;
    final int TOP_SPEED = 100;
    final int ACCELERATION;

    Truck(){
        this.factory="Freightliner";
        this.model="9644";
        this.numWheels=6;
        this.ACCELERATION = 60;
    }
    Truck(String color){
        this();
        this.color = color;
    }
    public void printInfo(){
        System.out.println(this.factory+" "+this.model+" "+this.color);
    }
}
public class task_truck2Challenge {
    public static void main(String[] args) {
        Truck truck = new Truck("red");
        truck.printInfo();
    }
}
