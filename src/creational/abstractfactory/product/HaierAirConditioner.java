package creational.abstractfactory.product;

public class HaierAirConditioner implements AirConditioner {
    @Override
    public void turnOn() {
        System.out.println("Haier Air Conditioner");
    }
}
