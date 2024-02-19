package oop.basics.Inheritance;

public class Bicycle extends Vechicle{
    Bicycle(){
        //super(); dodane automatycznie gdy nie ma
        type = "Bicycle";
        manufacturer = "Romet";
        topSpeed = 15.0f;
    }
}
