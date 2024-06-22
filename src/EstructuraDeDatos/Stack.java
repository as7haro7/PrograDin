package EstructuraDeDatos;

import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Insertar un elemento en la cima de la pila
    public void push(T element) {
        list.addFirst(element);
    }

    // Eliminar y devolver el elemento en la cima de la pila
    public T pop() {
        return list.removeFirst();
    }

    // Devolver el elemento en la cima de la pila sin eliminarlo
    public T peek() {
        return list.getFirst();
    }

    // Verificar si la pila está vacía
    public boolean isEmpty() {
        return list.isEmpty();
    }

    // Devolver el número de elementos en la pila
    public int size() {
        return list.size();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Elemento en la cima es: " + stack.peek());
        System.out.println("Tamaño de la pila es: " + stack.size());
        System.out.println("Elemento eliminado: " + stack.pop());
        System.out.println("La pila está vacía: " + stack.isEmpty());
    }
}
