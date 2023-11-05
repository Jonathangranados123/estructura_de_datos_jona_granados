package actividad_12.Math;

public class Fibonacci {
    /**
     * Método para calcular el número de Fibonacci de forma iterativa.
     *
     * @param n El índice del número de Fibonacci.
     * @return El número de Fibonacci correspondiente al índice dado.
     */
    public static int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    /**
     * Método para calcular el número de Fibonacci de forma recursiva.
     *
     * @param n El índice del número de Fibonacci.
     * @return El número de Fibonacci correspondiente al índice dado.
     */
    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }
}
