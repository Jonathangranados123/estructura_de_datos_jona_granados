package actividad_12.Math;

public class Factorial {
    /**
     * Método para calcular el factorial de un número de forma iterativa.
     *
     * @param n El número del que se calculará el factorial.
     * @return El factorial del número dado.
     */
    public static long iterativeFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Método para calcular el factorial de un número de forma recursiva.
     *
     * @param n El número del que se calculará el factorial.
     * @return El factorial del número dado.
     */
    public static long recursiveFactorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * recursiveFactorial(n - 1);
    }
}

