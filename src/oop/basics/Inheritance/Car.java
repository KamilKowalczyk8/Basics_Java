package oop.basics.Inheritance;

public class Car extends Vechicle{
    Car(){

        this.type = "Car";
        this.manufacturer = "Ford";
        this.topSpeed = 200;
    }
    Car(String manufacturer,float topSpeed){
        this();
        this.manufacturer = manufacturer;
        this.topSpeed = topSpeed;
    }
}
