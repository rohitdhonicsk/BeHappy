/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.behappy;

/**
 *
 * @author soaka
 */
public class Admin {
    private String username;
    private String pwd;
    public Admin(){}
    public Admin(String username,String pwd){
        this.username=username;
        this.pwd=pwd;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPwd(){
        return this.pwd;
    }
    
}
