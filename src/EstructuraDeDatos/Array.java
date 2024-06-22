package EstructuraDeDatos;

public class Array<T> {
    private T[] arr;
    private int size;

    @SuppressWarnings("unchecked")
    public Array(int capacity) {
        arr = (T[]) new Object[capacity];
        size = 0;
    }

    // Obtener el elemento en un índice específico
    public T get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Índice fuera de límites");
        }
        return arr[index];
    }

    // Establecer el valor en un índice específico
    public void set(int index, T value) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Índice fuera de límites");
        }
        arr[index] = value;
    }

    // Añadir un nuevo elemento al final del arreglo
    public void add(T value) {
        if (size == arr.length) {
            resize();
        }
        arr[size++] = value;
    }

    // Redimensionar el arreglo cuando está lleno
    @SuppressWarnings("unchecked")
    private void resize() {
        T[] newArr = (T[]) new Object[arr.length * 2];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
    }

    // Obtener el tamaño del arreglo
    public int length() {
        return size;
    }

    public static void main(String[] args) {
        Array<Integer> array = new Array<>(2);
        array.add(1);
        array.add(2);
        array.add(3);
        System.out.println("Longitud del arreglo: " + array.length());
        System.out.println("Elemento en el índice 1: " + array.get(1));
        array.set(1, 10);
        System.out.println("Elemento en el índice 1 después de set: " + array.get(1));
    }
}
