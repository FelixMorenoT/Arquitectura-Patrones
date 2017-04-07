/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronAdaptador.Legacy;

/**
 *
 * @author felix
 */
public class Pruebas {
    public static void main(String[] args) {
        Secuencias secu = new Secuencias();
        
        System.out.println("Resultado Hexa " + secu.FormulaHexagonal(9));
        System.out.println("Resultado Cata " + secu.FormulaCatalan(9));
        System.out.println("Resultado Fibo " + secu.FormulaFibonacci(9));
    }
}
