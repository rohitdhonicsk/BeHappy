package com.mycompany.behappy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author AANISHA BHATTACHARYA
 */


public class TakeTestManager 
{
    private String StressQuestions[][];
    private String headersStress[];
    private String AnxietyQuestions[][];
    private String headersAnxiety[];
    private String DepressionQuestions[][];
    private String headersDepression[];
    

    public TakeTestManager() 
    {
        StressQuestions = new String[8][8];
        headersStress = new String[8];
        AnxietyQuestions = new String[8][8];
        headersAnxiety  = new String[8];
        DepressionQuestions = new String[8][8];
        headersDepression = new String[8];
        init();
    }
    public void init()
    {
        
        Boolean s = Stress();
        Boolean a = Anxiety();
        Boolean d = Depression();

        if(s== true && a==true && d==true)
           System.out.println("All files read");
        
    }
    public Boolean Stress()
    {
        String line = "";  
        String splitBy = ",";
        
        int c = 0;
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("StressTest.csv"));  
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
        return true;
    }

    public Boolean Anxiety()
    {
        String line = "";  
        String splitBy = ",";
        int c = 0;
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("AnxietyTest.csv"));  
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
        return true;
    }
    public Boolean Depression()
    {
        String line = "";  
        String splitBy = ",";
        int c = 0;
        try   
        {  
            //parsing a CSV file into BufferedReader class constructor  
            BufferedReader br = new BufferedReader(new FileReader("DepressionTest.csv"));  
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
        return true;
    }
    public String getStress(int i)
    {
        return StressQuestions[i][1];
        
    }
     public String getAnxiety(int i)
    {
        return AnxietyQuestions[i][1];
        
    }
     public String getDepression(int i)
     {
         return DepressionQuestions[i][1];
     }
     public String feedback(int StressScore, int DepressionScore,int AnxietyScore )
     {
        String opn = "";
        if(StressScore>=0 && StressScore<=10)
            opn+="You don't have any stress related disorder,";
        else if(StressScore>=11 && StressScore<=16)
            opn+="You are likely to have a mild stress disorder,";

        else if(StressScore>=16 && StressScore<=20)
            opn+="You are likely to have a moderate stress disorder,";
        else if(StressScore>=20)
            opn+="You are likely to have severe stress disorder,";

        String op="";
        if(DepressionScore>=0 && DepressionScore<=10)
                op+="and minimal depression";
        else if(DepressionScore>=11 && DepressionScore<=16)
                op+="and mild depression";
        else if(DepressionScore>=16 && DepressionScore<=20)
                op+="and moderate depression";
        else
                op+="and severe depression";


        String opA = "";
        if(AnxietyScore<10)
            opA+="mild anxiety ";
        else if(AnxietyScore>=11 && AnxietyScore < 16)
            opA+="moderate anxiety ";
        else
            opA+="severe anxiety ";

        return opn+opA+op;
        //System.out.println(feedback);
    }
    
    
}
