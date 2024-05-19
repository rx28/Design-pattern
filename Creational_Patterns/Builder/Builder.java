package Creational_Patterns.Builder;

public interface Builder {
    public void reset();
    public void setSeats(int seats);
    public void setEngine(String engine);
    public void setGPS(String gps);

}
