/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.behavioral.templatemethod;

/**
 *
 * @author e-magination
 */
public class MainDriver { 
    public static void main( String [] args) {
        Meal meal1 = new HamburgerMeal();
        meal1. doMeal();
        System. out. println();
        Meal meal2 = new CheeseBurgerMeal(); 
        meal2. doMeal();
}
}
