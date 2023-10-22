package Actvidad_9.utils.collections;

import Actvidad_9.utils.Arista;
import Actvidad_9.utils.Vertice;
import utils.*;
import java.util.HashMap;
import java.util.ArrayList;
/**
 * Clase que representa un grafo que consiste en vértices y aristas.
 */
public class Grafo {
    private final HashMap<Vertice, ArrayList<Arista>> vertices;

    /**
     * Devuelve una representación en cadena del grafo que muestra sus vértices y aristas.
     *
     * @return Representación en cadena del grafo.
     */
    @Override
    public String toString() {
        return vertices.toString();
    }

    /**
     * Obtiene las aristas adyacentes a un vértice dado.
     *
     * @param vertice El vértice del cual se desean obtener las aristas adyacentes.
     * @return Lista de aristas adyacentes al vértice.
     */
    public ArrayList<Arista> getAdyacencias(Vertice vertice) {
        return vertices.get(vertice);
    }

    /**
     * Obtiene el número de vértices en el grafo.
     *
     * @return Número de vértices en el grafo.
     */
    public int Size() {
        return vertices.size();
    }

    /**
     * Constructor para crear un nuevo grafo vacío.
     */
    public Grafo() {
        this.vertices = new HashMap<>();
    }

    /**
     * Agrega un nuevo vértice al grafo con el nombre especificado.
     *
     * @param name El nombre del nuevo vértice a agregar.
     */
    public void addVertice(String name) {
        vertices.put(new Vertice(name), new ArrayList<Arista>());
    }

    /**
     * Agrega una nueva arista entre dos vértices con los nombres dados y un peso.
     *
     * @param v1     El nombre del primer vértice de la arista.
     * @param v2     El nombre del segundo vértice de la arista.
     * @param weight El peso de la arista.
     */
    public void addArista(String v1, String v2, double weight) {
        vertices.get(new Vertice(v1)).add(new Arista(new Vertice(v1), new Vertice(v2), weight));
    }
}