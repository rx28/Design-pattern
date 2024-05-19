package Behavioral_Patterns.TemplateMethod;

public abstract class TemplateClass {

    public TemplateClass() {
        step1();
        step2();
        step3();
    }

    public void step0() {
        System.out.println("starts with step 0");
    }

    public abstract void step1();

    public abstract void step2();

    public abstract void step3();

}
