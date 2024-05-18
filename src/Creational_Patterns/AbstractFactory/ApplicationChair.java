package Creational_Patterns.AbstractFactory;

public class ApplicationChair {
    private Chair chair;
    private Sofa sofa;
    private FurnitureFactory factory;
    public ApplicationChair(FurnitureFactory factory){
      this.factory=factory;
    }

    public void createChair() {
        chair=factory.createChair();
    }
    public void createSofa(){
        sofa=factory.createSofa();
    }
    public void sitonchair(){
        chair.siton();
    }
    public void sitonsofa(){
        sofa.siton();
    }

}
