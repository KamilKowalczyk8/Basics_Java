package oop.basics;

class Car{
    String manufacturerer;
    String name;
    int year;
    String color;
    float topSpeed;

    public Car(){
        this.manufacturerer = "unknown";
    }
    public Car(String manufacturerer,String name,String color,int year,float topSpeed){
        this.manufacturerer = manufacturerer;
        this.color = color;
        this.name = name;
        this.year = year;
        this.topSpeed = topSpeed;

    }

    public void printInfo(){
        System.out.println(
                this.manufacturerer + " " +
                        this.name + " " +
                        this.year + " "
        );
    }
}

public class CarExample {
    public static void main(String[] args) {
        Car ford = new Car();
        ford.manufacturerer = "ford";
        ford.name="mustang";
        ford.color = " blue";
        ford.year = 1967;
        ford.topSpeed = 200.0f;
        ford.printInfo();

        Car chevrolet = new Car();
        chevrolet.manufacturerer = "chevrolet";
        chevrolet.name = "camaro";
        chevrolet.color = "red";
        chevrolet.year = 2020;
        chevrolet.topSpeed = 300.0f;
        chevrolet.printInfo();

        Car dodge = new Car("Dodgle","viper","red",2002,270.0f);
        dodge.printInfo();

    }
}
