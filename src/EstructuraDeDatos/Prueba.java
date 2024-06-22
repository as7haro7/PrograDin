package EstructuraDeDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Prueba {

    public static void main(String[] args) {
        probarArrayList();
        probarLinkedList();
        probarHashMap();
        probarHashSet();
    }

    // Método para probar ArrayList
    private static void probarArrayList() {
        System.out.println("----- Probando ArrayList -----");
        // Crear un ArrayList de enteros
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // Agregar elementos al ArrayList
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        
        // Mostrar todos los elementos del ArrayList
        System.out.println("Elementos del ArrayList:");
        for (Integer num : arrayList) {
            System.out.println(num);
        }
        
        // Obtener y mostrar el tamaño del ArrayList
        System.out.println("Tamaño del ArrayList: " + arrayList.size());
        
        // Comprobar si el ArrayList contiene un elemento específico
        int elemento = 20;
        System.out.println("¿El ArrayList contiene " + elemento + "? " + arrayList.contains(elemento));
        
        // Eliminar un elemento del ArrayList
        arrayList.remove(Integer.valueOf(20));
        System.out.println("Elementos del ArrayList después de eliminar 20:");
        for (Integer num : arrayList) {
            System.out.println(num);
        }
        
        System.out.println();
    }

    // Método para probar LinkedList
    private static void probarLinkedList() {
        System.out.println("----- Probando LinkedList -----");
        // Crear una LinkedList de Strings
        LinkedList<String> linkedList = new LinkedList<>();
        
        // Agregar elementos a la LinkedList
        linkedList.add("Hola");
        linkedList.add("Mundo");
        linkedList.add("!");

        // Mostrar todos los elementos de la LinkedList
        System.out.println("Elementos de la LinkedList:");
        for (String palabra : linkedList) {
            System.out.println(palabra);
        }

        // Obtener y mostrar el primer y último elemento de la LinkedList
        System.out.println("Primer elemento: " + linkedList.getFirst());
        System.out.println("Último elemento: " + linkedList.getLast());

        // Eliminar el primer y último elemento de la LinkedList
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println("Elementos de la LinkedList después de eliminar el primero y el último:");
        for (String palabra : linkedList) {
            System.out.println(palabra);
        }

        System.out.println();
    }

    // Método para probar HashMap
    private static void probarHashMap() {
        System.out.println("----- Probando HashMap -----");
        // Crear un HashMap de Integer a String
        HashMap<Integer, String> hashMap = new HashMap<>();
        
        // Agregar pares clave-valor al HashMap
        hashMap.put(1, "Uno");
        hashMap.put(2, "Dos");
        hashMap.put(3, "Tres");
        
        // Mostrar todos los pares clave-valor del HashMap
        System.out.println("Elementos del HashMap:");
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + " -> " + hashMap.get(key));
        }
        
        // Obtener y mostrar el tamaño del HashMap
        System.out.println("Tamaño del HashMap: " + hashMap.size());
        
        // Comprobar si el HashMap contiene una clave específica
        int clave = 2;
        System.out.println("¿El HashMap contiene la clave " + clave + "? " + hashMap.containsKey(clave));
        
        // Eliminar un par clave-valor del HashMap
        hashMap.remove(2);
        System.out.println("Elementos del HashMap después de eliminar la clave 2:");
        for (Integer key : hashMap.keySet()) {
            System.out.println(key + " -> " + hashMap.get(key));
        }
        
        System.out.println();
    }

    // Método para probar HashSet
    private static void probarHashSet() {
        System.out.println("----- Probando HashSet -----");
        // Crear un HashSet de Strings
        HashSet<String> hashSet = new HashSet<>();
        
        // Agregar elementos al HashSet
        hashSet.add("Rojo");
        hashSet.add("Verde");
        hashSet.add("Azul");
        
        // Mostrar todos los elementos del HashSet
        System.out.println("Elementos del HashSet:");
        for (String color : hashSet) {
            System.out.println(color);
        }
        
        // Obtener y mostrar el tamaño del HashSet
        System.out.println("Tamaño del HashSet: " + hashSet.size());
        
        // Comprobar si el HashSet contiene un elemento específico
        String elemento = "Verde";
        System.out.println("¿El HashSet contiene " + elemento + "? " + hashSet.contains(elemento));
        
        // Eliminar un elemento del HashSet
        hashSet.remove("Rojo");
        System.out.println("Elementos del HashSet después de eliminar 'Rojo':");
        for (String color : hashSet) {
            System.out.println(color);
        }
        
        System.out.println();
    }
}
