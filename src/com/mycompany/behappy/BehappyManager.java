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
public class BehappyManager {
    StartManager SMgr;
    LoginManager LMgr;
    FindTherapistManager FTMgr;
    Manager Mgr;
    ManagerMT MMTMgr;
    RManager RMgr;
    public BehappyManager(){
        SMgr=new StartManager();
        LMgr=new LoginManager();
        FTMgr=new FindTherapistManager();
        Mgr=new Manager();
        MMTMgr=new ManagerMT();
        RMgr=new RManager();
    }
//    public static void main(String[] args) {
//    DisplayManager dm=new DisplayManager();
//            dm.showSU();
//    }
}
