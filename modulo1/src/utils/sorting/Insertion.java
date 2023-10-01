package utils.sorting;
import utils.*;
/**
 * Esta clase implementa el algoritmo de ordenación por inserción para ordenar un arreglo de enteros.
 * Extiende la clase Sorter para aprovechar la implementación de los métodos swap y las variables COMPARACIONES y MOVIMIENTOS.
 */
public class Insertion extends Sorter{
    /**
     * Ordena un arreglo de enteros utilizando el algoritmo de ordenación por inserción.
     *
     * @param N El arreglo de enteros que se va a ordenar.
     */
    @Override
    public void sort(int[] N) {
        for(int i=1; i<N.length; i++){

            int j = i-1;
            int current = N[i];

            while( j>=0 && N[j]>current){
                N[j+1] = N[j--];
                COMPARACIONES++;
                MOVIMIENTOS++;
            }
            N[j+1] = current;
            MOVIMIENTOS++;
        }
    }


}