package Behavioral_Patterns.Command;

public class CutCommand extends Command {
    public CutCommand(Application app, Editor editor) {
        super(app, editor);
    }
    @Override
    public boolean execute() {
        saveBackup();
        System.out.println("Cutting text: " + editor.getSelection());
        app.clipboard = editor.getSelection();
        editor.deleteSelection();
        return true;
    }
}