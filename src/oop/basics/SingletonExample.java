package oop.basics;

import java.util.Date;

class DBConnection{

    private static DBConnection instancja;

    public static DBConnection getInstance(){
        if(instancja == null) {
            instancja = new DBConnection();
        }
        return instancja;
    }
    public void getFromDB(){
        System.out.println("dane z bazy");
    }
}
public class SingletonExample {
    public static void main(String[] args) {
        DBConnection connection = DBConnection.getInstance();
        DBConnection connection1 = DBConnection.getInstance();
        System.out.println(connection==connection1);
        connection1.getFromDB();
        Date y = new Date();
        System.out.println(y);
    }
}
