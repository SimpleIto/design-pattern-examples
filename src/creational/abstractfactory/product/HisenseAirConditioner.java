package creational.abstractfactory.product;

public class HisenseAirConditioner implements AirConditioner {
    @Override
    public void turnOn() {
        System.out.println("Hisense Air Conditioner");
    }
}
