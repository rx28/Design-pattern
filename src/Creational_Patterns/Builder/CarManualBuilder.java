package Creational_Patterns.Builder;

public class CarManualBuilder implements Builder{
    private Manual manual;

    public CarManualBuilder(){
        this.reset();
    }

    @Override
    public void reset() {
       this.manual=new Manual();
    }

    @Override
    public void setSeats(int seats) {
        manual.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
       manual.setEngine(engine);
    }

    @Override
    public void setGPS(String gps) {
      manual.setGps(gps);
    }
    public Manual getProduct(){
        Manual product = this.manual;
        this.reset();
        return product;
    }
}
