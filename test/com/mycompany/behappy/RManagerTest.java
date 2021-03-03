/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.behappy;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author soaka
 */
public class RManagerTest {
    
    public RManagerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of init method, of class RManager.
     */
    @Test
    public void testInit() {
        System.out.println("init");
        RManager instance = new RManager();
        instance.init();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfStories method, of class RManager.
     */
    @Test
    public void testGetListOfStories() {
        System.out.println("getListOfStories");
        RManager instance = new RManager();
        ArrayList expResult = null;
        ArrayList result = instance.getListOfStories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfQuotes method, of class RManager.
     */
    @Test
    public void testGetListOfQuotes() {
        System.out.println("getListOfQuotes");
        RManager instance = new RManager();
        ArrayList expResult = null;
        ArrayList result = instance.getListOfQuotes();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListOfSongs method, of class RManager.
     */
    @Test
    public void testGetListOfSongs() {
        System.out.println("getListOfSongs");
        RManager instance = new RManager();
        ArrayList expResult = null;
        ArrayList result = instance.getListOfMusic();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSearchedStory method, of class RManager.
     */
    @Test
    public void testGetSearchedStory() {
        System.out.println("getSearchedStory");
        String title = "";
        RManager instance = new RManager();
        ArrayList expResult = null;
        ArrayList result = instance.getSearchedStory(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSearchedQuote method, of class RManager.
     */
    @Test
    public void testGetSearchedQuote() {
        System.out.println("getSearchedQuote");
        String title = "";
        RManager instance = new RManager();
        ArrayList expResult = null;
        ArrayList result = instance.getSearchedQuote(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSearchedSong method, of class RManager.
     */
    @Test
    public void testGetSearchedSong() {
        System.out.println("getSearchedSong");
        String title = "";
        RManager instance = new RManager();
        ArrayList expResult = null;
        ArrayList result = instance.getSearchedMusic(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedStory method, of class RManager.
     */
    @Test
    public void testGetSelectedStory() {
        System.out.println("getSelectedStory");
        String title = "";
        RManager instance = new RManager();
        MotivationalStory expResult = null;
        MotivationalStory result = instance.getSelectedStory(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedSong method, of class RManager.
     */
    @Test
    public void testGetSelectedSong() {
        System.out.println("getSelectedSong");
        String title = "";
        RManager instance = new RManager();
        SoothingMusic expResult = null;
        SoothingMusic result = instance.getSelectedMusic(title);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of startPlayingSong method, of class RManager.
     */
    @Test
    public void testStartPlayingSong() {
        System.out.println("startPlayingSong");
        String title = "";
        RManager instance = new RManager();
        instance.startPlayingMusic(title);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pauseSong method, of class RManager.
     */
    @Test
    public void testPauseSong() {
        System.out.println("pauseSong");
        RManager instance = new RManager();
        instance.pauseMusic();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resumeSong method, of class RManager.
     */
    @Test
    public void testResumeSong() {
        System.out.println("resumeSong");
        RManager instance = new RManager();
        instance.resumeMusic();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of stopSong method, of class RManager.
     */
    @Test
    public void testStopSong() {
        System.out.println("stopSong");
        RManager instance = new RManager();
        instance.stopMusic();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class RManager.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
//        RManager.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
