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
public class Expresso extends Cafe {

    public Expresso() {
        valor = 2000;
        ProductoN = "Expresso";
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
