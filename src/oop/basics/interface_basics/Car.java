package oop.basics.interface_basics;

public class Car implements Vechicle{
    @Override
    public void move() {
        System.out.println("Car is moving");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }

    @Override
    public void turn() {
        System.out.println("Car is turning");
    }

    @Override
    public float getTopSpeed() {
        return 200;
    }
}
