package oop.basics.Inheritance.task;

public class Shop {
    public static void main(String[] args) {
        Computer computer = new Computer();
        System.out.println("Resolution: "+computer.monitor.resolution);
        System.out.println("Price: "+computer.price);
        Keyboard keyboard = new Keyboard();
        System.out.println("numKeys: "+keyboard.numKeys);
        Monitor monitor = new Monitor();
        System.out.println(monitor.resolution);
        Mouse mouse = new Mouse();
        System.out.println("numButtons: "+mouse.numButtons);

        VerticalMouse verticalMouse = new VerticalMouse();
      //  System.out.println(verticalMouse.resolution);


    }
}
