package structural.bridge.abstraction;

import structural.bridge.implementor.VideoDecoder;

public abstract class VideoPlayer {
    protected VideoDecoder decoder;

    public abstract void play(String path);

    public void setVideoDecoder(VideoDecoder decoder){
        this.decoder = decoder;
    }
}
