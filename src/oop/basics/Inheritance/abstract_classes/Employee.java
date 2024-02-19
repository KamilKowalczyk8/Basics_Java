package oop.basics.Inheritance.abstract_classes;

public class Employee extends Person{
    public Employee(String name, String surname, int age) {
        super(name, surname, age);
    }

    @Override
    public void printInfo() {
        System.out.println("Emplyee "+ this.getName());
    }
}
