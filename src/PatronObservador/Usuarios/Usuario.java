/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronObservador.Usuarios;

import PatronObservador.Observadores.Observadores;
import PatronObservador.Sujetos.Sujeto;

/**
 *
 * @author felixmoreno
 */
public class Usuario implements Observadores{
    
    public String UserName;
    
    public Usuario(String Name){
        UserName= Name;
    }

    @Override
    public void Notificar(Sujeto sub) {
        System.out.println("Nombre Usario: "+this.UserName+" - Subscrito al Canal: "+ sub.getNombreCanal() +" - Notificacion: "+ sub.ObtenerEstado());
    }

    
    
}
