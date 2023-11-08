import java.util.ArrayList;
import java.util.List;

public class OchoReinas {

    static final int N = 8;
    static List<int[]> soluciones = new ArrayList<>();

    static boolean isValidPlace(int tablero[][], int fila, int columna) {
        for (int i = 0; i < columna; i++)
            if (tablero[fila][i] == 1)
                return false;

        for (int i = fila, j = columna; i >= 0 && j >= 0; i--, j--)
            if (tablero[i][j] == 1)
                return false;

        for (int i = fila, j = columna; j >= 0 && i < N; i++, j--)
            if (tablero[i][j] == 1)
                return false;

        return true;
    }

    static void getAllSolutions(int tablero[][], int columna, int[] solucion) {
        if (columna >= N) {
            soluciones.add(solucion.clone());
            return;
        }

        for (int i = 0; i < N; i++) {
            if (isValidPlace(tablero, i, columna)) {
                tablero[i][columna] = 1;
                solucion[columna] = i;
                getAllSolutions(tablero, columna + 1, solucion);
                tablero[i][columna] = 0;
            }
        }
    }

    public static List<int[]> getSolutions() {
        int tablero[][] = new int[N][N];
        int[] solucion = new int[N];
        getAllSolutions(tablero, 0, solucion);
        return soluciones;
    }

    public static void main(String args[]) {
        List<int[]> soluciones = getSolutions();
        for (int i = 0; i < soluciones.size(); i++) {
            System.out.print("Solución #" + (i+1) + ": ");
            for (int j = 0; j < N; j++) {
                System.out.print(soluciones.get(i)[j] + " ");
            }
            System.out.println();
        }
        System.out.println("Número de soluciones: " + soluciones.size());
    }
}

