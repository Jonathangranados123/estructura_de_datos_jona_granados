package Actividad_13;
import java.util.Arrays;

public class MedianDivideAndConquer {

    public static void main(String[] args) {
        // Ejemplo de uso
        int[] array = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5};
        double median = findMedian(array);
        System.out.println("Mediana: " + median);
    }

    // Función principal que encuentra la mediana de un arreglo
    public static double findMedian(int[] array) {
        int n = array.length;
        if (n % 2 == 0) {
            int middle1 = n / 2 - 1;
            int middle2 = n / 2;
            return (findKthSmallest(array, 0, n - 1, middle1) + findKthSmallest(array, 0, n - 1, middle2)) / 2.0;
        } else {
            int middle = n / 2;
            return findKthSmallest(array, 0, n - 1, middle);
        }
    }

    // Función auxiliar recursiva para encontrar el k-ésimo elemento más pequeño en el arreglo
    private static int findKthSmallest(int[] array, int start, int end, int k) {
        if (start == end) {
            return array[start];
        }

        int pivotIndex = partition(array, start, end);
        if (k == pivotIndex) {
            return array[k];
        } else if (k < pivotIndex) {
            return findKthSmallest(array, start, pivotIndex - 1, k);
        } else {
            return findKthSmallest(array, pivotIndex + 1, end, k);
        }
    }

    // Función auxiliar para realizar la partición del arreglo en torno a un pivote
    private static int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int i = start - 1;

        for (int j = start; j < end; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }

        swap(array, i + 1, end);
        return i + 1;
    }

    // Función auxiliar para intercambiar dos elementos en el arreglo
    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


