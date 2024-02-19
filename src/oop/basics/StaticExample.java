package oop.basics;

class PlaneWithStatic{
    static int nextId = 1;
    int id;
    int x,y;
    static int getNextId(){
        return nextId++;
    }
    PlaneWithStatic(){
        id = PlaneWithStatic.getNextId();
    }
}
//StaticExample.main(args)
public class StaticExample {
    public static int add(int a, int b){
        return a+b;
    }
    public int subb(int a, int b){
        return a+b;
    }
    public static void main(String[] args) {
        PlaneWithStatic plane = new PlaneWithStatic();
       // plane.nextId = 7;
        System.out.println(plane.id);
        PlaneWithStatic plane1 = new PlaneWithStatic();
        System.out.println(plane1.id);
        System.out.println(StaticExample.add(5,10));
        StaticExample sExample = new StaticExample();
        System.out.println(sExample.subb(5,30));
    }
}
