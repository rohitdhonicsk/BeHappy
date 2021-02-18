/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.behappy;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author soaka
 */
public class StartManager {
   
    public static ArrayList importDatabase(){
        ArrayList<MotivationalQuote> arrlist=new ArrayList<>();
       String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("src/utils/MotivationalQuote.csv"));
            line = br.readLine();
            int count = 0;
            while ((line = br.readLine()) != null) //returns a Boolean value  
            {
                String[] Info = line.split(",");
                MotivationalQuote mq = new MotivationalQuote();
                String quote="";
                for (int i = 1; i < Info.length-1; i++) 
                {
                     quote += (Info[i] + ",");
                }
                mq.setQuote(quote);
                mq.setAuthorName(Info[Info.length-1]);
                arrlist.add(mq);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return arrlist;
    }
    public String generateRandomString(){
         @SuppressWarnings("unchecked")
         ArrayList<MotivationalQuote> arrlist=importDatabase();
        Random r=new Random();
        
        int randomNumber=r.nextInt(arrlist.size());
        return arrlist.get(randomNumber).getQuote();
    }
    public static void main(String[] args) {
        
    System.out.println(StartManager.importDatabase());
    StartManager s=new StartManager();
        for(int i=0;i<5;i++)
        System.out.println(s.generateRandomString());
//        new StartUI().setVisible(true);
    }

}
