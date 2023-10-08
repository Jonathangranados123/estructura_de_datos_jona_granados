package utils;

import utils.busqueda.FactoryDeBusqueda;
import utils.busqueda.MetodosDeBusqueda;
import utils.sorting.MetodosDeOrdenamiento;
import utils.sorting.PerfomanceTester;
import utils.sorting.sorters.Sorter;
import utils.sorting.SorterFactory;

public class Main {
    public static void main(String[] args) {
        // Obtener una instancia del algoritmo de ordenación
        //Sorter s = SorterFactory.getSorter(MetodosDeOrdenamiento.BUBBLE);
        //Sorter s = SorterFactory.getSorter(MetodosDeOrdenamiento.INSERTION);
        //Sorter s = SorterFactory.getSorter(MetodosDeOrdenamiento.SHELL);
       // Sorter s = SorterFactory.getSorter(MetodosDeOrdenamiento.SELECTION);
        // Iniciar la prueba de rendimiento utilizando el algoritmo seleccionado



        Sorter s = SorterFactory.getSorter(MetodosDeOrdenamiento.SHELL);

        // Iniciar la prueba de rendimiento utilizando el algoritmo seleccionado
        //  Sorter s = SorterFactory.getSorter(SortingMethods.SHELL);
      // Sorter g = FactoryDeBusqueda.getSearcher(MetodosDeBusqueda.BINARY);
        PerfomanceTester.testPerformance(s);
       // PerfomanceTester.testPerformance(s);
    }

    }

