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
public class Americano extends Cafe {

    public Americano() {
        valor = 1500;
        ProductoN = "Americano";
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
