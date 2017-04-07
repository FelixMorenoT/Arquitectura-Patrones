/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronFactory.Productos;

/**
 *
 * @author felixmoreno
 */
public abstract class Consola {
    protected String NombreConsola;
   
    public abstract void TurnOn();
    public abstract void TurnOff();
    public abstract void Play();
    
}
