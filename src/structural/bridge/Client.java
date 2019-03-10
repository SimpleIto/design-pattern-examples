package structural.bridge;

import org.dom4j.DocumentException;
import structural.bridge.abstraction.VideoPlayer;
import structural.bridge.implementor.VideoDecoder;
import utils.Bean;
import utils.XmlParser;

public class Client {
    public static void main(String[] args) throws DocumentException, IllegalAccessException, InstantiationException, ClassNotFoundException {
        XmlParser parser = new XmlParser("src/structural/bridge/config.xml");

        VideoPlayer player = (VideoPlayer) Bean.getBean(parser.getFirstElementValue("player"));
        VideoDecoder decoder = (VideoDecoder) Bean.getBean(parser.getFirstElementValue("type"));
        player.setVideoDecoder(decoder);

        player.play("lol.flv");
    }
}
