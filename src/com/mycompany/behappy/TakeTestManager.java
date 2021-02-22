package com.mycompany.behappy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
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
        init();
    }
    public void init()
    {
        StressQuestions = new String[8][8];
        headersStress = new String[8];
        AnxietyQuestions = new String[8][8];
        headersAnxiety  = new String[8];
        DepressionQuestions = new String[8][8];
        headersDepression = new String[8];
        Stress();
        Anxiety();
        Depression();
        
    }
    void Stress()
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
    }

    void Anxiety()
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
    }
    void Depression()
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
/*{
    public int StressScore;
    public int AnxietyScore;
    public int DepressionScore;
    public String feedback;
    
    public static TakeTestEntity ent = new TakeTestEntity();
    Scanner sc = new Scanner(System.in);
    public String feedback()
    {
        String opn = "";
        if(StressScore>=0 && StressScore<=19)
            opn+="You don't have any stress related disorder,";
        else if(StressScore>=20 && StressScore<=24)
            opn+="You are likely to have a mild stress disorder,";

        else if(StressScore>=25 && StressScore<=29)
            opn+="You are likely to have a moderate stress disorder,";
        else if(StressScore>=30 && StressScore<=50)
            opn+="You are likely to have severe stress disorder,";

        String op="";
        if(DepressionScore>=0 && DepressionScore<=10)
                op+="and minimal depression";
        else if(DepressionScore>=11 && DepressionScore<=20)
                op+="and mild depression";
        else if(DepressionScore>=21 && DepressionScore<=29)
                op+="and moderate depression";
        else
                op+="and severe depression";


        String opA = "";
        if(AnxietyScore<18)
            opA+="mild anxiety ";
        else if(AnxietyScore>=18)
            opA+="moderate anxiety ";
        else
            opA+="severe anxiety ";

        feedback = opn+opA+op;
        System.out.println(feedback);
    }
    public void StressScore()
    {
        //for(int i = 0;i<9;i++)
        //{
            /*System.out.println(StressQuestions[i][0]+" In the past 4 weeks,"+StressQuestions[i][1]);
            System.out.println("Press 1 for op1, 2 for op2, 3 for op3, 4 for op4, 5 for op5");
            System.out.println(StressQuestions[i][2]);
            System.out.println(StressQuestions[i][3]);
            System.out.println(StressQuestions[i][4]);
            System.out.println(StressQuestions[i][5]);
            System.out.println(StressQuestions[i][6]);*/
            /*int a = 1;

            while(a==1)
            {
                int op = sc.nextInt();
                if(op<1 || op>5)
                 System.out.println("Press 1 for op1, 2 for op2, 3 for op3, 4 for op4, 5 for op5");
                else
                {
                    if(op==1)
                     StressScore+=5;
                    else if(op==2)
                     StressScore+=4;
                    else if(op==3)
                     StressScore+=3;
                    else if(op==4)
                     StressScore+=2;
                    else
                     StressScore+=1;

                    a = 2;
                    
                    

                }
            }*/


        //}
       /* ent.Stress();
        ent.Anxiety();
        ent.Depression();
        //AnxietyScore();
        
    }
    public String getStress(int i)
    {
        return ent.StressQuestions[i][1];
        
    }
     public String getAnxiety(int i)
    {
        return ent.AnxietyQuestions[i][1];
        
    }
     public String getDepression(int i)
     {
         return ent.DepressionQuestions[i][1];
     }
    public void DepressionScore()
    {
        for(int i = 0;i<21;i++)
        {
            System.out.println(ent.DepressionQuestions[i][0]+" In the past 2 weeks, how often did you have this feeling : "+ent.DepressionQuestions[i][1]);
            System.out.println("Press 1 for op1, 2 for op2, 3 for op3, 4 for op4");
            System.out.println(ent.DepressionQuestions[i][2]);
            System.out.println(ent.DepressionQuestions[i][3]);
            System.out.println(ent.DepressionQuestions[i][4]);
            System.out.println(ent.DepressionQuestions[i][5]);
            
            int a = 1;

            while(a==1)
            {
                int op = sc.nextInt();
                if(op<1 || op>5)
                 System.out.println("Press 1 for op1, 2 for op2, 3 for op3, 4 for op4");
                else
                {
                    if(op==1)
                     DepressionScore+=3;
                    else if(op==2)
                     DepressionScore+=2;
                    else if(op==3)
                     DepressionScore+=1;
                    else if(op==4)
                     DepressionScore+=0;
                    

                    a = 2;
                    
                    

                }
            }


        }
        feedback();
    }
    public static void main(String args[])
    {
        TakeTestManager test = new TakeTestManager();
        
        test.StressScore();
        
        
    }
}*/
