package Creational_Patterns.FactoryMethod;

public class LinuxDialog extends Dialog{
    @Override
    Button createButton() {
        return new LinuxButton();
    }
}
