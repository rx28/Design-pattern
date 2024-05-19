package Structural_Patterns.Composite;

public class Dot implements Graphics{
    protected int x;
    protected int y;

    public Dot(){}
    public Dot(int x, int y){
        this.y=y;
        this.x=x;
    }


    @Override
    public void move(int x, int y) {
     this.x+=x;
     this.y+=y;
    }

    @Override
    public void draw() {
        System.out.println(STR."Coordinate of dot is (\{x} , \{y})");
    }
}
