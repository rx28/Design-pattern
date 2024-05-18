package Creational_Patterns.FactoryMethod;

public class WindowDialog extends Dialog{
    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
