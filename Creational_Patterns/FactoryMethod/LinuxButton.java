package Creational_Patterns.FactoryMethod;

public class LinuxButton implements Button{
    @Override
    public void render() {
        System.out.println("Linux class is rendering");
    }

    @Override
    public void onclick() {
        System.out.println("linux class is clicking");
    }
}
