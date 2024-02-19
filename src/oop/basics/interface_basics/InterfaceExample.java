package oop.basics.interface_basics;

public class InterfaceExample {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        car.getTopSpeed();
        Vechicle vechicle = car;

        System.out.println(vechicle.getTopSpeed());
        vechicle.move();
        Vechicle car2 = new Car();
        car2.turn();
        Car someCar = (Car)car2;
        System.out.println(someCar.getTopSpeed());

        Plane plane = new Plane();
        Vechicle planevechicle = plane;
        System.out.println(planevechicle.getTopSpeed());

        Vechicle vechicles[] = new Vechicle[3];
        vechicles[0] = car;
        vechicles[1] = car2;
        vechicles[2] = plane;

        vechicles[2].move();

        if(vechicles[2] instanceof Plane){
            Plane somePlane = (Plane)vechicles[2];
            somePlane.turn();

            Flying flyingVechicle = somePlane;
            flyingVechicle.increaseHeight();
        }
    }
}
