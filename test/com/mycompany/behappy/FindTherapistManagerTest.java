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
public class FindTherapistManagerTest {
    
    public FindTherapistManagerTest() {
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
     * Test of importDatabase method, of class FindTherapistManager.
     */
    @Test
    public void testImportDatabase() {
        System.out.println("importDatabase");
        ArrayList expResult = null;
        ArrayList result = FindTherapistManager.importDatabase();
        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of recommend method, of class FindTherapistManager.
     */
    @Test
    public void testRecommend() {
        System.out.println("recommend");
        String city = "";
        int budget = 0;
        FindTherapistManager instance = new FindTherapistManager();
        ArrayList<Therapist> expResult = null;
        ArrayList<Therapist> result = instance.recommend(city, budget);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
