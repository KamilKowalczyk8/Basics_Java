package oop.basics.Inheritance;

public class Vechicle {
    public String type;
    public String manufacturer;
    public float topSpeed;

    Vechicle(){
        type = "unknown";
        manufacturer = "unknown";
        topSpeed = 0;
    }
    public void printInfo(){
        System.out.println("type: "+type+
        " manufacturer: "+manufacturer+
                " topSpeed: "+topSpeed);
    }
}
