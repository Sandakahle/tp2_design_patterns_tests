/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.behavioral.interpreter;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author e-magination
 */
public class MainDriver
{
	 public static void main(String[] args) 
         { 
	        String str = "ab"; 
	        Context context = new Context(str); 
 
	        List<Expression> list = new ArrayList<>(); 
	        list.add(new Expression1()); 
	        list.add(new Expression2()); 
 
	        for(Expression ex : list) { 
	            ex.interpret(context); 
 
	        } 
 
	        System.out.println(context.getOutput()); 
	    } 
}