package Creational_Patterns.Builder;

public class Application {
    public void makeCar(){
        Director director = new Director();
        CarBuilder builder=new CarBuilder();
        director.constructSportsCar(builder);

        Car car=builder.getProduct();
        System.out.println(car.toString());
    }

}
