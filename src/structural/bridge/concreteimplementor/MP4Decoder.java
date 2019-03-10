package structural.bridge.concreteimplementor;

import structural.bridge.implementor.VideoDecoder;

public class MP4Decoder implements VideoDecoder {

    @Override
    public String decode(String path) {
        return "解码MP4 "+path;
    }
}
