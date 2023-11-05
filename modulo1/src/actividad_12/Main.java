package actividad_12;
import actividad_12.Math.Factorial;
import actividad_12.Math.Fibonacci;
import actividad_12.Search.BinarySearch;
import utils.sorting.*;
import utils.sorting.sorters.Sorter;
import utils.sorting.PerfomanceTester;

public class Main {

        /**
         * Método principal que inicia la prueba de rendimiento.
         *
         * @param args Los argumentos de línea de comandos (no se utilizan en este caso).
         */

        public static void main(String[] args) {


            // Prueba de la serie Fibonacci
            System.out.println("Serie de Fibonacci (iterativo):");
            for (int i = 0; i < 10; i++) {
                System.out.print(Fibonacci.iterativeFibonacci(i) + " ");
            }
            System.out.println();

            System.out.println("Serie de Fibonacci (recursivo):");
            for (int i = 0; i < 10; i++) {
                System.out.print(Fibonacci.recursiveFibonacci(i) + " ");
            }
            System.out.println();

            // Prueba del cálculo factorial
            int num = 5;
            System.out.println("Factorial de " + num + " (iterativo): " + Factorial.iterativeFactorial(num));
            System.out.println("Factorial de " + num + " (recursivo): " + Factorial.recursiveFactorial(num));

            // Prueba de búsqueda binaria
            int[] sortedArray = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
            int target = 11;
            int indexIterative = BinarySearch.busquedaBianriaIterativa(sortedArray, target);
            int indexRecursive = BinarySearch.busquedaBinariaRecursiva(sortedArray, target, 0, sortedArray.length - 1);

            System.out.println("Búsqueda binaria (iterativo) - Elemento " + target + " encontrado en el índice: " + indexIterative);
            System.out.println("Búsqueda binaria (recursivo) - Elemento " + target + " encontrado en el índice: " + indexRecursive);
        }
    }

