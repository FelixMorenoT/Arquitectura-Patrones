/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronObservador.Sujetos;

import PatronObservador.Observadores.Observadores;
import PatronObservador.Usuarios.Usuario;

/**
 *
 * @author felixmoreno
 */
public interface Sujeto {
    
    public void Subscripcion (Usuario obser);
    public void DSubscripcion (Usuario obser);
    
    public String ObtenerEstado();
    public void ActualizarEstado(String State);
    public String getNombreCanal();
    
    
}
