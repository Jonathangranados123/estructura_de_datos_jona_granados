package Actividad_14;

/**
 * Clase que representa un árbol de búsqueda binaria.
 */
public class ArbolDeBusquedaBinaria {
    Nodo root;

    /**
     * Constructor para crear un árbol vacío.
     */
    public ArbolDeBusquedaBinaria() {
        root = null;
    }

    /**
     * Inserta un nuevo nodo con el valor dado en el árbol.
     * @param key El valor a insertar.
     */
    public void insert(int key) {
        root = insertRec(root, key);
    }

    /**
     * Función auxiliar para insertar un nodo en el árbol.
     * @param root El nodo raíz del subárbol.
     * @param key El valor a insertar.
     * @return El nodo raíz del subárbol actualizado.
     */
    Nodo insertRec(Nodo root, int key) {
        if (root == null) {
            root = new Nodo(key);
            return root;
        }

        if (key < root.key) {
            root.left = insertRec(root.left, key);
        } else if (key > root.key) {
            root.right = insertRec(root.right, key);
        }

        return root;
    }

    /**
     * Busca un valor en el árbol.
     * @param key El valor a buscar.
     * @return true si el valor se encuentra en el árbol, false en caso contrario.
     */
    public boolean search(int key) {
        return searchRec(root, key);
    }

    /**
     * Función auxiliar para buscar un valor en el árbol.
     * @param root El nodo raíz del subárbol.
     * @param key El valor a buscar.
     * @return true si el valor se encuentra en el subárbol, false en caso contrario.
     */
    boolean searchRec(Nodo root, int key) {
        if (root == null || root.key == key) {
            return root != null;
        }

        if (key < root.key) {
            return searchRec(root.left, key);
        } else {
            return searchRec(root.right, key);
        }
    }

    /**
     * Realiza un recorrido en orden del árbol e imprime los valores.
     */
    public void inorder() {
        inorderRec(root);
    }

    /**
     * Función auxiliar para realizar el recorrido en orden.
     * @param root El nodo raíz del subárbol.
     */
    void inorderRec(Nodo root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " ");
            inorderRec(root.right);
        }
    }
}