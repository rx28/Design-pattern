package Creational_Patterns.Prototype;

public class Application {
    Shape [] shape=new Shape[4];

    public Application(){
        Circle circle=new Circle();
        circle.x=10;
        circle.y=20;
        circle.radius=30;
        shape[0]=circle;
        Circle anothercircle= (Circle) circle.clone();
        shape[1]=anothercircle;

        Rectangle rectangle= new Rectangle();
        rectangle.height=10;
        rectangle.width=23;
        rectangle.x=19;
        rectangle.y=33;
        shape[2]=rectangle;
        Rectangle anotherrectangle= (Rectangle) rectangle.clone();
        shape[3]=anotherrectangle;
        System.out.println(STR."Original Object -> \{shape[0]}");
        System.out.println(STR."Cloned Object -> \{shape[1]}");
        System.out.println(STR."Original Object -> \{shape[2]}");
        System.out.println(STR."Cloned object -> \{shape[3]}");

    }

}
