package Creational_Patterns.Prototype;

public class Circle extends Shape{
    public int radius;
    public Circle(){}
    public Circle(Circle source){
        super(source);
        this.radius=source.radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public String toString() {
        return STR."Circle{radius=\{radius}, x=\{x}, y=\{y}, color='\{color}\{'\''}\{'}'}";
    }
}
