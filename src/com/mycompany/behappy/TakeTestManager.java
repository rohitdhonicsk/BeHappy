package com.mycompany.behappy;
import java.util.Scanner;
public class TakeTestManager extends TakeTestEntity
{
    public int StressScore;
    public int AnxietyScore;
    public int DepressionScore;
    public String feedback;
    Scanner sc = new Scanner(System.in);
    public void feedback()
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
        for(int i = 0;i<9;i++)
        {
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


        }

        AnxietyScore();
        
    }
    public void AnxietyScore()
    {
        for(int i = 0;i<8;i++)
        {
            System.out.println(AnxietyQuestions[i][0]+" In the past 2 weeks, how often "+AnxietyQuestions[i][1]);
            System.out.println("Press 1 for op1, 2 for op2, 3 for op3, 4 for op4");
            System.out.println(AnxietyQuestions[i][2]);
            System.out.println(AnxietyQuestions[i][3]);
            System.out.println(AnxietyQuestions[i][4]);
            System.out.println(AnxietyQuestions[i][5]);
            
            int a = 1;

            while(a==1)
            {
                int op = sc.nextInt();
                if(op<1 || op>5)
                 System.out.println("Press 1 for op1, 2 for op2, 3 for op3, 4 for op4");
                else
                {
                    if(op==1)
                     AnxietyScore+=3;
                    else if(op==2)
                     AnxietyScore+=2;
                    else if(op==3)
                     AnxietyScore+=1;
                    else if(op==4)
                     AnxietyScore+=0;
                    

                    a = 2;
                    
                    

                }
            }


        }
        DepressionScore();
        
    }
    public void DepressionScore()
    {
        for(int i = 0;i<21;i++)
        {
            System.out.println(DepressionQuestions[i][0]+" In the past 2 weeks, how often did you have this feeling : "+DepressionQuestions[i][1]);
            System.out.println("Press 1 for op1, 2 for op2, 3 for op3, 4 for op4");
            System.out.println(DepressionQuestions[i][2]);
            System.out.println(DepressionQuestions[i][3]);
            System.out.println(DepressionQuestions[i][4]);
            System.out.println(DepressionQuestions[i][5]);
            
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
        test.Stress();
        test.Anxiety();
        test.Depression();
        test.StressScore();
        
        
    }
}
