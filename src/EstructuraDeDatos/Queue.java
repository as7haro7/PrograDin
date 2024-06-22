package EstructuraDeDatos;
import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Insertar un elemento al final de la cola
    public void enqueue(T element) {
        list.addLast(element);
    }

    // Eliminar y devolver el elemento al frente de la cola
    public T dequeue() {
        return list.removeFirst();
    }

    // Devolver el elemento al frente de la cola sin eliminarlo
    public T peek() {
        return list.getFirst();
    }

    // Verificar si la cola está vacía
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Devolver el número de elementos en la cola
    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println("Elemento al frente es: " + queue.peek());
        System.out.println("Tamaño de la cola es: " + queue.size());
        System.out.println("Elemento eliminado: " + queue.dequeue());
        System.out.println("La cola está vacía: " + queue.isEmpty());
    }
}
