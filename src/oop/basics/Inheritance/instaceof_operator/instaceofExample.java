package oop.basics.Inheritance.instaceof_operator;

class Animal{
    protected String name;
    protected float weight;
    protected  int numLegs;

}

class Dog extends Animal{
    protected void bark(){
        System.out.println("Dog bark");
    }
}

class Bird extends Animal{
    protected void fly(){
        System.out.println("flying bird");
    }
}


public class instaceofExample {
    public static void main(String[] args) {
        Dog dog = new Dog();
        boolean result = dog instanceof Animal;
        System.out.println(result);
        Animal animal = new Animal();
        System.out.println(animal instanceof Dog);

        Bird bird = new Bird();
        System.out.println(bird instanceof Animal);
    }
}
