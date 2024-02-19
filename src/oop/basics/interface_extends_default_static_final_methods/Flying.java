package oop.basics.interface_extends_default_static_final_methods;

public interface Flying {
    public static final float DEFAULT_WINGSPAN = 0.7f;
    public void fly();
    public default void flyHigher(){
        System.out.println("Flying higger");
    }
    public default float getWingspan(){
        return Flying.DEFAULT_WINGSPAN;
    }
    public static int getDeafultNumWings(){
        return 2;
    }
}
