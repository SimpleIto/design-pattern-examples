package structural.bridge.refinedabstraction;

import structural.bridge.abstraction.VideoPlayer;
import structural.bridge.implementor.VideoDecoder;

public class WindowsVideoPlayer extends VideoPlayer {

    @Override
    public void play(String path) {
        System.out.println("Windows播放器:"+decoder.decode(path));
    }
}
