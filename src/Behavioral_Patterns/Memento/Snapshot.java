package Behavioral_Patterns.Memento;

public class Snapshot {
    private Originator originator;
    private String state;

    public Snapshot(Originator originator, String state) {
        this.originator = originator;
        this.state = state;
    }

    public void restore(){
        originator.setState(state);
   }
}
