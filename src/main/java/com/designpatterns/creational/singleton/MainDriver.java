/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.creational.singleton;

/**
 *
 * @author Zama
 */

 public class MainDriver { 
     public static void main( String [] args) { 
         SingletonExample singletonExample = SingletonExample. getInstance();
         singletonExample. sayHello(); }
    }

