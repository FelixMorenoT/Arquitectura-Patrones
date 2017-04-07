/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronPrototipo.MenuPrincipal;

import PatronPrototipo.Prototipos.Imagen;
import PatronPrototipo.PrototypeBuilder;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author felixmoreno
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
        PrototypeBuilder PB = new PrototypeBuilder();

        System.out.println("Menu Principal");
        System.out.println("1.Clonar Imagen. \n2.Clonar Video.");
        String IdClonar = lector.readLine();

        switch (IdClonar) {
            case "1":
                Imagen newImg = new Imagen();
                Imagen cloneImg = new Imagen();

                System.out.println("Menu Clonacion Imagen");

                System.out.println("Nombre Imagen");
                String nImg = lector.readLine();
                newImg.setNombreImg(nImg);

                System.out.println("Tamaño Imagen");
                String tImg = lector.readLine();
                newImg.setTamanoImg(tImg);

                System.out.println("Formato Imagen");
                String fImg = lector.readLine();
                newImg.setFormatoImg(fImg);

                PB.setPrototype(newImg);
                
            case "2":
        }
    }
}
