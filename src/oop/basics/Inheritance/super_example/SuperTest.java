package oop.basics.Inheritance.super_example;

public class SuperTest {
    public static void main(String[] args) {
        Student student = new Student("Ania","Kowalska",5);

        Teacher teacher = new Teacher("Adam","Dobrzynski","biology");
        System.out.println(teacher.getTeachingSubject());
        Directory directory = new Directory("Krzystof","Nowak",55);

    }
}
