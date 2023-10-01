package utils.sorting;

public class Main {
    public static void main(String[] args) {
        // Obtener una instancia del algoritmo de ordenación
        //Sorter s = SorterFactory.getSorter(MetodosDeOrdenamiento.BUBBLE);
        //Sorter s = SorterFactory.getSorter(MetodosDeOrdenamiento.INSERTION);
        Sorter s = SorterFactory.getSorter(MetodosDeOrdenamiento.SHELL);
       // Sorter s = SorterFactory.getSorter(MetodosDeOrdenamiento.SELECTION);


        // Iniciar la prueba de rendimiento utilizando el algoritmo seleccionado
        PerfomanceTester.testPerformance(s);
    }

    }

