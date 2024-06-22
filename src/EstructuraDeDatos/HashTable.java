package EstructuraDeDatos;

import java.util.LinkedList;

public class HashTable<K, V> {
    private class Entry<K, V> {
        K key;
        V value;

        Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int SIZE = 16;
    private LinkedList<Entry<K, V>>[] table;

    @SuppressWarnings("unchecked")
    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList<>();
        }
    }

    // Función hash para calcular el índice basado en la clave
    private int hash(K key) {
        return key.hashCode() % SIZE;
    }

    // Insertar un par clave-valor en la tabla hash
    public void put(K key, V value) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                entry.value = value; // Actualizar el valor si la clave ya existe
                return;
            }
        }
        bucket.add(new Entry<>(key, value)); // Agregar nuevo par clave-valor
    }

    // Obtener el valor asociado a una clave específica
    public V get(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                return entry.value; // Devolver el valor si se encuentra la clave
            }
        }
        return null; // Devolver null si la clave no existe
    }

    // Eliminar el par clave-valor asociado a una clave específica
    public boolean remove(K key) {
        int index = hash(key);
        LinkedList<Entry<K, V>> bucket = table[index];
        for (Entry<K, V> entry : bucket) {
            if (entry.key.equals(key)) {
                bucket.remove(entry); // Eliminar la entrada si se encuentra la clave
                return true;
            }
        }
        return false; // Devolver false si la clave no existe
    }

    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("uno", 1);
        hashTable.put("dos", 2);
        hashTable.put("tres", 3);

        System.out.println("Valor asociado a 'dos': " + hashTable.get("dos"));
        System.out.println("Eliminando clave 'dos': " + hashTable.remove("dos"));
        System.out.println("Valor asociado a 'dos' después de eliminar: " + hashTable.get("dos"));
    }
}
