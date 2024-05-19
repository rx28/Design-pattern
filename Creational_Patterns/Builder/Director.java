package Creational_Patterns.Builder;

public class Director {
    private Builder builder;

    public void setBuilder(Builder builder){
        this.builder=builder;
    }
    public void constructSportsCar(Builder builder){
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("Camaro");
        builder.setGPS("Camaro gps has been set");

    }
}
