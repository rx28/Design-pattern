package Creational_Patterns.FactoryMethod;

public class Config {
    public static void main(String[] args) {
        //Client Class
        //The application picks the class depending upon the current configuration.
        boolean Window=true;
        boolean Linux=false;
        Dialog dialog;
        if(Window) dialog = new WindowDialog();
        else dialog = new WindowDialog();
        Button button=dialog.createButton();
        button.onclick();
        button.render();
    }
}

