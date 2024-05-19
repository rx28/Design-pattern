package Behavioral_Patterns.State;

public class Context {
    private State state;
    private int stateValue;

    public int getStateValue() {
        return stateValue;
    }

    public void setStateValue(int stateValue) {
        this.stateValue = stateValue;
        // Request state transition whenever state value changes
        state.checkStateTransition(this);
    }

    public void setState(State state) {
        this.state = state;
    }

    public void request() {
        state.stateDetail();
    }
}
