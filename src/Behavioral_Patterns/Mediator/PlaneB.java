package Behavioral_Patterns.Mediator;

public class PlaneB implements Plane{
    private int PlaneId;
    private Mediator mediator;

    public PlaneB(int planeId, Mediator mediator) {
        PlaneId = planeId;
        this.mediator = mediator;
    }

    public int getPlaneId() {
        return PlaneId;
    }

    public void setPlaneId(int planeId) {
        PlaneId = planeId;
    }

    @Override
    public Boolean response() {

        return mediator.response(this);
    }

}
