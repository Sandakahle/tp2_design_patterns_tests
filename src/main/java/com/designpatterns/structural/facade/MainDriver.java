/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.structural.facade;

/**
 *
 * @author e-magination
 */
public class MainDriver { 
    public static void main( String [] args) 
    {
        Facade facade = new Facade(); 
        int x = 3;
        System. out. println("Cube of " + x + " : " + facade. cubeX(3));
        System. out. println("Cube of " + x + " times 2:" + facade. cubeXTimes2(3));
        System. out. println( x + " to sixth power times 2:" + facade. xToSixthPowerTimes2(3));
    }
}