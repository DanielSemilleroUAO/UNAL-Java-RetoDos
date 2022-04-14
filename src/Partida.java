
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author delga
 */
public class Partida {

    private static List<Vehiculo> vehiculos = new ArrayList<>();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        String line = null;
        String[] comandos = {};
        boolean leer = true;
        while (leer) {
            line = keyboard.nextLine();
            if (line.isEmpty()) {
                leer = false;
            }
            agregarVehiculo(line);
        }
    }

    public static Vehiculo procesarComandos(String[] comandos) {
        if (comandos.length > 1) {

            if (comandos[1].equals("Carreras")) {
                return new Carreras(comandos[4], comandos[3], comandos[6], comandos[2], comandos[5]);

            } else {
                return new Seguridad(comandos[4], comandos[2], comandos[3]);
            }
        }
        if (comandos[0].equals("2")) {
            imprimirGrilla();
        }
        return null;
    }

    public static void imprimirGrilla() {
        System.out.println("***Grilla de Partida***");
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null) {
                //System.out.println(vehiculo.getClass());
                if (vehiculo instanceof Carreras) {
                    Carreras c = (Carreras) vehiculo;
                    System.out.println(c.toString());
                } else {
                    Seguridad s = (Seguridad) vehiculo;
                    System.out.println(s.toString());
                }
            }

        }
        vehiculos.clear();
    }

    public static void agregarVehiculo(String comando) {
        String[] comandos = comando.split("&");
        vehiculos.add(procesarComandos(comandos));
    }

}
