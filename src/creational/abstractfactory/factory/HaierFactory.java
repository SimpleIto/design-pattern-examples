package creational.abstractfactory.factory;

import creational.abstractfactory.product.AirConditioner;
import creational.abstractfactory.product.HaierAirConditioner;
import creational.abstractfactory.product.HaierTV;
import creational.abstractfactory.product.TV;

public class HaierFactory implements ApplianceFactory {
    @Override
    public TV produceTV() {
        return new HaierTV();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HaierAirConditioner();
    }
}
