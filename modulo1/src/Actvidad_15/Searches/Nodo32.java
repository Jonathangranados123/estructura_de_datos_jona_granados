package Actvidad_15.Searches;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un nodo en un árbol B 3-2.
 */
public class Nodo32 {
    public List<Integer> keys;
    public List<Nodo32> children;

    /**
     * Constructor para crear un nuevo nodo.
     */
    public Nodo32() {
        this.keys = new ArrayList<>();
        this.children = new ArrayList<>();
    }
}