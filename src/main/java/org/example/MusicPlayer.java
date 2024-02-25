package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;

    public MusicPlayer() {}


    public void setMusicList(Music... music) {
        this.musicList.addAll(Arrays.asList(music));
    }
    //IoC
//    public MusicPlayer(Music music) {
//        this.music = music;
//    }
    public void setMusicList(Music music) {
        this.musicList.add(music);
    }

    public int getVolume() {
        return volume;
    }
    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void playMusic() {
        for (Music music : musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }

}

