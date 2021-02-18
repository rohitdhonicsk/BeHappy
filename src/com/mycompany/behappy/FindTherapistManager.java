/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.behappy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author soaka
 */
public class FindTherapistManager {

    /**
     * @param args the command line arguments
     */
    ArrayList<Therapist> arrlist=importDatabase();
    public static ArrayList importDatabase(){
        ArrayList<Therapist> arrlist=new ArrayList<>();
        
        try{
            String line="";
            BufferedReader br=new BufferedReader(new FileReader("src/utils/TherapistDataset.csv"));
            line=br.readLine();  
            while ((line = br.readLine()) != null )   //returns a Boolean value  
            {  
            String[] info = line.split(",");
//                System.out.println(info[9]);
            String address="";
            for (int i = 9; i < info.length; i++) 
            {
            address += (info[i] + ",");
            }
            Therapist t=new Therapist(info[0],info[3],info[5],info[6],info[1],address,info[4],info[7],info[8]);
//            System.out.println(Arrays.toString(info));
            arrlist.add(t);
            }   
         }
        catch(Exception e){
            e.printStackTrace();
        }
        return arrlist;
    }
    
    public  ArrayList<Therapist> recommend(String city,int budget){
        int i;
        ArrayList<Therapist> arr=new ArrayList<>();
        for(i=0;i<arrlist.size();i++){
            if(arrlist.get(i).getCity().equalsIgnoreCase(city) && Integer.parseInt(arrlist.get(i).getFees())<=budget)
            {
                arr.add(arrlist.get(i));
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        // TODO code application logic here
//    FindTherapistManager f=new FindTherapistManager();
//        ArrayList<Therapist> r=f.recommend("mumbai",6000);
//        for(int i = 0; i < r.size(); i++) {
//            System.out.println(r.get(i).getAddress());
//        }
   
//    new PreferencesUI().setVisible(true);
    }
    
}
