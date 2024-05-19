package Behavioral_Patterns.State;

public interface State {
    void stateDetail();
    void checkStateTransition(Context context);
}