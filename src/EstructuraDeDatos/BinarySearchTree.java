package EstructuraDeDatos;

public class BinarySearchTree<T extends Comparable<T>> {
    private class Node {
        T data;
        Node left, right;

        Node(T data) {
            this.data = data;
        }
    }

    private Node root;

    // Insertar un elemento en el árbol
    public void insert(T data) {
        root = insertRec(root, data);
    }

    private Node insertRec(Node root, T data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, data);
        } else if (data.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    // Buscar un elemento en el árbol
    public boolean search(T data) {
        return searchRec(root, data) != null;
    }

    private Node searchRec(Node root, T data) {
        if (root == null || root.data.equals(data)) {
            return root;
        }

        if (data.compareTo(root.data) < 0) {
            return searchRec(root.left, data);
        }

        return searchRec(root.right, data);
    }

    // Recorrer el árbol en orden ascendente
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    private void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(50);
        bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);

        bst.inorder();

        System.out.println("Buscar 40: " + bst.search(40));
        System.out.println("Buscar 90: " + bst.search(90));
    }
}
