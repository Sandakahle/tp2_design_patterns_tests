/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.creational.builder;

import com.designpatterns.structural.bridge.BigBus;
import com.designpatterns.structural.bridge.BigEngine;
import com.designpatterns.structural.bridge.SmallCar;
import com.designpatterns.structural.bridge.SmallEngine;
import com.designpatterns.structural.bridge.Vehicle;
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
public class BuilderTest {
    
    public BuilderTest() {
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
     * Test of main method, of class BuilderMain.
     */
    @Test
    public void testBuilder() {
        MealBuilder mealBuilder = new ItalianMealBuilder(); 
        MealDirector mealDirector = new MealDirector( mealBuilder); 
        mealDirector. constructMeal(); Meal meal = mealDirector. getMeal();
        System. out. println("meal is: " + meal);
        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector( mealBuilder); 
        mealDirector. constructMeal(); meal = mealDirector. getMeal(); 
        System. out. println("meal is: " + meal);
    }
    
}
