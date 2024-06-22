package BusquedaYOrdenamientoObjetos;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main{

    public static void main(String[] args) {
        // Crear una lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25, 175.5));
        personas.add(new Persona("María", 30, 160.0));
        personas.add(new Persona("Pedro", 20, 180.2));
        personas.add(new Persona("Ana", 28, 165.8));

        // Mostrar la lista antes de ordenar
        System.out.println("Lista de personas antes de ordenar:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordenar la lista de personas por nombre (en orden ascendente)
        Collections.sort(personas, Comparator.comparing(Persona::getNombre));

        // Mostrar la lista después de ordenar por nombre
        System.out.println("\nLista de personas ordenada por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Ordenar la lista de personas por edad (en orden descendente)
        Collections.sort(personas, Comparator.comparingInt(Persona::getEdad).reversed());

        // Mostrar la lista después de ordenar por edad (descendente)
        System.out.println("\nLista de personas ordenada por edad (descendente):");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Buscar una persona por nombre utilizando búsqueda lineal
        String nombreABuscar = "Pedro";
        Persona personaEncontrada = buscarPersonaPorNombre(personas, nombreABuscar);
        if (personaEncontrada != null) {
            System.out.println("\nPersona encontrada por nombre '" + nombreABuscar + "': " + personaEncontrada);
        } else {
            System.out.println("\nPersona con nombre '" + nombreABuscar + "' no encontrada.");
        }
    }

    // Método para buscar una persona por nombre en una lista de personas
    private static Persona buscarPersonaPorNombre(List<Persona> personas, String nombre) {
        for (Persona persona : personas) {
            if (persona.getNombre().equals(nombre)) {
                return persona;
            }
        }
        return null; // Retorna null si no se encuentra la persona con el nombre especificado
    }
}
