package BusquedaYOrdenamientoObjetos;

public class Persona {
    private String nombre;
    private int edad;
    private double altura;

    public Persona(String nombre, int edad, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                '}';
    }

    // Método para comparar personas por nombre
    public boolean compararPorNombre(String otroNombre) {
        return this.nombre.equals(otroNombre);
    }

    // Método para comparar personas por edad
    public boolean compararPorEdad(int otraEdad) {
        return this.edad == otraEdad;
    }

    // Método para comparar personas por altura
    public boolean compararPorAltura(double otraAltura) {
        return Double.compare(this.altura, otraAltura) == 0;
    }
}
