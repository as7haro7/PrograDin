package EstructuraDeDatos;

public class LinkedList<T> {
    private class Node {
        T data;
        Node next;

        Node(T data) {
            this.data = data;
        }
    }

    private Node head;

    // Añadir un elemento al final de la lista
    public void add(T data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Eliminar la primera aparición de un elemento en la lista
    public boolean remove(T data) {
        if (head == null) return false;

        if (head.data.equals(data)) {
            head = head.next;
            return true;
        }

        Node current = head;
        while (current.next != null && !current.next.data.equals(data)) {
            current = current.next;
        }

        if (current.next == null) return false;

        current.next = current.next.next;
        return true;
    }

    // Verificar si un elemento está presente en la lista
    public boolean contains(T data) {
        Node current = head;
        while (current != null) {
            if (current.data.equals(data)) return true;
            current = current.next;
        }
        return false;
    }

    // Imprimir todos los elementos de la lista
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.printList();
        System.out.println("La lista contiene 2: " + list.contains(2));
        list.remove(2);
        list.printList();
        System.out.println("La lista contiene 2: " + list.contains(2));
    }
}
