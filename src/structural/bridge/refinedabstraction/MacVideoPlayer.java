package structural.bridge.refinedabstraction;

import structural.bridge.abstraction.VideoPlayer;

public class MacVideoPlayer extends VideoPlayer {

    @Override
    public void play(String path) {
        System.out.println("Mac播放器："+decoder.decode(path));
    }
}
