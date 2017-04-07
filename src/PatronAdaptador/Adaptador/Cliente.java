/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronAdaptador.Adaptador;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author felix
 */
public class Cliente {

    static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    static Target target = new Target();

    public static void main(String[] args) throws IOException {
        System.out.println("Menu Principal");

        System.out.println("1.Hexagonal. \n2.Catalan. \n3.Fibonaci");
        String secuencia = lector.readLine();

        switch (secuencia) {
            case "1":
                String nHexagonal = "Hexagonal";
                System.out.println("Menu Hexagonal");

                System.out.println("Ingrese un numero");
                String nSecuHexa = lector.readLine();

                target.ClienteToAdapter(nHexagonal, Long.parseLong(nSecuHexa));

                break;
            case "2":
                String nCatalan = "Catalan";
                System.out.println("Menu Hexagonal");

                System.out.println("Ingrese un numero");
                String nSecuCata = lector.readLine();

                target.ClienteToAdapter(nCatalan, Long.parseLong(nSecuCata));

                break;
            case "3":
                String nFibo = "Fibo";
                System.out.println("Menu Hexagonal");

                System.out.println("Ingrese un numero");
                String nSecuFibo = lector.readLine();

                target.ClienteToAdapter(nFibo, Long.parseLong(nSecuFibo));

                break;
        }
    }
}
