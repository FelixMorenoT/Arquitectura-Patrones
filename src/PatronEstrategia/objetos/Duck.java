/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronEstrategia.objetos;

import PatronEstrategia.comportamiento.Flyable;
import PatronEstrategia.comportamiento.Quackable;


public abstract class Duck {
    
    protected Flyable flybehavior;
    protected Quackable quackbehavior;
    
    public abstract void fly();
    public abstract void quack();
}
