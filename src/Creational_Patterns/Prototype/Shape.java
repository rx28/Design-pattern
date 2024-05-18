package Creational_Patterns.Prototype;
//BASE PROTOTYPE
public abstract class Shape {

    public int x;
    public int y;
    public String color;

    public Shape(){

    }
    public Shape(Shape source){
        this();
        this.x=source.x;
        this.y=source.y;
        this.color=source.color;
    }

    public abstract Shape clone();
}
