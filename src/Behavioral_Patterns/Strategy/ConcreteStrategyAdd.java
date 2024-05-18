package Behavioral_Patterns.Strategy;

public class ConcreteStrategyAdd implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a+b;
    }
}
