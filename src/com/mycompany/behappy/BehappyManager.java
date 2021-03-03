
package com.mycompany.behappy;

/**
 *
 * @author AKASH BARANWAL
 */
public class BehappyManager {
    StartManager SMgr;
    LoginManager LMgr;
    FindTherapistManager FTMgr;
    ManagerST Mgr;
    ManagerMT MMTMgr;
    RManager RMgr;
    TakeTestManager TTMgr;
    public BehappyManager(){
        SMgr=new StartManager();
        LMgr=new LoginManager();
        FTMgr=new FindTherapistManager();
        Mgr=new ManagerST();
        MMTMgr=new ManagerMT();
        RMgr=new RManager();
        TTMgr=new TakeTestManager();
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
        DM.SG = new MusicGUI(DM);
        DM.S1 = new Story1GUI(DM);
        DM.S2 = new Story2GUI(DM);
        DM.L = new loginUI(DM);
        DM.RM = new Refreshment_Menu(DM);
        DM.TTU=new TakeTestUI(DM);
        DM.showSU();
    }
}
