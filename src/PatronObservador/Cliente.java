/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PatronObservador;

import PatronObservador.Usuarios.Usuario;
import PatronObservador.Sujetos.Canales;
import PatronObservador.Sujetos.Sujeto;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author felixmoreno
 */
public class Cliente {

    public static BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));
    public static ArrayList<Sujeto> Canales = new ArrayList<Sujeto>();
    public static ArrayList<Usuario> UsuariosR = new ArrayList<>();
    public static Canales canalesY;
    public static Usuario usuarioY;
    public static String menu1 = "si";

    public static void main(String[] args) throws IOException {

        while (menu1.equalsIgnoreCase("si") || menu1.equalsIgnoreCase("s")) {
            System.out.println("---Youtube---");

            System.out.println("1.Crear Canal Youtube. \n2.Crear Usuario Youtube. \n3.Subir Video. \n4.Subscribirse. \n5.Desubscribirse. \n6.Listado de Canales.");
            String opcion1 = lector.readLine();
            int op1 = Integer.parseInt(opcion1);

            switch (op1) {
                case 1:
                    System.out.println("---Registro de Canal Youtube---");
                    System.out.println("Nombre del Canal de Youtube.");
                    String nC = lector.readLine();
                    canalesY = new Canales(nC);
                    Canales.add(canalesY);
                    menu1 = "si";
                    break;
                case 2:
                    System.out.println("---Registro de Usuario Youtube---");
                    System.out.println("Nombre de Usuario Youtube.");
                    String nU = lector.readLine();
                    usuarioY = new Usuario(nU);
                    UsuariosR.add(usuarioY);

                    menu1 = "si";
                    break;
                case 3:
                    System.out.println("---Subir Video Youtube---");
                    System.out.println("Listado de Canales");
                    for (int i = 0; i < Canales.size(); i++) {
                        System.out.println("Canal #" + (i + 1) + " " + Canales.get(i).getNombreCanal());
                    }

                    System.out.println("Ingrese el # del Canal");
                    String numeroC = lector.readLine();
                    int nc = Integer.parseInt(numeroC);

                    System.out.println("Mensaje del Video: ");
                    String mensaje = lector.readLine();
                    System.out.println("");
                    Canales.get(nc - 1).ActualizarEstado(mensaje);

                    ArrayList<Usuario> UserSubs = canalesY.Subscriptores;
                    //UserSubs.add(new Usuario("Prueba"));
                    if (!UserSubs.isEmpty()) {
                        System.out.println("-------");
                        System.out.println("Mensaje Enviado");
                        Sujeto p = Canales.get(nc - 1);

                        for (Usuario u : UserSubs) {
                            u.Notificar(p);

                        }
                        System.out.println("");
                        menu1 = "si";
                        break;
                    } else {
                        System.out.println("No tienes Subscriptores");
                        menu1 = "si";
                    }

                    break;
                case 4:
                    System.out.println("---Subscripcion a un Canal Youtube---");

                    System.out.println("Nombre de Usuario");
                    String nombreU = lector.readLine();
                    int pos = 0;
                    for (int i = 0; i < UsuariosR.size(); i++) {
                        if (UsuariosR.get(i).UserName.equalsIgnoreCase(nombreU)) {
                            System.out.println("Bienvenido: " + nombreU);
                            pos = i;

                            System.out.println("-Listado de Canales-");
                            int w = 0;
                            for (w = 0; w < Canales.size(); w++) {
                                System.out.println("Canal #" + (w + 1) + " " + Canales.get(w).getNombreCanal());
                            }
                            System.out.println("-Seleccione un # de Canal-");
                            String numeritoC = lector.readLine();
                            int numeritoc = Integer.parseInt(numeritoC);

                            Canales.get(numeritoc - 1).Subscripcion(UsuariosR.get(pos));
                            menu1 = "si";

                        } else {
                            System.out.println("Usuario no registrado");
                            menu1 = "si";
                        }
                    }

                    menu1 = "si";
                    break;
                case 5:
                    System.out.println("---DeSuscripcion Youtube---");
                    System.out.println("Nombre de Usuario");
                    String nameUsuarioD = lector.readLine();

                    for (int i = 0; i < UsuariosR.size(); i++) {
                        if (UsuariosR.get(i).UserName.equalsIgnoreCase(nameUsuarioD)) {
                            for (int j = 0; j <Canales.size(); j++) {
                                System.out.println("---Canales----");
                                System.out.println("Canal #"+j+1+": " + Canales.get(j).getNombreCanal());
                            }

                        }

                    }
                    menu1 = "si";
                    break;
                case 6:
                    System.out.println("---Canales Youtube---");
                    for (int i = 0; i < Canales.size(); i++) {
                        System.out.println("Canal #" + (i + 1) + " " + Canales.get(i).getNombreCanal());
                    }
                    System.out.println("");
                    break;
            }
        }
    }
}
