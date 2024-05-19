package Behavioral_Patterns.Command;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Editor editor = new Editor();
        CommandHistory history = new CommandHistory();
        Application app = new Application(editor, history);

        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("Welcome to the Text Editor Application!");
        System.out.println("Initial text: " + editor.text);

        while (running) {
            System.out.println("\nEnter a command (copy, paste, cut, undo, or exit):");
            String command = scanner.nextLine();

            switch (command.toLowerCase()) {
                case "copy":
                    app.createUi("copy");
                    break;
                case "paste":
                    app.createUi("paste");
                    System.out.println("Current text: " + editor.text);
                    break;
                case "cut":
                    app.createUi("cut");
                    System.out.println("Current text: " + editor.text);
                    break;
                case "undo":
                    app.undo();
                    System.out.println("Current text: " + editor.text);
                    break;
                case "exit":
                    running = false;
                    System.out.println("Exiting application...");
                    break;
                default:
                    System.out.println("Invalid command. Please try again.");
            }
        }
    }
}