package Creational_Patterns.AbstractFactory;

public class ModernChair implements Chair{
    @Override
    public void siton() {
        System.out.println("modern chair is chosen");
    }
}
