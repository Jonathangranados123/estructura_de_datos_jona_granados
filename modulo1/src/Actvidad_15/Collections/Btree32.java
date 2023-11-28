package Actvidad_15.Collections;
import Actvidad_15.Searches.Nodo32;

import java.util.List;

/**
 * Clase que representa un árbol B 3-2.
 */
public class Btree32 {
    private Nodo32 root;

    /**
     * Constructor para crear un árbol B 3-2 vacío.
     */
    public Btree32() {
        root = new Nodo32();
    }

    /**
     * Busca un valor en el árbol.
     * @param key El valor a buscar.
     * @return true si el valor se encuentra en el árbol, false en caso contrario.
     */
    public boolean busqueda(int key) {
        return busqueda(root, key);
    }

    private boolean busqueda(Nodo32 node, int key) {
        if (node == null) {
            return false;
        }

        List<Integer> keys = node.keys;
        int i = 0;
        while (i < keys.size() && key > keys.get(i)) {
            i++;
        }

        if (i < keys.size() && key == keys.get(i)) {
            return true; // Encontrado
        } else if (node.children.size() > i) {
            return busqueda(node.children.get(i), key); // Buscar en el subárbol correspondiente
        } else {
            return false; // No encontrado
        }
    }

    /**
     * Inserta un valor en el árbol.
     * @param key El valor a insertar.
     */
    public void insert(int key) {
        insert(root, key);
    }

    private void insert(Nodo32 node, int key) {
        if (node.keys.size() < 2) {
            // Si el nodo no está lleno, simplemente insertamos la clave
            insertKey(node, key);
        } else {
            // Si el nodo está lleno, dividimos el nodo y propagamos la clave al padre
            Nodo32 newRoot = new Nodo32();
            newRoot.children.add(root);
            splitNode(newRoot, 0);
            root = newRoot;
            insert(newRoot, key);
        }
    }

    private void insertKey(Nodo32 node, int key) {
        int i = 0;
        while (i < node.keys.size() && key > node.keys.get(i)) {
            i++;
        }
        node.keys.add(i, key);
    }

    private void splitNode(Nodo32 nodoPadre, int childIndex) {
        Nodo32 nodeToSplit = nodoPadre.children.get(childIndex);
        Nodo32 newNode = new Nodo32();

        // Mover la clave del medio al padre
        int middleIndex = nodeToSplit.keys.size() / 2;
        int middleKey = nodeToSplit.keys.get(middleIndex);
        insertKey(nodoPadre, middleKey);

        // Mover las claves y los hijos restantes al nuevo nodo
        newNode.keys.addAll(nodeToSplit.keys.subList(middleIndex + 1, nodeToSplit.keys.size()));
        nodeToSplit.keys.subList(middleIndex, nodeToSplit.keys.size()).clear();

        if (!nodeToSplit.children.isEmpty()) {
            newNode.children.addAll(nodeToSplit.children.subList(middleIndex + 1, nodeToSplit.children.size()));
            nodeToSplit.children.subList(middleIndex + 1, nodeToSplit.children.size()).clear();
        }

        nodoPadre.children.add(childIndex + 1, newNode);
    }
}