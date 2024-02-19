package oop.basics;

class Triangle{
    float a;
    float h;
    float surfaceArea;
    Triangle(float base,float height){
        a = base;
        h = height;
    }
}
class Mymath{

    public void add(int a,int b){
        a = 20;
        int result = a+b;
        System.out.println(result);
    }
}
public class methods_invoking {
    public static void main(String[] args) {
        Mymath math = new Mymath();
        int a = 10;
        int b = 7;
        math.add(a,b);

        Triangle traingle = new Triangle(10.0f,5.0f);
        System.out.println(traingle);
    }
}
