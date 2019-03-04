package creational.factorymethod.factory;

import creational.factorymethod.product.HisenseTV;
import creational.factorymethod.product.TV;

public class HisenseTVFactory implements TVFactory {
    @Override
    public TV produceTV() {
        return new HisenseTV();
    }
}
