package Creational_Patterns.AbstractFactory;

public class ApplicationConfigurator {
    public static void main(String[] args) {
        //Client code
        //As FurnitureFactory is a interface implemented by both modern and old.
        //User can select which factory to use at runtime without coupling the whole code
        //to factory specific.

        FurnitureFactory factory=new ModernFactory();
    //  FurnitureFactory factory=new OldFactory();

        ApplicationChair app=new ApplicationChair(factory);
        app.createChair();
        app.createSofa();
        app.sitonchair();
        app.sitonsofa();

    }
}
