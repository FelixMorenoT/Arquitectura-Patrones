/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronObservador.Observadores;

import PatronObservador.Sujetos.Sujeto;

/**
 *
 * @author felixmoreno
 */
public interface Observadores {
    public void Notificar(Sujeto sub);
}
