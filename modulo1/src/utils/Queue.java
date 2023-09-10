package utils;
import java.util.Optional;

/**
 * Esta clase representa una cola genérica implementada utilizando una lista enlazada.
 *
 * @param <T> El tipo de elementos que se almacenarán en la cola.
 */
public class Queue<T> {
    private final ListaEnlazada<T> list;

    /**
     * Crea una cola vacía.
     */
    public Queue() {
        list = new ListaEnlazada<>();
    }

    /**
     * Crea una cola inicializada con una lista enlazada existente.
     *
     * @param l La lista enlazada inicial para la cola.
     */
    public Queue(ListaEnlazada<T> l) {
        list = l;
    }

    /**
     * Obtiene el número de elementos en la cola.
     *
     * @return El número de elementos en la cola.
     */
    public int size() {
        return list.size();
    }

    /**
     * Verifica si la cola está vacía.
     *
     * @return `true` si la cola está vacía, `false` si no lo está.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Elimina y devuelve el elemento en la parte frontal de la cola.
     *
     * @return Un objeto Optional que contiene el elemento eliminado, o vacío si la cola está vacía.
     */
    public Optional<T> poll() {
        var e = peek();
        list.removeLast();
        return e;
    }

    /**
     * Obtiene el elemento en la parte frontal de la cola sin eliminarlo.
     *
     * @return Un objeto Optional que contiene el elemento en la parte frontal, o vacío si la cola está vacía.
     */
    public Optional<T> peek() {
        if (isEmpty()) return Optional.empty();
        return list.get(list.size() - 1);
    }

    /**
     * Agrega un elemento al final de la cola.
     *
     * @param element El elemento a agregar a la cola.
     */
    public void offer(T element) {
        list.add(element);
    }

    /**
     * Combina dos colas alternando sus elementos y devuelve una nueva cola resultante.
     *
     * @param s La segunda cola con la que se alternarán los elementos.
     * @return Una nueva cola que contiene elementos alternados de ambas colas.
     */
    public Queue<T> alternate(Queue<T> s) {
        var alt = new Queue<T>();
        while (s.size() + size() != 0) {
            var e = s.size() >= size() ? s.poll() : poll();
            alt.offer(e.get());
        }
        return alt.inverse();
    }

    /**
     * Invierte el orden de los elementos en la cola.
     *
     * @return Una nueva cola con los elementos en orden inverso.
     */
    public Queue<T> inverse() {
        var s = new Queue<T>();
        var t = new Queue<T>(list);
        while (!t.isEmpty()) {
            s.offer(t.poll().get());
        }
        return s;
    }

    /**
     * Devuelve una representación en forma de cadena de la cola.
     *
     * @return Una cadena que representa los elementos de la cola.
     */
    public String toString() {
        return list.toString();
    }
}
