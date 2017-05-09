package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @author 李智
 * @date 2017/5/9
 */
@Component
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt.Pepper's Lonely Hearts Club Band";
    private String artist = "The Beatles";

    public void play() {
        System.out.println("Playing" + title + "by" + artist);
    }
}
