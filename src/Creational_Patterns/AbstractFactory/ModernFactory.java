package Creational_Patterns.AbstractFactory;

public class ModernFactory implements FurnitureFactory{
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
