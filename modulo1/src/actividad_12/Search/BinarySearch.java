package actividad_12.Search;

public class BinarySearch {
    /**
     * Método para realizar la búsqueda binaria de forma iterativa.
     *
     * @param arr   El arreglo donde se realizará la búsqueda.
     * @param target El elemento a buscar en el arreglo.
     * @return El índice del elemento si se encuentra, de lo contrario -1.
     */
    public static int busquedaBianriaIterativa(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    /**
     * Método para realizar la búsqueda binaria de forma recursiva.
     *
     * @param arr   El arreglo donde se realizará la búsqueda.
     * @param target El elemento a buscar en el arreglo.
     * @param left  El índice izquierdo del subarreglo.
     * @param right El índice derecho del subarreglo.
     * @return El índice del elemento si se encuentra, de lo contrario -1.
     */
    public static int busquedaBinariaRecursiva(int[] arr, int target, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (arr[mid] < target) {
                return busquedaBinariaRecursiva(arr, target, mid + 1, right);
            } else {
                return busquedaBinariaRecursiva(arr, target, left, mid - 1);
            }
        }
        return -1;
    }
}
