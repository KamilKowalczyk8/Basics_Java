package oop.basics.acces_modifire.public_example.private_example;
public class Private_Example {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println( car.getName() );
        car.setName("jebac disa");
        System.out.println(car.getName());
    }
}
