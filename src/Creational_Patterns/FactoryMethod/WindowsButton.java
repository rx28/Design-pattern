package Creational_Patterns.FactoryMethod;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println("window class is rendering");

    }

    @Override
    public void onclick() {
        System.out.println("window class is clicking");
    }
}
