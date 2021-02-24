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
    public static void main(String[] args) {
        DisplayManager DM = new DisplayManager();
        DM.BHM=new BehappyManager();
        DM.SU = new StartUI(DM);
        DM.FTR = new FindTherapistsResultUI(DM);
        DM.MMU = new MainMenuUI(DM);
        DM.MTMU = new ManageTherapistMainUI(DM);
        DM.MTAU = new ManageTherapistAddUI(DM);
        DM.MTDSU = new ManageTherapistDSUUI(DM);
        DM.PU = new PreferencesUI(DM);
        DM.QG = new QuoteGUI(DM);
        DM.ST = new SearchTherapistUI(DM);
        DM.SG = new SongGUI(DM);
        DM.S1 = new Story1GUI(DM);
        DM.S2 = new Story2GUI(DM);
        DM.L = new login(DM);
        DM.RM = new Refreshment_Menu(DM);
        DM.TTU=new TakeTestUI(DM);
        DM.showSU();
    }
}
