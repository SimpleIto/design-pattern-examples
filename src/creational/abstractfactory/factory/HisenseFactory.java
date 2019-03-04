package creational.abstractfactory.factory;

import creational.abstractfactory.product.AirConditioner;
import creational.abstractfactory.product.HisenseAirConditioner;
import creational.abstractfactory.product.HisenseTV;
import creational.abstractfactory.product.TV;

public class HisenseFactory implements ApplianceFactory {
    @Override
    public TV produceTV() {
        return new HisenseTV();
    }

    @Override
    public AirConditioner produceAirConditioner() {
        return new HisenseAirConditioner();
    }
}
