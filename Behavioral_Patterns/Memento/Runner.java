package Behavioral_Patterns.Memento;

public class Runner {
    public static void main(String[] args) {
        Originator originator=new Originator();
        originator.setState("state 1");
        System.out.println(originator.getState());
        CareTaker careTaker=new CareTaker(originator);
        careTaker.makeBackup();
        originator.setState("state 2");
        System.out.println(originator.getState());
        careTaker.undo();
        System.out.println(originator.getState());

    }
}
