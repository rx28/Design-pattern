package Creational_Patterns.Builder;

public class Manual {
    private int seats;
    private String engine;
    private String gps;

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getGps() {
        return gps;
    }

    public void setGps(String gps) {
        this.gps = gps;
    }

    @Override
    public String toString() {
        return STR."Manual{seats=\{seats}, engine='\{engine}\{'\''}, gps='\{gps}\{'\''}\{'}'}";
    }
}
