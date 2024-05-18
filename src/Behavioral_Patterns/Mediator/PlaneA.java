package Behavioral_Patterns.Mediator;

public class PlaneA implements Plane{
    private int PlaneId;

    private Mediator mediator;

    public PlaneA(int planeId, Mediator mediator) {
        PlaneId = planeId;
        this.mediator = mediator;
    }

    @Override
    public Boolean response() {
       return mediator.response(this);

    }

    public int getPlaneId() {
        return PlaneId;
    }

    public void setPlaneId(int planeId) {
        PlaneId = planeId;
    }

    @Override
    public String toString() {
        return STR."PlaneA{PlaneId=\{PlaneId}\{'}'}";
    }
}
