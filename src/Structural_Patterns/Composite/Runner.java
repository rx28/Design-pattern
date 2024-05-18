package Structural_Patterns.Composite;

public class Runner {
    public static void main(String[] args) {
        CompoundGraphic all=new CompoundGraphic();
        all.add(new Dot(1,2));
        all.add(new Circle(1,2,3));

        all.draw();
    }
}
