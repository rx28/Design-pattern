package Behavioral_Patterns.Memento;

public class Originator {
    private String state;


    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Snapshot createSnapshot(){
        return new Snapshot(this,state);
    }


}
