package structural.bridge.concreteimplementor;

import structural.bridge.implementor.VideoDecoder;

public class FLVDecoder implements VideoDecoder {

    @Override
    public String decode(String path) {
        return "解码FLV "+path;
    }
}
