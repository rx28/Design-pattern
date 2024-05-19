package Behavioral_Patterns.Mediator;

public class Runner {
    public static void main(String[] args) {
        Mediator mediator = new ConfigMediator();
        PlaneA planeA = new PlaneA(1, mediator);
        System.out.println("Plane A (ID: " + planeA.getPlaneId() + ") requesting access to runway: " + planeA.response());

        // Introduce a delay between the creation of PlaneA and PlaneB
        try {
            Thread.sleep(2000); // Sleep for 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        PlaneB planeB = new PlaneB(2, mediator);
        System.out.println("Plane B (ID: " + planeB.getPlaneId() + ") requesting access to runway: " + planeB.response());
    }
}
