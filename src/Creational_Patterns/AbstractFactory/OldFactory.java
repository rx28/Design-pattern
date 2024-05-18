package Creational_Patterns.AbstractFactory;

public class OldFactory implements FurnitureFactory{
    @Override
    public Sofa createSofa() {
        return new OldSofa();
    }

    @Override
    public Chair createChair() {
        return new OldChair();
    }
}
