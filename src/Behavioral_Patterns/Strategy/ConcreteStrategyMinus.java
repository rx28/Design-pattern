package Behavioral_Patterns.Strategy;

public class ConcreteStrategyMinus implements Strategy{
    @Override
    public int execute(int a, int b) {
        return a-b;
    }
}
