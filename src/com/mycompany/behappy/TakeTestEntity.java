package com.mycompany.behappy;

import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException;  

/**
 *
 * @author AANISHA BHATTACHARYA
 */


public class TakeTestEntity 
{
    private int StressScore;
    private int AnxietyScore;
    private int DepressionScore;
    private String feedback;

    public TakeTestEntity() {
        this.StressScore = 0;
        this.AnxietyScore = 0;
        this.DepressionScore = 0;
        this.feedback = "";
        
        
    }

    public int getStressScore() {
        return StressScore;
    }

    public int getAnxietyScore() {
        return AnxietyScore;
    }

    public int getDepressionScore() {
        return DepressionScore;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setStressScore(int StressScore) {
        this.StressScore = StressScore;
    }

    public void setAnxietyScore(int AnxietyScore) {
        this.AnxietyScore = AnxietyScore;
    }

    public void setDepressionScore(int DepressionScore) {
        this.DepressionScore = DepressionScore;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    
}
