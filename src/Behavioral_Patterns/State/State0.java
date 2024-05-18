package Behavioral_Patterns.State;

public class State0 implements State {
    @Override
    public void stateDetail() {
        System.out.println("This is state 0");
    }

    @Override
    public void checkStateTransition(Context context) {
        if (context.getStateValue() == 1) {
            context.setState(new State0());
        }
    }
}