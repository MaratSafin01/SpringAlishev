package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;
import java.util.List;


public class MusicPlayer {

    private Music music1;
    private Music music2;

    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(Music music1,
                       Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic() {
        return music1.getSong() + ", " +  music2.getSong();
    }

    @Override
    public String toString() {
        return "MusicPlayer{" +
                "music=" + music1 + ", " + music2 +
                '}';
    }

    @PostConstruct
    public void init() {
        System.out.println("Music player initialized...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Music player destroyed...");
    }
}
