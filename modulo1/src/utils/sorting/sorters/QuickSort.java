package utils.sorting.sorters;
public class QuickSort extends Sorter {

    /**
     * Ordena un arreglo de enteros utilizando el algoritmo de ordenación Quick Sort.
     *
     * @param N El arreglo de enteros que se va a ordenar.
     */
    public void sort(int[] N) {
        quickSort(N, 0, N.length - 1);
    }

    /**
     * Implementa el algoritmo Quick Sort para ordenar un rango específico de un arreglo de enteros.
     *
     * @param N     El arreglo de enteros en el que se realizará la ordenación.
     * @param left  El índice izquierdo del rango a ordenar.
     * @param right El índice derecho del rango a ordenar.
     */
    private void quickSort(int[] N, int left, int right) {
        int partition;

        if ((right - left) > 0) {
            partition = getPartition(N, left, right);
            quickSort(N, left, partition - 1);
            quickSort(N, partition + 1, right);
        }
    }

    /**
     * Encuentra el índice de partición para el algoritmo Quick Sort.
     *
     * @param N     El arreglo de enteros en el que se buscará el índice de partición.
     * @param left  El índice izquierdo del rango a considerar.
     * @param right El índice derecho del rango a considerar.
     * @return El índice de partición.
     */
    int getPartition(int N[], int left, int right) {
        int pivot = right;
        int firstHigh = left;
        for (int c = left; c < right; c++) {
            COMPARACIONES++;
            if (N[c] < N[pivot]) {
                swap(N, c, firstHigh);
                firstHigh++;
                MOVIMIENTOS++;
            }
        }
        swap(N, pivot, firstHigh);
        MOVIMIENTOS++;
        return firstHigh;
    }
}