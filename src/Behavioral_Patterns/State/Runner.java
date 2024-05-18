package Behavioral_Patterns.State;

public class Runner {
    public static void main(String[] args) {
        //Inverse the bits
        State initialState = new State0();
        Context context = new Context();
        context.setState(initialState);
        context.setStateValue(1);
        context.request();
    }
}
