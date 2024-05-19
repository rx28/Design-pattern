package Behavioral_Patterns.Command;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Application {
    public String clipboard;
    private List<Editor> editors=new ArrayList<>();
    private Editor activeEditor;
    private  CommandHistory history;

    public Application(Editor activeEditor, CommandHistory history) {
        this.activeEditor = activeEditor;
        this.history = history;
    }

    public void createUi(String command) {
        if (Objects.equals(command, "copy")) {
            executeCommand(new CopyCommand(this, activeEditor));
        } else if (Objects.equals(command, "paste")) {
            executeCommand(new PasteCommand(this, activeEditor));
        } else if (Objects.equals(command, "cut")) { // Added this condition
            executeCommand(new CutCommand(this, activeEditor));
        } else {
            executeCommand(new UndoCommand(this, activeEditor));
        }
    }
    public void executeCommand(Command c) {
        System.out.println("Executing command: " + c.getClass().getSimpleName());
        if (c.execute()) {
            history.push(c);
            System.out.println("Command executed successfully.");
        } else {
            System.out.println("Command execution failed.");
        }
    }
    public void undo() {
        System.out.println("Performing undo operation...");
        if (!history.isEmpty()) {
            Command command = history.pop();
            command.undo();
            System.out.println("Undo operation completed.");
        } else {
            System.out.println("No commands to undo.");
        }
    }

}
