/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronEstrategia.objetos;

import PatronEstrategia.comportamiento.CantFly;
import PatronEstrategia.comportamiento.CantQuack;
import PatronEstrategia.comportamiento.RepublicanQuack;

/**
 *
 * @author Labing
 */
public class WoodenDuck extends Duck{

    @Override
    public void fly() {
        super.flybehavior.fly();
    }

    @Override
    public void quack() {
        super.quackbehavior.quack();
    }
    
    public WoodenDuck(){
        super.flybehavior = new CantFly();
        super.quackbehavior = new CantQuack();
    }
    
}
