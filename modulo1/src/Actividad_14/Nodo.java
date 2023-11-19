package Actividad_14;

public class Nodo {
    int key;
    Nodo left, right;

    /**
     * Constructor para crear un nuevo nodo con un valor específico.
     * @param item El valor del nodo.
     */
    public Nodo(int item) {
        key = item;
        left = right = null;
    }
}