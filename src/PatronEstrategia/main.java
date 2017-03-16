/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronEstrategia;

import PatronEstrategia.objetos.RuberDuck;
import PatronEstrategia.objetos.WoodenDuck;
import PatronEstrategia.objetos.YellowDuck;

/**
 *
 * @author Labing
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        YellowDuck patito = new YellowDuck();
        RuberDuck patitoP = new RuberDuck();
        WoodenDuck patitoM = new WoodenDuck();

        System.out.print("Yellow Duck -> \n");
        patito.fly();
        patito.quack();

        System.out.println("");

        System.out.print("Ruber Duck -> \n");
        patitoP.fly();
        patitoP.quack();

        System.out.println("");
        
        System.out.print("Wooden Duck -> \n");
        patitoM.fly();
        patitoM.quack();
    }

}
