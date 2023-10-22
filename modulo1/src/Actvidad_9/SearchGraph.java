package Actvidad_9;

import Actvidad_9.utils.Arista;
import Actvidad_9.utils.Vertice;
import Actvidad_9.utils.collections.Grafo;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Clase que contiene métodos para realizar búsquedas en un grafo utilizando BFS y DFS.
 */
public class SearchGraph {

    /**
     * Realiza una búsqueda en el grafo utilizando el algoritmo Breadth-First Search (BFS).
     *
     * @param grafo    El grafo en el que se realizará la búsqueda.
     * @param inicio   El vértice de inicio de la búsqueda.
     * @param objetivo El vértice objetivo que se desea encontrar.
     * @return El vértice objetivo si se encuentra, o null si no se encuentra.
     */
    public static Vertice breadthFirstSearch(Grafo grafo, String inicio, String objetivo) {
        /**
         * Inicializa el vértice objetivo.
         */
        var target = new Vertice(objetivo);

        /**
         * Comprueba si el vértice de inicio es igual al vértice objetivo.
         */
        if (target.equals(new Vertice(inicio))) return target;

        /**
         * Inicializa las listas de aristas visitadas y la cola.
         */
        LinkedList<Arista> visited = new LinkedList<Arista>();
        LinkedList<Arista> queue = new LinkedList<Arista>();

        /**
         * Agrega las adyacencias del vértice de inicio a la cola.
         */
        queue.addAll(grafo.getAdyacencias(new Vertice(inicio)));

        /**
         * Realiza la búsqueda mientras la cola no esté vacía.
         */
        while (!queue.isEmpty()) {

            /**
             * Obtiene y remueve la primera arista de la cola.
             */
            var currentEdge = queue.poll();

            /**
             * Comprueba si el vértice de destino de la arista actual es el objetivo.
             */
            if (currentEdge.getV2().equals(target)) {
                return currentEdge.getV2();
            } else {
                /**
                 * Agrega la arista a la lista de visitadas y agrega las nuevas adyacencias a la cola.
                 */
                visited.add(currentEdge);
                queue.addAll(grafo.getAdyacencias(currentEdge.getV2()));

                /**
                 * Remueve las aristas visitadas de la cola.
                 */
                queue.removeAll(visited);
            }
        }

        return null;
    }

    /**
     * Realiza una búsqueda en el grafo utilizando el algoritmo Depth-First Search (DFS).
     *
     * @param grafo    El grafo en el que se realizará la búsqueda.
     * @param inicio   El vértice de inicio de la búsqueda.
     * @param objetivo El vértice objetivo que se desea encontrar.
     * @return El vértice objetivo si se encuentra, o null si no se encuentra.
     */
    public static Vertice deepFirstSearch(Grafo grafo, String inicio, String objetivo) {

        /**
         * Inicializa el vértice objetivo.
         */
        var target = new Vertice(objetivo);

        /**
         * Comprueba si el vértice de inicio es igual al vértice objetivo.
         */
        if (target.equals(new Vertice(inicio))) return target;

        /**
         * Inicializa las pilas de aristas visitadas y de la búsqueda en profundidad.
         */
        var stack = new Stack<Arista>();
        var visited = new Stack<Arista>();

        /**
         * Agrega las adyacencias del vértice de inicio a la pila de búsqueda en profundidad.
         */
        stack.addAll(grafo.getAdyacencias(new Vertice(inicio)));

        /**
         * Realiza la búsqueda mientras la pila no esté vacía.
         */
        while (!stack.isEmpty()) {

            /**
             * Obtiene y remueve la arista actual de la pila.
             */
            var current = stack.pop();

            /**
             * Comprueba si el vértice de destino de la arista actual es el objetivo.
             */
            if (current.getV2().equals(target)) {
                return current.getV2();
            }

            /**
             * Agrega la arista a la pila de visitadas y agrega las nuevas adyacencias a la pila de búsqueda en profundidad.
             */
            visited.push(current);
            stack.addAll(grafo.getAdyacencias(current.getV2()));

            /**
             * Remueve las aristas visitadas de la pila de búsqueda en profundidad.
             */
            stack.removeAll(visited);
        }

        return null;
    }
}
