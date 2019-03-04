package creational.factorymethod;

import creational.factorymethod.factory.TVFactory;
import creational.factorymethod.product.TV;
import utils.Bean;
import utils.XmlParser;

public class Main {
    public static void main(String[] args) throws Exception{
        XmlParser xml = new XmlParser("src/creational/factorymethod/config.xml");
        TVFactory factory = (TVFactory) Bean.getBean(xml.getFirstElementValue("factory"));
        TV tv = factory.produceTV();
        tv.play();
    }
}
