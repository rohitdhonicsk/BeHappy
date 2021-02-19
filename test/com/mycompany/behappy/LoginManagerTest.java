/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.behappy;

import java.util.HashMap;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.Test;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author soaka
 */
public class LoginManagerTest {
    
    public LoginManagerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of importDatabase method, of class LoginManager.
     */
    @Test
    public void testImportDatabase() {
//        System.out.println("importDatabase");
        LoginManager instance = new LoginManager();
        HashMap expResult = null;
        HashMap result = instance.importDatabase();
        assertNotNull(result);
    }
    /**
     * Test of verifyPassword method, of class LoginManager.
     */
    @Test
    public void testVerifyPassword() {
//        System.out.println("verifyPassword");
        Admin a = new Admin("akash", "1111");
        LoginManager instance = new LoginManager();
        boolean expResult = true;
        boolean result = instance.verifyPassword(a);
        assertTrue(result);
        a=new Admin("aaa","1111");
        expResult = false;
        result = instance.verifyPassword(a);
        assertFalse(result);
        a=new Admin("akash","111");
        expResult = false;
        result = instance.verifyPassword(a);
       assertFalse(result);
    }

    /**
     * Test of verifyUsername method, of class LoginManager.
     */
    @Test
    public void testVerifyUsername() {
//        System.out.println("verifyUsername");     
        Admin a = new Admin("akash", "1111");
        LoginManager instance = new LoginManager();
        boolean expResult = true;
        boolean result = instance.verifyUsername(a);
        assertTrue(result);
        a=new Admin("aaa","1111");
        expResult = false;
        result = instance.verifyUsername(a);
        assertFalse(result);
    }


}
