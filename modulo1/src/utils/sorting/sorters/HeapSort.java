package utils.sorting.sorters;

public class HeapSort extends Sorter {

    /**
     * Ordena un arreglo de enteros utilizando el algoritmo de ordenación Heap Sort.
     *
     * @param N El arreglo de enteros que se va a ordenar.
     */
    @Override
    public void sort(int[] N) {
        int parent, current, bch;

        for (int i = 1; i < N.length; i++) {

            parent = getParent(i);
            current = i;

            while (current >= 0 && N[current] > N[parent]) {
                swap(N, current, parent);
                current = parent;
                parent = getParent(current);
                COMPARACIONES++;
                MOVIMIENTOS++;
            }
        }

        for (int fp = N.length - 1; fp > 1; fp--) {
            current = 0;
            swap(N, current, fp);
            bch = getBiggestChild(N, current, fp);
            while (bch < fp && N[current] < N[bch]) {
                MOVIMIENTOS++;
                COMPARACIONES++;
                swap(N, current, bch);
                current = bch;
                bch = getBiggestChild(N, current, fp);
            }
        }
    }

    /**
     * Obtiene el índice del padre de un elemento en un montículo.
     *
     * @param i El índice del elemento.
     * @return El índice del padre.
     */
    private int getParent(int i) {
        return (i - 1) / 2;
    }

    /**
     * Obtiene el índice del hijo más grande de un elemento en un montículo.
     *
     * @param N       El arreglo de enteros que representa el montículo.
     * @param current El índice del elemento actual.
     * @param end     El índice final del montículo.
     * @return El índice del hijo más grande.
     */
    private static int getBiggestChild(int[] N, int current, int end) {
        int leftChild = 2 * current + 1;
        int rightChild = 2 * current + 2;

        if (rightChild < end && N[leftChild] < N[rightChild]) {
            return rightChild;
        } else {
            return leftChild;
        }
    }
}