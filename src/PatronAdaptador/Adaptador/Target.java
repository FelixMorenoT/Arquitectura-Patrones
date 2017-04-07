/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronAdaptador.Adaptador;

/**
 *
 * @author felix
 */
public class Target {

    static Adapter adaptador = new Adapter();

    public void ClienteToAdapter(String secuencia, long n) {
        switch (secuencia) {
            case "Hexagonal":
                adaptador.SecuenciaHexagonal(n);
                break;
            case "Catalan":
                adaptador.SecuenciaCatalan(n);
                break;
            case "Fibo":
                adaptador.SecuenciaFibo(n);
                break;
        }
    }
}
