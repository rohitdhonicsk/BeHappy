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
    BufferedReader br = new BufferedReader(new FileReader("dbs.csv"));
    line=br.readLine();  
    while ((line = br.readLine()) != null)   //returns a Boolean value  
    {  
    String[] info = line.split(",");    // use comma as separator  
    data.put(info[0],info[1]);
    }
br.close();
}
catch(Exception e){
e.printStackTrace();
}
return data;
}

//public String verifyDetails(Admin a){
//    HashMap d=this.importDatabase();
// if(d.containsKey(a.getUsername())){
//     if(d.get(a.getUsername()).equals(a.getPwd())){
//        System.out.println("correct password");
////         JOptionPane.showMessageDialog(this,"Login successful");
//         return "Login Successful";
//     }
//     else{
//         System.out.println("wrong password");
////         JOptionPane.showMessageDialog(this,"Please enter correct password");
//         return "Please enter correct password";
//     }
//
// }
// else{
//    System.out.println("no user found");
//    return "No user found";
// }
//}
public boolean verifyPassword(Admin a){
    HashMap d=this.importDatabase();
    if(d.containsKey(a.getUsername())){
     if(d.get(a.getUsername()).equals(a.getPwd())){
        System.out.println("correct password");
         return true;
     }
    }
    return false;
}
public boolean verifyUsername(Admin a){
    HashMap d=this.importDatabase();
    if(d.containsKey(a.getUsername())){
     return true;
    }
    return false;
}


public static void main(String[] args) {
     
    LoginManager l=new LoginManager();
//    l.importDatabase()
//    new login().setVisible(true);
}
}