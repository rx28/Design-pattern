package Behavioral_Patterns.TemplateMethod;

public class ConcreteClass1 extends TemplateClass{
    public ConcreteClass1() {
        super();
    }

    @Override
    public void step1() {
        System.out.println("step 1 from Concrete class 1");
    }

    @Override
    public void step2() {
        System.out.println("step 2 from Concrete class 1");

    }

    @Override
    public void step3() {
        System.out.println("step 3 from Concrete class 1");

    }
}
