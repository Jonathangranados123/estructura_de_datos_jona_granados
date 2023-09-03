package utils;


import java.util.Optional;

public class ListaEnlazada<E> implements Lista<E> {
    private Optional<Node<E>> head;
    private int length;

    public ListaEnlazada() {
        this.head = Optional.empty();
        this.length = 0;
    }

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if (head.isPresent()) {
            Node<E> current = head.get();
            while (current.getNext().isPresent()) {
                current = current.getNext().get();
            }
            current.setNext(newNode);
        } else {
            head = Optional.of(newNode);
        }
        length++;
    }
    public void addFirst(E e){
        Node nuevoNodo = new Node(e);
        nuevoNodo.setNext(this.head);
        this.head = Optional.of(nuevoNodo);


    }

    @Override
    public void remove(E e) {
        Optional<Node<E>> prev = Optional.empty();
        Optional<Node<E>> current = head;

        while (current.isPresent()) {
            if (current.get().getData().equals(e)) {
                if (prev.isPresent()) {
                    prev.get().setNext(current.get().getNext().orElse(null));
                } else {
                    head = current.get().getNext();
                }
                length--;
                return;
            }
            prev = current;
            current = current.get().getNext();
        }
    }
    public void removeLast() {
        if (head.isPresent()) {
            if (head.get().getNext().isPresent()) {
                Node<E> current = head.get();
                while (current.getNext().get().getNext().isPresent()) {
                    current = current.getNext().get();
                }
                current.setNext(Optional.empty());
            } else {
                head = Optional.empty();
            }
            length--;
        } else {
            throw new IllegalStateException("La lista está vacía. No se puede eliminar el último elemento.");
        }
    }


    @Override
    public Optional<E> get(int index) {
        if (index >= length || index < 0) {
            return Optional.empty();
        }

        int pos = 0;
        Node<E> current = head.orElse(null);
        while (current != null) {
            if (pos == index) {
                return Optional.of(current.getData());
            }
            current = current.getNext().orElse(null);
            pos++;
        }
        return Optional.empty();
    }

    @Override
    public void update(E oldValue, E newValue) {
        Node<E> current = head.orElse(null);

        while (current != null) {
            if (current.getData().equals(oldValue)) {
                current.data = newValue;
                return;
            }
            current = current.getNext().orElse(null);
        }
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean contains(E t) {
        Node<E> current = head.orElse(null);

        while (current != null) {
            if (current.getData().equals(t)) {
                return true;
            }
            current = current.getNext(). orElse(null);
        }
        return false;
    }

    // Resto de los métodos de CustomLinkedList


    // Clase interna Node y otros métodos




}

