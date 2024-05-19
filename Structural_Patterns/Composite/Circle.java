package Structural_Patterns.Composite;

public class Circle extends Dot{

    private int radius;
    public Circle(int x,int y, int radius){
        super(x,y);
        this.radius=radius;
    }
    public void draw(){
        System.out.println(STR."Circle is drawn at coordinate x and y -> (\{x} , \{y}) with radius -> \{radius}");
    }

}
