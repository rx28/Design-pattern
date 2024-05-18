package Behavioral_Patterns.Command;

import java.util.EmptyStackException;

public class UndoCommand extends Command {

    public UndoCommand(Application app, Editor editor) {
        super(app, editor);
    }

    @Override
    public boolean execute() {
        System.out.println("Undoing last operation...");
        try {
            app.undo();
            return true;
        } catch (EmptyStackException e) {
            System.out.println("No commands to undo.");
            return false;
        }
    }
}