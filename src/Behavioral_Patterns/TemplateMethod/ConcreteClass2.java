package Behavioral_Patterns.TemplateMethod;

public class ConcreteClass2 extends TemplateClass{

    public ConcreteClass2() {
        super();
    }

    @Override
    public void step1() {
        System.out.println("step 1 from Concrete class 2");

    }

    @Override
    public void step2() {
        System.out.println("step 2 from Concrete class 2");

    }

    @Override
    public void step3() {
        System.out.println("step 3 from Concrete class 2");

    }
}
