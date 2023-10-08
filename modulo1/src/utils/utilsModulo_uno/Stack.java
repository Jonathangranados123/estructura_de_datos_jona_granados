package utils.utilsModulo_uno;

import java.util.Optional;

/**
 * La clase Stack<T> representa una pila genérica basada en una lista enlazada.
 *
 * @param <T> El tipo de datos de los elementos en la pila.
 */
public class Stack<T> {
    private final ListaEnlazada<T> list;

    /**
     * Constructor predeterminado que crea una pila vacía.
     */
    public Stack() {
        list = new ListaEnlazada<>();
    }

    /**
     * Constructor que crea una pila basada en una lista enlazada existente.
     *
     * @param l La lista enlazada que se utilizará como base para la pila.
     */
    Stack(ListaEnlazada<T> l) {
        list = l;
    }

    /**
     * Devuelve el tamaño actual de la pila.
     *
     * @return El tamaño actual de la pila.
     */
    public int size() {
        return list.size();
    }

    /**
     * Verifica si la pila está vacía.
     *
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Elimina y devuelve el elemento en la parte superior de la pila.
     *
     * @return El elemento en la parte superior de la pila (si existe).
     */
    public Optional<T> pop() {
        var e = peek();
        list.removeLast();
        return e;
    }

    /**
     * Devuelve el elemento en la parte superior de la pila sin eliminarlo.
     *
     * @return El elemento en la parte superior de la pila (si existe).
     */
    public Optional<T> peek() {
        if (isEmpty()) return Optional.empty();
        return list.get(list.size() - 1);
    }

    /**
     * Agrega un elemento a la parte superior de la pila.
     *
     * @param element El elemento a agregar a la pila.
     */
    public void push(T element) {
        list.add(element);
    }

    /**
     * Combina dos pilas alternando sus elementos.
     *
     * @param s La segunda pila con la que se alternarán los elementos.
     * @return Una nueva pila que contiene los elementos alternados.
     */
    public Stack<T> alternate(Stack<T> s) {
        var alt = new Stack<T>();
        while (s.size() + size() != 0) {
            var e = s.size() >= size() ? s.pop() : pop();
            alt.push(e.get());
        }
        return alt.inverse();
    }

    /**
     * Invierte la pila actual.
     *
     * @return Una nueva pila que contiene los elementos en orden inverso.
     */
    public Stack<T> inverse() {
        var s = new Stack<T>();
        var t = new Stack<T>(list);
        while (!t.isEmpty()) {
            s.push(t.pop().get());
        }
        return s;
    }

    /**
     * Devuelve una representación en cadena de la pila.
     *
     * @return Una cadena que representa la pila.
     */
    public String toString() {
        return list.toString();
    }
}