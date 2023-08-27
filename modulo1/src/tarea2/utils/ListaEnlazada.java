package tarea2.utils;

/*import java.util.Optional;


/*public class ListaEnlazada <E> implements Lista<E>{
    private Node primerNodo;
    public ListaEnlazada(){
        this.primerNodo=null;
    }

    @Override
    public void add(E elemento) {
        Node nuevoNodo = new Node(elemento);
        nuevoNodo.setNext(primerNodo);
        this.primerNodo=nuevoNodo;

    }*/
/*import java.util.Optional;



public class ListaEnlazada<E> implements Lista<E> {
    private Node primerNodo;
    private Node ultimoNodo;

    public ListaEnlazada() {
        this.primerNodo = null;
        this.ultimoNodo = null;
    }

    @Override
    public void add(E elemento) {
        Optional<Node> optionalNuevoNodo = Optional.ofNullable(elemento).map(Node::new);

        if (!optionalNuevoNodo.isEmpty()) {
            Node nuevoNodo = optionalNuevoNodo.get();
            if (primerNodo == null) {
                primerNodo = nuevoNodo;
                ultimoNodo = nuevoNodo;
            } else {
                ultimoNodo.setNext(nuevoNodo);
                ultimoNodo = nuevoNodo;
            }
        }
    }








    public static void main(String[] args) {
        ListaEnlazada <Integer> lista1 = new ListaEnlazada<>();
     lista1.add(456);
     lista1.add(115662);
     lista1.add(454);
     lista1.add(1206);

        lista1.printContent();


    }
    public void printContent(){
        Node currentNode = primerNodo;
        while (currentNode!=null){
            currentNode.show();
            currentNode=currentNode.next();
        }

    }
    public void remove(E element) {
        Node nodoActual = primerNodo;
        Node nodoAnterior = null;

        while (nodoActual != null) {
            if (nodoActual.getElement().equals(element)) {
                if (nodoAnterior == null) {
                    primerNodo = nodoActual.getNext();
                    if (primerNodo == null) {
                        ultimoNodo = null;
                    }
                } else {
                    nodoAnterior.setNext(nodoActual.getNext());
                    if (nodoActual.getNext() == null) {
                        ultimoNodo = nodoAnterior;
                    }
                }
                return;
            }

            nodoAnterior = nodoActual;
            nodoActual = nodoActual.getNext();
        }
    }

   /* @Override
    public void remove(E e) {
        Node currentNode = primerNodo;

        while (currentNode!=null){
            currentNode.show();
            currentNode=currentNode.next();
        }


    }*/

   /* @Override
    public Optional<E> get(int index) {
        if (index > length - 1 || index < 0) {
            System.out.println("Position Unavailable in LinkedList");
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds!");
        }

        int pos = 0;
        for (var temp = primerNodo; temp.isPresent(); temp = temp.get().next) {
            if (pos == index) return Optional.of(temp.get().data);
            pos++;
        }
        return null;
    }


    @Override
    public void update(E oldValue, E newValue) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean contains(E t) {
        return false;
    }


}
*/
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
            current = current.getNext().orElse(null);
        }
        return false;
    }

    // Resto de los métodos de CustomLinkedList


    // Clase interna Node y otros métodos



}

