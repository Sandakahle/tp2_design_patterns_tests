/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.designpatterns.behavioral.mediator;

/**
 *
 * @author e-magination
 */
class FrenchBuyer extends Buyer { 
    
    public FrenchBuyer( Mediator mediator) 
    { 
        super( mediator , "euro"); 
        this. mediator. registerFrenchBuyer( this);
    }
}