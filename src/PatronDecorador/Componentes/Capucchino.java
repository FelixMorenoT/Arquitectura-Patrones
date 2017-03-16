/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDecorador.Componentes;

import PatronDecorador.Cafe;

/**
 *
 * @author felixmoreno
 */
public class Capucchino extends Cafe{
    
    public Capucchino(){
        valor=4000;
        ProductoN="Capucchino";
    }
    
    @Override
    public int getValor() {
        return valor;
    }

    @Override
    public String getNombre() {
        return ProductoN;
    }
   
    
}
