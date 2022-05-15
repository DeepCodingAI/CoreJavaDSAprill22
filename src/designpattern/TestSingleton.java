package designpattern;

public class TestSingleton {

    public static void main(String[] args) {
        Database singleton = Database.getInstance();
        singleton.databaseConnection();
    }
}
