/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronEstrategia.objetos;

import PatronEstrategia.comportamiento.CanFly;
import PatronEstrategia.comportamiento.DemocratQuack;
import PatronEstrategia.comportamiento.RepublicanQuack;

/**
 *
 * @author Labing
 */
public class YellowDuck extends Duck {

    @Override
    public void fly() {
        super.flybehavior.fly();
    }

    @Override
    public void quack() {
        super.quackbehavior.quack();
    }

    public YellowDuck() {
        super.flybehavior = new CanFly();
        super.quackbehavior = new DemocratQuack();
    }

}
