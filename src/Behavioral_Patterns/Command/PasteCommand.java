package Behavioral_Patterns.Command;

public class PasteCommand extends Command{

    public PasteCommand(Application app, Editor editor) {
        super(app, editor);
    }
    @Override
    public boolean execute() {

        saveBackup();
        System.out.println("Pasting text: " + app.clipboard);
        editor.replaceSelection(app.clipboard);
        return true;
    }
}
