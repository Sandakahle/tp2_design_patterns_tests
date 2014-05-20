/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.behavioral.interpreter;

/**
 *
 * @author e-magination
 */
class Expression2 extends Expression { 
    
    public void interpret(Context context) { 
        System.out.println("b expression"); 
        String input = context.getInput(); 
 
        context.setInput(input.substring(1)); 
        context.setOutput(context.getOutput()+ "2"); 
    } 
}