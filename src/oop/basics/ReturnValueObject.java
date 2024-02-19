package oop.basics;

class Circle{
    float radius;

    Circle(float r){
        radius = r;
    }
}

class MathMethods{
    public int add(int a,int b){
        return a + b;
    }
    public int substract(int a,int b){
        return a - b;
    }
    public Circle getNewCircle(float radius){
        Circle c = new Circle(radius);
        return c;
    }
}

public class ReturnValueObject {
    public static void main(String[] args) {
        MathMethods math = new MathMethods();
        int result = math.add(8,8);
        int result1 = math.substract(10,6);
        System.out.println(result1);
        System.out.println(result);

        Circle circle = math.getNewCircle(10.0f);
        System.out.println(circle.radius);
    }
}
