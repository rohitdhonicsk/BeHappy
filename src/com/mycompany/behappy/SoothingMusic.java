package com.mycompany.behappy;



/**
 *
 * @author SAURABH KUMAR
 */
public class SoothingMusic{
    private String musicName;
    private String composer;
    private String duration;

    public SoothingMusic() {
        this.musicName = null;
        this.composer = null;
        this.duration = null;
        
    }

    public String getMusicName() {
        return musicName;
    }

    public void setMusicName(String songName) {
        this.musicName = songName;
    }

    public String getComposer() {
        return composer;
    }

    public void setComposer(String composer) {
        this.composer = composer;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
    
}
