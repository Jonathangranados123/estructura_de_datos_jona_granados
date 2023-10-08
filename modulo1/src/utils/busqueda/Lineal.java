package utils.busqueda;
import java.util.Random;

import utils.sorting.sorters.Sorter;

/**
 * Esta clase implementa el algoritmo de búsqueda lineal en un arreglo de enteros.
 * Extiende la clase Sorter para aprovechar la implementación de las variables COMPARACIONES.
 */
public class Lineal extends Sorter {

    /**
     * Realiza una búsqueda lineal de un elemento aleatorio en el arreglo dado.
     *
     * @param arr El arreglo de enteros en el que se realizará la búsqueda.
     */
    public void sort(int[] arr) {
        linearSearch(arr, new Random().nextInt(Integer.MAX_VALUE + Short.MIN_VALUE) + Short.MIN_VALUE);
    }

    /**
     * Realiza una búsqueda lineal de un elemento en el arreglo dado.
     *
     * @param arreglo        El arreglo de enteros en el que se realizará la búsqueda.
     * @param elementoBuscado El elemento que se está buscando.
     * @return El índice del elemento buscado si se encuentra, de lo contrario, -1.
     */
    public int linearSearch(int[] arreglo, int elementoBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            COMPARACIONES++;
            if (arreglo[i] == elementoBuscado) {
                return i;
            }
        }
        return -1;
    }
}