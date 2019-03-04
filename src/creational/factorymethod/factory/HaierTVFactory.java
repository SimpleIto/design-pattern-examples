package creational.factorymethod.factory;

import creational.factorymethod.product.HaierTV;
import creational.factorymethod.product.TV;

public class HaierTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        return new HaierTV();
    }
}
