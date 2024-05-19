package Structural_Patterns.Flyweight;

public class Tree {
    private int x,y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
    public void draw(){
        type.draw(x,y);
    }
}
