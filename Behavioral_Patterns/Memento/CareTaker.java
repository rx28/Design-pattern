package Behavioral_Patterns.Memento;

public class CareTaker {
    private Originator originator;
    private Snapshot backup;

    public CareTaker() {

    }

    public CareTaker(Originator originator) {
        this.originator = originator;
    }

    public void makeBackup(){

        backup= originator.createSnapshot();

    }
    public void undo(){
        if(backup!=null){
            backup.restore();
        }
    }


}
