/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronAdaptador.Adaptador;

import PatronAdaptador.Legacy.Secuencias;

/**
 *
 * @author felix
 */
public class Adapter {

    static Secuencias SecuenciasLegacy = new Secuencias();

    public void SecuenciaHexagonal(long n) {
        System.out.println("Resultado Hexagonal: " + SecuenciasLegacy.FormulaHexagonal(n));
    }

    public void SecuenciaCatalan(long n) {
        System.out.println("Resultado Catalan: " + SecuenciasLegacy.FormulaCatalan(n));
    }

    public void SecuenciaFibo(long n) {
        System.out.println("Resultado Fibonacci: " + SecuenciasLegacy.FormulaFibonacci(n));
    }
}
