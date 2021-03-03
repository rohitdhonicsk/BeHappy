package com.mycompany.behappy;



/**
 *
 * @author SAURABH KUMAR
 */
public class MotivationalStory {
    private String writerName;
    private String storyTitle;
    private String shortDes;
    private String story;

    public MotivationalStory() {
        this.writerName = null;
        this.storyTitle = null;
        this.shortDes = null;
        this.story = null;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getStoryTitle() {
        return storyTitle;
    }

    public void setStoryTitle(String storyTitle) {
        this.storyTitle = storyTitle;
    }

    public String getShortDes() {
        return shortDes;
    }

    public void setShortDes(String shortDes) {
        this.shortDes = shortDes;
    }

    public String getStory() {
        return story;
    }

    public void setStory(String story) {
        this.story = story;
    }
}
