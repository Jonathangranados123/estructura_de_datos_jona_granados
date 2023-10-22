package Actvidad_9.utils;

import java.lang.Comparable;
/**
 * Clase que representa una arista en un grafo, con un peso y dos vértices conectados.
 */
public class Arista implements Comparable<Arista> {
    private final Vertice v1;
    private final Vertice v2;

    private final double weight;

    /**
     * Devuelve una representación en cadena de la arista en el formato "v1 -> (peso) -> v2".
     *
     * @return Representación en cadena de la arista.
     */
    @Override
    public String toString() {
        return v1.getName() + " -> (" + weight + ") ->" + v2.getName();
    }

    /**
     * Obtiene el primer vértice conectado por la arista.
     *
     * @return El primer vértice de la arista.
     */
    public Vertice getV1() {
        return v1;
    }

    /**
     * Obtiene el segundo vértice conectado por la arista.
     *
     * @return El segundo vértice de la arista.
     */
    public Vertice getV2() {
        return v2;
    }

    /**
     * Obtiene el peso de la arista.
     *
     * @return El peso de la arista.
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Compara esta arista con otra arista en función de su peso.
     *
     * @param a2 La otra arista con la que se compara.
     * @return Valor negativo si esta arista tiene un peso menor, valor positivo si tiene un peso mayor, o 0 si tienen el mismo peso.
     */
    @Override
    public int compareTo(Arista a2) {
        if (weight < a2.getWeight())
            return -1;

        if (weight > a2.getWeight())
            return 1;

        return 0;
    }

    /**
     * Compara esta arista con otro objeto para verificar si son iguales.
     *
     * @param o El objeto con el que se compara esta arista.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof Arista && ((Arista) o).getV1().equals(v2) || ((Arista) o).getV2().equals(v2);
    }

    /**
     * Constructor para crear una nueva arista entre dos vértices con un peso dado.
     *
     * @param v1     El primer vértice conectado por la arista.
     * @param v2     El segundo vértice conectado por la arista.
     * @param weight El peso de la arista.
     */
    public Arista(Vertice v1, Vertice v2, double weight) {
        this.v1 = v1;
        this.v2 = v2;
        this.weight = weight;
    }
}