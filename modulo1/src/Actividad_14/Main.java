package Actividad_14;

    public class Main {
        public static void main(String[] args) {
            ArbolDeBusquedaBinaria tree = new ArbolDeBusquedaBinaria();

            // Insertar algunos valores en el árbol
            tree.insert(50);
            tree.insert(30);
            tree.insert(20);


            // Imprimir el árbol en orden
            System.out.println("Arbol en orden correcto:");
            tree.inorder();

            // Buscar valores en el árbol
            int keyToSearch = 40;
            if (tree.search(keyToSearch)) {
                System.out.println("\n" + keyToSearch + " encontrado en el árbol.");
            } else {
                System.out.println("\n" + keyToSearch + " no encontrado en el árbol.");
            }
        }
    }

