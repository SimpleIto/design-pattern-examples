package creational.abstractfactory.factory;

import creational.abstractfactory.product.AirConditioner;
import creational.abstractfactory.product.TV;

public interface ApplianceFactory {
    public TV produceTV();
    public AirConditioner produceAirConditioner();
}
