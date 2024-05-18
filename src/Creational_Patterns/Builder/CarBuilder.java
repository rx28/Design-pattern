package Creational_Patterns.Builder;

public class CarBuilder implements Builder{
    private Car car;

    public CarBuilder(){
        this.reset();
    }
    @Override
    public void reset() {
      this.car=new Car();

    }

    @Override
    public void setSeats(int seats) {
      car.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
      car.setEngine(engine);
    }

    @Override
    public void setGPS(String gps) {
      car.setGps(gps);
    }
    public Car getProduct(){
        Car product = this.car;
        this.reset();
        return product;
    }
}
