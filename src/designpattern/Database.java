package designpattern;

public class Database {

    private Database(){}

    public static Database getInstance(){
         return new Database();
    }

    public void databaseConnection(){
        System.out.println("you have one data base connection instance");
    }
}
