/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.behavioral.memento;

/**
 *
 * @author e-magination
 */
public class MainDriver { 
    
    public static void main( String [] args) 
    { // caretaker 
        DietInfoCareTaker dietInfoCareTaker = new DietInfoCareTaker();
    // originator 
        DietInfo dietInfo = new DietInfo("Fred" , 1 , 100) ;
        System. out. println( dietInfo);
        dietInfo. setDayNumberAndWeight(2 , 99) ; System. out. println( dietInfo);
        System. out. println("Saving state. ");
        dietInfoCareTaker.saveState( dietInfo);
        dietInfo. setDayNumberAndWeight(3 , 98) ;
        System. out. println( dietInfo);
        dietInfo. setDayNumberAndWeight(4 , 97) ;
        System. out. println( dietInfo);
        System. out. println(" Restoring saved state. "); 
        dietInfoCareTaker. restoreState( dietInfo);
        System. out. println( dietInfo);
      }
}