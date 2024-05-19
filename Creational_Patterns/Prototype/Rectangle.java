package Creational_Patterns.Prototype;

public class Rectangle extends Shape{
    public int width;
    public int height;

    public Rectangle(){}
    public Rectangle(Rectangle source){
        super(source);
        this.width=source.width;
        this.height=source.height;
    }
    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public String toString() {
        return STR."Rectangle{width=\{width}, height=\{height}, x=\{x}, y=\{y}, color='\{color}\{'\''}\{'}'}";
    }
}
