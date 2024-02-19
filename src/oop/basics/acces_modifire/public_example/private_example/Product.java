package oop.basics.acces_modifire.public_example.private_example;

public class Product {
    private String name;

    public Product(){
        this.name = "unkown";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product(String name){
        this.name = name;
    }
}
