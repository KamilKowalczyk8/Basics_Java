package oop.basics.acces_modifire.public_example.Master;

public class Bike {
    public String brand;
    protected String name;
    private String type;
    Bike(){

    }
    Bike(String brand,String name){
        this.brand = brand;
        this.name = name;
        type = "bike";
    }

    public void setType(String type) {
        this.type = type;
    }
    public void printInfo(){
        System.out.println(brand+" : "+name+" : "+type);
    }
}
