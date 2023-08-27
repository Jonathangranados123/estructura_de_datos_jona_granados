package tarea2.autobuses.ui;
import tarea2.autobuses.process.Pasajeros;
import tarea2.utils.ListaEnlazada;

import java.util.Scanner;

public class CLIAutoBus {

         static Scanner in = new Scanner(System.in);
         static String name;
         static int number;
         static String choice;


         static ListaEnlazada<Pasajeros> listaDePasajeros = new ListaEnlazada<>();


    static Pasajeros readPasajeros() {
        System.out.print("Nombre del Pasajero: ");
        name = in.nextLine();
        System.out.print("Numero de pasajero: ");

        number = in.nextInt();
        System.out.println();
        in.nextLine();

        return new Pasajeros(name, number);
    }
    static void muestraPasajeros() {
        System.out.println("Pasajeros Registrados: ");
        System.out.print(listaDePasajeros);
    }

    /**
     * Agrega un pasajero a la lista.
     */
    static void addPasajeros() {
        listaDePasajeros.add(readPasajeros());
    }

    /**
     * Elimina un pasajero de la lista.
     */
    static void deletePasajero() {
        listaDePasajeros.remove(readPasajeros());
    }

    /**
     * Obtiene y muestra los datos de un pasajero en base a su número de registro.
     */
    static void getPasajeros() {
        System.out.println("Hay " + listaDePasajeros.size() + " pasajeros.");
        System.out.print("Numero de Pasajero: ");
        number = in.nextInt();
        System.out.println("Datos del Pasajero: " + listaDePasajeros
                .get(number));
        in.nextLine();
    }
    public static void pasajerosPractica() {
        boolean exit = true;
        do {
            System.out.println("\n\nElige una opcion");
            System.out.println("Añadir Pasajero: 1");
            System.out.println("Eliminar Pasajero: 2");
            System.out.println("Visualizar Pasajero: 3");
            System.out.println("Visualizar Pasajeros: 4");
            System.out.println("Salir: 5");
            System.out.print("Opcion: ");
            choice = in.nextLine();
            System.out.println();

            switch (choice) {
                case "1":
                    addPasajeros();
                    break;
                case "2":
                    deletePasajero();
                    break;
                case "3":
                    getPasajeros();
                    break;
                case "4":
                    muestraPasajeros();
                    break;
                default:
                    exit = false;
                    break;
            }
        } while (exit);
    }
}









