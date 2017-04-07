/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronFactory.Productos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author felixmoreno
 */
public class PlayStation extends Consola{

    public PlayStation(){
        super.NombreConsola="PlayStation 4";
    }
    
    @Override
    public void TurnOn() {
        System.out.println("Prendiendo....." + super.NombreConsola);
        try {
            Thread.sleep(3000);
            System.out.println("Bienvenido");
        } catch (InterruptedException ex) {
            Logger.getLogger(PlayStation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void TurnOff() {
        System.out.println(super.NombreConsola+" Se esta apagando");
    }

    @Override
    public void Play() {
        System.out.println("Ud empezo a jugar en "+super.NombreConsola);
    }
    
}
