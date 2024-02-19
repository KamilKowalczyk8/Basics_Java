package oop.basics;

class Tv{
    String manufacture;
    String model;
    int year;
    float WindowSize;
    int power;
    public void printBasicData(){
        System.out.println(
                manufacture+" "+model+" "+year
                +" "+WindowSize+" "+power+" W"
        );
    }

}


public class task_tvChallenge {
    public static void main(String[] args) {

        Tv lg = new Tv();

        lg.manufacture = "LG";
        lg.model= "Y600";
        lg.year = 2021;
        lg.WindowSize = 70.5f;
        lg.power = 500;

        lg.printBasicData();


    }
}
