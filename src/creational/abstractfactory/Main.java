package creational.abstractfactory;

import creational.abstractfactory.factory.ApplianceFactory;
import creational.abstractfactory.product.AirConditioner;
import creational.abstractfactory.product.TV;
import utils.Bean;
import utils.XmlParser;

public class Main {
    public static void main(String[] agrs) throws Exception {
        ApplianceFactory factory = (ApplianceFactory) Bean.getBean(new XmlParser("src/creational/abstractfactory/config.xml").
                getFirstElementValue("factory"));

        TV myTV = factory.produceTV();
        myTV.play();
        AirConditioner myAC = factory.produceAirConditioner();
        myAC.turnOn();
    }

}
