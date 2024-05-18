package Behavioral_Patterns.TemplateMethod;

public class Runner {
    public static void main(String[] args) {
        TemplateClass templateClass1=new ConcreteClass1();
        System.out.println("---------------------------");
        TemplateClass templateClass2=new ConcreteClass2();


    }
}
