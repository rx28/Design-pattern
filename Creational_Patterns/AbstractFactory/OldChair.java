package Creational_Patterns.AbstractFactory;

public class OldChair implements Chair{
    @Override
    public void siton() {
        System.out.println("Old chair is chosen");
    }
}
