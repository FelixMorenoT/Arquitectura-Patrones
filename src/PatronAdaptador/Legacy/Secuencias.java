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
public class Secuencias {

    public long FormulaHexagonal(long n) {
        long resul = 0;

        resul = ((2 * n) * ((2 * n) - 1)) / 2;

        return resul;
    }

    public long FormulaCatalan(long n) {
        long resul = 0;

        resul = factorial(2 * n) / (factorial(n + 1) * factorial(n));
        return resul;
    }

    private long factorial(long n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public long FormulaFibonacci(long n) {
        long resul = 0;
        
        if (n <= 1) {
            return n;
        } else {
            return FormulaFibonacci(n - 1) + FormulaFibonacci(n - 2);
        }
    }
}
