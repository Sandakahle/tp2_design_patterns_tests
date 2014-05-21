/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.creational.singleton;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author e-magination
 */
public class SingletonTest {
    
    public SingletonTest() {
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
     * Test of getInstance method, of class SingletonExample.
     */
    @Test
    public void testSingleton() {
 
        SingletonExample singletonExample = SingletonExample. getInstance();
         singletonExample. sayHello(); }
        // TODO review the generated test code and remove the default call to fail.
      //  fail("The test case is a prototype.");move the default call to fail.
      
    }

    /**
     * Test of sayHello method, of class SingletonExample.
     */
   
    

