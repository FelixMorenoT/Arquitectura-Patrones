/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronObservador.Sujetos;

import PatronObservador.Observadores.Observadores;
import PatronObservador.Usuarios.Usuario;
import java.util.ArrayList;

/**
 *
 * @author felixmoreno
 */
public class Canales implements Sujeto {

    public String NombreCanal;
    public String Estado;

    public Canales(String Nombre) {
        NombreCanal = Nombre;
        Subscriptores = new ArrayList<>();
    }
    public ArrayList<Usuario> Subscriptores;

    @Override
    public void Subscripcion(Usuario obser) {
        this.Subscriptores.add(obser);
    }

    @Override
    public void DSubscripcion(Usuario obser) {
        int posicion=0;
        for (int i = 0; i < Subscriptores.size(); i++) {
           if(Subscriptores.get(i).equals(obser.UserName)){
               posicion=i;
           }
        }
        this.Subscriptores.remove(posicion);
    }

    @Override
    public String ObtenerEstado() {
        return this.Estado;
    }

    @Override
    public void ActualizarEstado(String State) {
        this.Estado = State;

        for (Observadores obs : Subscriptores) {
            obs.Notificar(this);
        }
    }

    public String getNombreCanal() {
        return NombreCanal;
    }

}
