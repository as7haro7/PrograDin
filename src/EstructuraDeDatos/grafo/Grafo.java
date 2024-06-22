package EstructuraDeDatos.grafo;


import java.util.*;

public class Grafo<T> {
    private Map<T, List<T>> listaDeAdyacencia;

    public Grafo() {
        listaDeAdyacencia = new HashMap<>();
    }

    // Agregar un vértice al grafo
    public void agregarVertice(T vertice) {
        listaDeAdyacencia.putIfAbsent(vertice, new ArrayList<>());
    }

    // Agregar una arista (conexión) entre dos vértices
    public void agregarArista(T vertice1, T vertice2) {
        listaDeAdyacencia.get(vertice1).add(vertice2);
        listaDeAdyacencia.get(vertice2).add(vertice1);
    }

    // Eliminar un vértice del grafo
    public void eliminarVertice(T vertice) {
        // Eliminar el vértice de todas las listas de adyacencia
        listaDeAdyacencia.values().forEach(e -> e.remove(vertice));
        // Eliminar la entrada del vértice en el mapa
        listaDeAdyacencia.remove(vertice);
    }

    // Eliminar una arista entre dos vértices
    public void eliminarArista(T vertice1, T vertice2) {
        List<T> lista1 = listaDeAdyacencia.get(vertice1);
        List<T> lista2 = listaDeAdyacencia.get(vertice2);
        if (lista1 != null) lista1.remove(vertice2);
        if (lista2 != null) lista2.remove(vertice1);
    }

    // Obtener los vecinos (vértices adyacentes) de un vértice dado
    public List<T> obtenerVecinos(T vertice) {
        return listaDeAdyacencia.get(vertice);
    }

    // Realizar una búsqueda en profundidad (DFS) comenzando desde un vértice dado
    public void busquedaEnProfundidad(T verticeInicial) {
        Set<T> visitados = new HashSet<>();
        Stack<T> pila = new Stack<>();
        pila.push(verticeInicial);
        while (!pila.isEmpty()) {
            T vertice = pila.pop();
            if (!visitados.contains(vertice)) {
                visitados.add(vertice);
                System.out.print(vertice + " ");
                for (T vecino : listaDeAdyacencia.get(vertice)) {
                    if (!visitados.contains(vecino)) {
                        pila.push(vecino);
                    }
                }
            }
        }
        System.out.println();
    }

    // Realizar una búsqueda en amplitud (BFS) comenzando desde un vértice dado
    public void busquedaEnAmplitud(T verticeInicial) {
        Set<T> visitados = new HashSet<>();
        Queue<T> cola = new LinkedList<>();
        cola.add(verticeInicial);
        while (!cola.isEmpty()) {
            T vertice = cola.poll();
            if (!visitados.contains(vertice)) {
                visitados.add(vertice);
                System.out.print(vertice + " ");
                for (T vecino : listaDeAdyacencia.get(vertice)) {
                    if (!visitados.contains(vecino)) {
                        cola.add(vecino);
                    }
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Grafo<Integer> grafo = new Grafo<>();
        grafo.agregarVertice(1);
        grafo.agregarVertice(2);
        grafo.agregarVertice(3);
        grafo.agregarVertice(4);
        grafo.agregarVertice(5);

        grafo.agregarArista(1, 2);
        grafo.agregarArista(1, 3);
        grafo.agregarArista(2, 4);
        grafo.agregarArista(3, 5);
        grafo.agregarArista(4, 5);

        System.out.println("DFS desde el vértice 1:");
        grafo.busquedaEnProfundidad(1);

        System.out.println("BFS desde el vértice 1:");
        grafo.busquedaEnAmplitud(1);
    }
}
