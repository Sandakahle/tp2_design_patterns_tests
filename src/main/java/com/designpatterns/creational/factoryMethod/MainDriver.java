/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.creational.factoryMethod;

/**
 *
 * @author Zama
 */
public class MainDriver { 
    public static void main( String [] args)
    { 
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("feline"); 
        System. out. println("a1 sound: "+ a1. makeSound());
        Animal a2 = animalFactory.getAnimal("canine"); 
        System. out. println("a2 sound: "+ a2. makeSound());
    }
}