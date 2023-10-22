package Actvidad_9;
import Actvidad_9.utils.collections.Grafo;

import java.util.Optional;


/**
 * Clase principal que contiene el método main para ejecutar la aplicación.
 */
public class Main {
    /**
     * Método principal de la aplicación.
     *
     * @param args Argumentos de línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        final double peso = 0;
        final String CINCO = "5";
        final String CUATRO = "4";
        final String TRES = "3";
        final String OCHO = "8";
        final String QUINCE = "15";
        final String DIEZ = "10";
        final String NUEVE = "9";

        var grafo = new Grafo();
        grafo.addVertice(CINCO);
        grafo.addVertice(CUATRO);
        grafo.addVertice(TRES);
        grafo.addVertice(OCHO);
        grafo.addVertice(QUINCE);
        grafo.addVertice(DIEZ);
        grafo.addVertice(NUEVE);

        grafo.addArista(CINCO, OCHO, 5);
        grafo.addArista(OCHO, CINCO, 5);

        grafo.addArista(CINCO, CUATRO, 3);
        grafo.addArista(CUATRO, CINCO, 3);

        grafo.addArista(CUATRO, OCHO, 1);
        grafo.addArista(OCHO, CUATRO, 1);

        grafo.addArista(CUATRO, TRES, peso);
        grafo.addArista(TRES, CUATRO, peso);

        grafo.addArista(TRES, OCHO, peso);
        grafo.addArista(OCHO, TRES, peso);

        grafo.addArista(TRES, DIEZ, peso);
        grafo.addArista(DIEZ, TRES, peso);

        grafo.addArista(OCHO, QUINCE, peso);
        grafo.addArista(QUINCE, OCHO, peso);

        grafo.addArista(NUEVE, QUINCE, peso);
        grafo.addArista(QUINCE, NUEVE, peso);

        grafo.addArista(NUEVE, DIEZ, peso);
        grafo.addArista(DIEZ, NUEVE, peso);

        var ans = SearchGraph.breadthFirstSearch(grafo, CINCO, "20");
        //  var ans = SearchGraph.deepFirstSearch(grafo, CINCO, DIEZ);
        System.out.println(Optional.ofNullable(ans));

    }
}