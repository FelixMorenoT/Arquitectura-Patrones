/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronDecorador;

import PatronDecorador.Adiciones.Chantilly;
import PatronDecorador.Adiciones.Panela;
import PatronDecorador.Adiciones.Ron;
import PatronDecorador.Componentes.Americano;
import PatronDecorador.Componentes.Capucchino;
import PatronDecorador.Componentes.Expresso;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 *
 * @author felixmoreno
 */
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Bienvenido a StarDust Cafe");
        System.out.println("1.Capucchino. \n2.Expresso. \n3.Americano.");
        String dato = lector.readLine();

        int opcion = Integer.parseInt(dato);

        switch (opcion) {
            case 1:
                System.out.println("Menu Cafe Capucchino");
                Cafe capu = new Capucchino();
                System.out.println("Cafe: " + capu.getNombre() + " ->Precio: " + capu.getValor() + " COP");

                System.out.println("Desea agregar una Adicion.?");
                String DatoA = lector.readLine();

                String plusA = "si";

                while (plusA.equalsIgnoreCase("si")) {
                    if (DatoA.equalsIgnoreCase("si")) {
                        System.out.println("Menu Adiciones");
                        System.out.println("1.Adicion Ron. \n2.Adicion Panela. \n3.Adicion Chantilly");
                        String DatoAdicion = lector.readLine();
                        int DA = Integer.parseInt(DatoAdicion);

                        switch (DA) {
                            case 1:
                                capu = new Ron(capu);
                                System.out.println("Cafe: " + capu.getNombre() + " ->Precio: " + capu.getValor() + " COP");
                                System.out.println("Desea Agregar otra adicion.?");
                                plusA = lector.readLine();
                                break;
                            case 2:
                                capu = new Panela(capu);
                                System.out.println("Cafe: " + capu.getNombre() + " ->Precio: " + capu.getValor() + " COP");
                                System.out.println("Desea Agregar otra adicion.?");
                                plusA = lector.readLine();
                                break;
                            case 3:
                                capu = new Chantilly(capu);
                                System.out.println("Cafe: " + capu.getNombre() + " ->Precio: " + capu.getValor() + " COP");
                                System.out.println("Desea Agregar otra adicion.?");
                                plusA = lector.readLine();
                                break;
                        }
                    }
                }
                break;

            case 2:
                System.out.println("Menu Cafe Expresso");
                Cafe expresso = new Expresso();
                System.out.println("Cafe: " + expresso.getNombre() + " ->Precio: " + expresso.getValor() + " COP");

                System.out.println("Desea agregar una Adicion.?");
                String DatoA2 = lector.readLine();

                String plusA2 = "si";

                while (plusA2.equalsIgnoreCase("si")) {
                    if (DatoA2.equalsIgnoreCase("si")) {
                        System.out.println("Menu Adiciones");
                        System.out.println("1.Adicion Ron. \n2.Adicion Panela. \n3.Adicion Chantilly");
                        String DatoAdicion = lector.readLine();
                        int DA2 = Integer.parseInt(DatoAdicion);

                        switch (DA2) {
                            case 1:
                                expresso = new Ron(expresso);
                                System.out.println("Cafe: " + expresso.getNombre() + " ->Precio: " + expresso.getValor() + " COP");
                                System.out.println("Desea Agregar otra adicion.?");
                                plusA2 = lector.readLine();
                                break;
                            case 2:
                                expresso = new Panela(expresso);
                                System.out.println("Cafe: " + expresso.getNombre() + " ->Precio: " + expresso.getValor() + " COP");
                                System.out.println("Desea Agregar otra adicion.?");
                                plusA2 = lector.readLine();
                                break;
                            case 3:
                                expresso = new Chantilly(expresso);
                                System.out.println("Cafe: " + expresso.getNombre() + " ->Precio: " + expresso.getValor() + " COP");
                                System.out.println("Desea Agregar otra adicion.?");
                                plusA2 = lector.readLine();
                                break;
                        }
                    }
                }

                break;

            case 3:
                System.out.println("Menu Cafe Americano");
                Cafe americano = new Americano();
                System.out.println("Cafe: " + americano.getNombre() + " ->Precio: " + americano.getValor() + " COP");

                System.out.println("Desea agregar una Adicion.?");
                String DatoA3 = lector.readLine();

                String plusA3 = "si";

                while (plusA3.equalsIgnoreCase("si")) {
                    if (DatoA3.equalsIgnoreCase("si")) {
                        System.out.println("Menu Adiciones");
                        System.out.println("1.Adicion Ron. \n2.Adicion Panela. \n3.Adicion Chantilly");
                        String DatoAdicion = lector.readLine();
                        int DA3 = Integer.parseInt(DatoAdicion);

                        switch (DA3) {
                            case 1:
                                americano = new Ron(americano);
                                System.out.println("Cafe: " + americano.getNombre() + " ->Precio: " + americano.getValor() + " COP");
                                System.out.println("Desea Agregar otra adicion.?");
                                plusA3= lector.readLine();
                                break;
                            case 2:
                                americano = new Panela(americano);
                                System.out.println("Cafe: " + americano.getNombre() + " ->Precio: " + americano.getValor() + " COP");
                                System.out.println("Desea Agregar otra adicion.?");
                                plusA3 = lector.readLine();
                                break;
                            case 3:
                                americano = new Chantilly(americano);
                                System.out.println("Cafe: " + americano.getNombre() + " ->Precio: " + americano.getValor() + " COP");
                                System.out.println("Desea Agregar otra adicion.?");
                                plusA3 = lector.readLine();
                                break;
                        }
                    }
                }

                break;
        }
    }
}
