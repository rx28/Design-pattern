package Creational_Patterns.Singleton;

public class Application {
    public static void main(String[] args) {
        Database foo=Database.getInstance();
        foo.query();
        Database bar=Database.getInstance();
        bar.query();
        //Checking if both the instances are same
        System.out.println(foo.equals(bar));
    }
}
