package oop.basics.acces_modifire.public_example.protected_example;

import oop.basics.acces_modifire.public_example.protected_example.package1.Laptop;
import oop.basics.acces_modifire.public_example.protected_example.package2.Computer;

public class ProtecetedExample {
    public static void main(String[] args) {
        Computer computer = new Computer();
        // bład brak dostepu z innego pakietu computer.name = "sdf";
        computer.setName("Dell");
        System.out.println(computer.getName());
        Laptop laptop = new Laptop();
        System.out.println(laptop.getName());
    }
}
