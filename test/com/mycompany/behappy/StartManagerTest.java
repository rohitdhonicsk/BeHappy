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
public class StartManagerTest {
    
    public StartManagerTest() {
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
     * Test of importDatabase method, of class StartManager.
     */
    @Test
    public void testImportDatabase() {
        System.out.println("importDatabase");
        ArrayList expResult = null;
        ArrayList result = StartManager.importDatabase();
        assert result.size()>0;
        
    }

    /**
     * Test of generateRandomString method, of class StartManager.
     */
    @Test
    public void testGenerateRandomString() {
        System.out.println("generateRandomString");
        StartManager instance = new StartManager();
        String expResult = "";
        String result = instance.generateRandomString();
        assertNotNull(result);
    }

    /**
     * Test of main method, of class StartManager.
     */
 
    
}
