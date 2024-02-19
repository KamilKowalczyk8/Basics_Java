package oop.basics.Inheritance;
class Employee{
    String name;
    String surname;
    String jobTitle;
    float salary;
}
class Manager extends Employee{
    String responsiblity;
}
class Director extends Manager{
    String department;
}
class President extends Director{
}
final class CEO extends President{
    String companyname;
}
/*
nie mozna rozrzeszuyc klasy final
class Something extends CEO{

}*/
public class finalExample {
    public static void main(String[] args) {

    }
}
