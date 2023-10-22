package Actvidad_9.utils;


/**
 * Clase que representa un vértice en un grafo, identificado por un nombre.
 */
public class Vertice {
    private final String name;

    /**
     * Compara este vértice con otro objeto para verificar si son iguales.
     *
     * @param o El objeto con el que se compara este vértice.
     * @return true si son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        return o instanceof Vertice && ((Vertice) o).getName().equals(name);
    }

    /**
     * Genera un valor hash para el vértice basado en su nombre.
     *
     * @return Valor hash del vértice.
     */
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    /**
     * Devuelve una representación en cadena del vértice en el formato "Vertice: nombre".
     *
     * @return Representación en cadena del vértice.
     */
    public String toString() {
        return "Vertice: " + name;
    }

    /**
     * Obtiene el nombre del vértice.
     *
     * @return El nombre del vértice.
     */
    public String getName() {
        return name;
    }

    /**
     * Constructor para crear un nuevo vértice con un nombre dado.
     *
     * @param name El nombre del vértice.
     */
    public Vertice(String name) {
        this.name = name;
    }
}