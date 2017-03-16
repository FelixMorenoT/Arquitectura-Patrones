/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDecorador.Adiciones;

import PatronDecorador.Cafe;

/**
 *
 * @author felixmoreno
 */
public abstract class Decorador extends Cafe{
    
    protected String AdiccionN;
    protected int AdiccionP;
    protected Cafe coffe;
    
    public Decorador(){}
}
