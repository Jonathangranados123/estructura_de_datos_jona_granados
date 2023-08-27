package tarea2.autobuses.process;
import tarea2.utils.*;

import java.util.LinkedList;


public class Pasajeros <E>{
    private String name;
    private int number;


    /**
     * Constructor para inicializar un objeto Passenger.
     *
     * @param name   El nombre del pasajero.
     * @param number El número del pasajero.

     */
    public Pasajeros(String name, int number) {
        this.name = name;
        this.number = number;

    }

    /**
     * Obtiene el nombre del pasajero.
     *
     * @return El nombre del pasajero.
     */
    public String getName() {
        return name;
    }

    /**
     * Obtiene el número del pasajero.
     *
     * @return El número del pasajero.
     */
    public int getNumber() {
        return number;
    }

    /**
     * Verifica si el pasajero es VIP.
     *
     * @return true si el pasajero es VIP, false en caso contrario.
     */


    /**
     * Representación en forma de cadena del pasajero.
     *
     * @return Una cadena que representa al pasajero, incluyendo su estado VIP si aplica.
     */
    public String toString() {
        return  "Nombre: " + name + "/ Numero: " + number;
    }
}

    //en  esta clase solo  debo de hacer que funcionen los metodos que se encuentran la clase de lista enlazada
    //pero primero debo de hacer que el usuario pueda tener la opcion de usar los metodos las veces que el quiera





