package utils.busqueda;
import utils.sorting.sorters.Sorter;

import java.util.Random;

/**
 * Esta clase implementa el algoritmo de búsqueda binaria en un arreglo de enteros ordenado.
 * Extiende la clase Sorter para aprovechar la implementación de las variables COMPARACIONES.
 */
public class Binaria extends Sorter {

    /**
     * Realiza una búsqueda binaria de un elemento aleatorio en el arreglo dado.
     *
     * @param arr El arreglo de enteros en el que se realizará la búsqueda.
     */
    public void sort(int[] arr) {
        binarySearch(arr, new Random().nextInt(Integer.MAX_VALUE + Short.MIN_VALUE) + Short.MIN_VALUE);
    }

    /**
     * Realiza una búsqueda binaria de un elemento en el arreglo dado.
     *
     * @param arr            El arreglo de enteros ordenado en el que se realizará la búsqueda.
     * @param elementoBuscado El elemento que se está buscando.
     * @return El índice del elemento buscado si se encuentra, de lo contrario, -1.
     */
    public int binarySearch(int[] arr, int elementoBuscado) {
        int inicio = 0;
        int fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = inicio + (fin - inicio) / 2;
            COMPARACIONES++;
            if (arr[medio] == elementoBuscado) {
                return medio;
            }
            COMPARACIONES++;
            if (arr[medio] > elementoBuscado) {
                fin = medio - 1;
            } else {
                inicio = medio + 1;
            }
        }

        return -1;
    }
}