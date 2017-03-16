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
public class Panela extends Decorador {

    public Panela(Cafe cafesito) {
        AdiccionN = "Panela";
        AdiccionP = 250;
        coffe = cafesito;
    }

    @Override
    public int getValor() {
        return coffe.getValor() + AdiccionP;
    }

    @Override
    public String getNombre() {
        return "" + coffe.getNombre() + " + " + AdiccionN;
    }
}
