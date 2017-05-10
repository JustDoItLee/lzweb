package soundsystem;

import java.util.List;

/**
 * @author 李智
 * @date 2017/5/10
 */
public class BlankDisc implements CompactDisc {
    private String title;
    private String artist;
    private List<String> tracks;

    public BlankDisc(String title, String artist, List<String> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
    }

    public void play() {
        System.out.println("Playing" + title + "by" + artist);
        for (String track : tracks) {
            System.out.println("-Track:" + track);
        }
    }
}
