package BusquedaYOrdenamientoObjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main2 {

    public static void main(String[] args) {
        // Crear una lista de personas
        List<Persona> personas = new ArrayList<>();
        personas.add(new Persona("Juan", 25, 175.5));
        personas.add(new Persona("María", 30, 160.0));
        personas.add(new Persona("Pedro", 20, 180.2));
        personas.add(new Persona("Ana", 28, 165.8));

        // Ordenar la lista de personas por nombre (en orden ascendente)
        Collections.sort(personas, Comparator.comparing(Persona::getNombre));

        // Mostrar la lista después de ordenar por nombre
        System.out.println("Lista de personas ordenada por nombre:");
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        // Buscar una persona por nombre utilizando el método compararPorNombre
        String nombreABuscar = "Pedro";
        Persona personaEncontradaPorNombre = buscarPersonaPorNombre(personas, nombreABuscar);
        if (personaEncontradaPorNombre != null) {
            System.out.println("\nPersona encontrada por nombre '" + nombreABuscar + "': " + personaEncontradaPorNombre);
        } else {
            System.out.println("\nPersona con nombre '" + nombreABuscar + "' no encontrada.");
        }

        // Buscar una persona por edad utilizando el método compararPorEdad
        int edadABuscar = 30;
        Persona personaEncontradaPorEdad = buscarPersonaPorEdad(personas, edadABuscar);
        if (personaEncontradaPorEdad != null) {
            System.out.println("\nPersona encontrada por edad '" + edadABuscar + "': " + personaEncontradaPorEdad);
        } else {
            System.out.println("\nPersona con edad '" + edadABuscar + "' no encontrada.");
        }

        // Buscar una persona por altura utilizando el método compararPorAltura
        double alturaABuscar = 175.5;
        Persona personaEncontradaPorAltura = buscarPersonaPorAltura(personas, alturaABuscar);
        if (personaEncontradaPorAltura != null) {
            System.out.println("\nPersona encontrada por altura '" + alturaABuscar + "': " + personaEncontradaPorAltura);
        } else {
            System.out.println("\nPersona con altura '" + alturaABuscar + "' no encontrada.");
        }
    }

    // Método para buscar una persona por nombre en una lista de personas
    private static Persona buscarPersonaPorNombre(List<Persona> personas, String nombre) {
        for (Persona persona : personas) {
            if (persona.compararPorNombre(nombre)) {
                return persona;
            }
        }
        return null; // Retorna null si no se encuentra la persona con el nombre especificado
    }

    // Método para buscar una persona por edad en una lista de personas
    private static Persona buscarPersonaPorEdad(List<Persona> personas, int edad) {
        for (Persona persona : personas) {
            if (persona.compararPorEdad(edad)) {
                return persona;
            }
        }
        return null; // Retorna null si no se encuentra la persona con la edad especificada
    }

    // Método para buscar una persona por altura en una lista de personas
    private static Persona buscarPersonaPorAltura(List<Persona> personas, double altura) {
        for (Persona persona : personas) {
            if (persona.compararPorAltura(altura)) {
                return persona;
            }
        }
        return null; // Retorna null si no se encuentra la persona con la altura especificada
    }
}
