package Creational_Patterns.Singleton;

public class Database {
    // Private static variable to hold the single instance of the class
    private static Database instance;

    // Private constructor to prevent instantiation from outside
    private Database() {
        // Initialization code
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            synchronized (Database.class) {
                if (instance == null) {
                    instance = new Database();
                }
            }
        }
        return instance;
    }
    public void query(){
        System.out.println("Its running");
    }


}
