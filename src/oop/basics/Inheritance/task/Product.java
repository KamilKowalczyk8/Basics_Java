package oop.basics.Inheritance.task;

public class Product {
    public float price;
    public String name;
    public String manufacturer;
    public int productionYear;
    Product(){
        price = 0;
        name = "unknown";
        manufacturer = "unknown";
        productionYear = 0;
    }
    public void printInfo(){
        System.out.println("Price: "+price+
                "Name: "+name+
                "manufacturer"+manufacturer+
                "Year"+productionYear
        );
    }
}
