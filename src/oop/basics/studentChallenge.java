package oop.basics;

class Person{
    String name;
    String surname;
    String city;
    int year;

    public Person(String name,String surname,String city,int year){
        this.name = name;
        this.surname = surname;
        this.city = city;
        this.year = year;
    }

    public Person(){
        this.name = "Jan";
        this.surname = "Kowalski";
    }

    public void printBasicData(){
        System.out.println(
                name+" "+surname+" "+city+" "+year
        );
    }
}

public class studentChallenge {
    public static void main(String[] args) {
        Person Jan = new Person();
        Jan.printBasicData();

        Person Adam = new Person("Adam","Nowak","Opole",2000);
        Adam.printBasicData();
    }
}
