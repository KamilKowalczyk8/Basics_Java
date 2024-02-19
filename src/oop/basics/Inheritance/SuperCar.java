package oop.basics.Inheritance;

public class SuperCar extends Car{
    SuperCar(){
        type = "Super car";
        topSpeed = 300.0f;
    }


    public void setSportMode(){
        System.out.println("Super mode activated");
    }
}
