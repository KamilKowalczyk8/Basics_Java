package oop.basics.interface_basics;

public class Plane implements Vechicle, Flying{

    @Override
    public void move() {
        System.out.println("Plane is moving");
    }

    @Override
    public void stop() {
        System.out.println("Plane stopped");
    }

    @Override
    public void turn() {
        System.out.println("Plane turning");
    }

    @Override
    public float getTopSpeed() {
        return 400;
    }

    @Override
    public void increaseHeight() {
        System.out.println("Plane is increase");
    }

    @Override
    public void decreaseHeight() {
        System.out.println("Plane is decrasing");
    }
}
