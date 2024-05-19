package Behavioral_Patterns.Strategy;


public class Runner {
    public static void main(String[] args) {
        Context context=new Context();
        ConcreteStrategyAdd add=new ConcreteStrategyAdd();
        ConcreteStrategyMinus minus=new ConcreteStrategyMinus();
        context.setStrategy(add);
        System.out.println(context.executeStrategy(1,2));
        context.setStrategy(minus);
        System.out.println(context.executeStrategy(1,3));
    }
}
