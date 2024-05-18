package Behavioral_Patterns.State;

public class State1 implements State {
    @Override
    public void stateDetail() {
        System.out.println("This is state 1");
    }

    @Override
    public void checkStateTransition(Context context) {
        // Add logic for state transition if necessary
    }
}