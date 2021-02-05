package com.mycompany.behappy;

import java.io.*;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
public class LoginManager{
public  HashMap importDatabase(){
HashMap<String, String> data=new HashMap<>();
try{
    String line="";
    BufferedReader br = new BufferedReader(new FileReader("F:\\behappy\\behappy\\src\\main\\java\\com\\mycompany\\behappy\\dbs.csv"));
    line=br.readLine();  
    while ((line = br.readLine()) != null)   //returns a Boolean value  
    {  
    String[] info = line.split(",");    // use comma as separator  
    data.put(info[0],info[1]);
    }
}
catch(Exception e){
e.printStackTrace();
}
return data;
}

public String verifyDetails(Admin a){
    HashMap d=this.importDatabase();
 if(d.containsKey(a.getUsername())){
     if(d.get(a.getUsername()).equals(a.getPwd())){
        System.out.println("correct password");
//         JOptionPane.showMessageDialog(this,"Login successful");
         return "Login Successful";
     }
     else{
         System.out.println("wrong password");
//         JOptionPane.showMessageDialog(this,"Please enter correct password");
         return "Please enter correct password";
     }

 }
 else{
    System.out.println("no user found");
    return "No user found";
 }
}


public static void main(String[] args) {
     
    LoginManager l=new LoginManager();
    Admin a=new Admin("akash","1111");
    assert l.verifyDetails(a).equals("correct password");
    Admin b=new Admin("aksh","1111");
    assert l.verifyDetails(b).equals("no user found");
    Admin c=new Admin("akash","111");
    assert l.verifyDetails(c).equals("Please enter correct password");
}
}