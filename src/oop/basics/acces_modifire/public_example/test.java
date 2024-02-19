package oop.basics.acces_modifire.public_example;

import oop.basics.acces_modifire.public_example.package1.BasicClass;
import oop.basics.acces_modifire.public_example.package2.OtherClass;

public class test {
    public static void main(String[] args) {
        BasicClass basicClass = new BasicClass();
        basicClass.name = "basic";

        OtherClass otherClass = new OtherClass();
        otherClass.setName("otherclass");
    }
}
