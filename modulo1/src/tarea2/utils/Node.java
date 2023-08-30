package tarea2.utils;
import java.util.Optional;



/**
 * Clase que define un nodo utilizado en estructuras de datos enlazadas.
 *
 * @param <U> El tipo de dato contenido en el nodo.
 */

public class Node<U> {
    protected U data;
    private Optional<Node<U>> next;

    public Node(U data) {
        this.data = data;
        this.next = Optional.empty();
    }

    public U getData() {
        return data;
    }


    public Optional<Node<U>>  getNext() {
        return next;
    }

    public void setNext(Node<U> next) {
        this.next = Optional.ofNullable(next);
    }
}



