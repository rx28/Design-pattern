package Behavioral_Patterns.Command;

public class Editor {
    public String text="sample text";

    public String getSelection(){
          return text;

    }


    public void deleteSelection() {
        System.out.println(STR."Deleting text: \{text}");
        text = "";
    }

    public void replaceSelection(String text) {
        System.out.println(STR."Replacing text with: \{text}");
        this.text = text;
    }
}
