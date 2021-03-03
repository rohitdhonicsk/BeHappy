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
/*{
    public String StressQuestions[][] = new String[9][7];
    public String headersStress[] = new String[7];
    public String AnxietyQuestions[][] = new String[8][6];
    public String headersAnxiety[] = new String[6];
    public String DepressionQuestions[][] = new String[21][6];
    public String headersDepression[] = new String[6];

    void Stress()
    {
        String line = "";  
        String splitBy = ",";
        
        int c = 0;
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("C://Users/Aanisha/Desktop/TakeTest/utils/StressTest.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {  
                if(c==0)
                    headersStress = line.split(splitBy);
                else
                    StressQuestions[c-1] = line.split(splitBy);    

                c++;
            }  
        }   
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }
    }

    void Anxiety()
    {
        String line = "";  
        String splitBy = ",";
        int c = 0;
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("C://Users/Aanisha/Desktop/TakeTest/utils/AnxietyTest.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {  
                if(c==0)
                    headersAnxiety = line.split(splitBy);
                else
                    AnxietyQuestions[c-1] = line.split(splitBy);    

                c++;
            }  
        }   
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }
    }
    void Depression()
    {
        String line = "";  
        String splitBy = ",";
        int c = 0;
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("C://Users/Aanisha/Desktop/TakeTest/utils/"
                    + "DepressionTest.csv"));  
            while ((line = br.readLine()) != null)   //returns a Boolean value  
            {  
                if(c==0)
                    headersDepression = line.split(splitBy);
                else
                    DepressionQuestions[c-1] = line.split(splitBy);    

                c++;
            }  
        }   
        catch (IOException e)   
        {  
            e.printStackTrace();  
        }
    }

}*/
