package oop.basics.Inheritance.super_example;

public final class Directory extends Person{
    private int officeNum;

    public Directory(String name, String surname, int officeNum) {
        super(name, surname);
        this.officeNum = officeNum;
    }

    public int getOfficeNum() {
        return officeNum;
    }

    public void setOfficeNum(int officeNum) {
        this.officeNum = officeNum;
    }
}