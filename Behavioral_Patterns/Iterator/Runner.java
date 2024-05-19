package Behavioral_Patterns.Iterator;

public class Runner {
    public static void main(String[] args) {
        // Create profiles
        Profile alice = new Profile("Alice", "alice123");
        Profile bob = new Profile("Bob", "bob456");
        Profile charlie = new Profile("Charlie", "charlie789");

        // Create social network
        Facebook facebook = new Facebook();
        facebook.addEdge(alice, bob);
        facebook.addEdge(alice, charlie);

        // Create application and configure
        Application app = new Application();
        app.config();

        // Demonstrate sending messages to friends
        System.out.println("Sending message to friends of Alice:");
        app.SendsMessageToFriends(alice);

//      Demonstrate sending spam to coworkers of Bob
        System.out.println("\nSending spam to coworkers of Bob:");
        app.SendsSpamtoCowerkers(bob);
    }
}
