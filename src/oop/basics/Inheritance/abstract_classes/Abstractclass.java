package oop.basics.Inheritance.abstract_classes;

public class Abstractclass {
    public static void main(String[] args) {
        Employee worker1 = new Employee("Adam","Kowalski",32);
        worker1.printInfo();

        Manager manager = new Manager("Olek","nowak",22,"RD");
   manager.printInfo();
    }


}
