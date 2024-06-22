package Funciones;

public class Bits {
     // Verificar si un número es par
     public static boolean esPar(int numero) {
        return (numero & 1) == 0;
    }

    // Invertir bits de un número
    public static int invertirBits(int numero) {
        return ~numero;
    }

    // Desplazamiento a la izquierda
    public static int desplazarIzquierda(int numero, int posiciones) {
        return numero << posiciones;
    }

    // Desplazamiento a la derecha con signo
    public static int desplazarDerecha(int numero, int posiciones) {
        return numero >> posiciones;
    }

    // Desplazamiento a la derecha sin signo
    public static int desplazarDerechaSinSigno(int numero, int posiciones) {
        return numero >>> posiciones;
    }

    // Obtener el bit en una posición específica
    public static int obtenerBit(int numero, int posicion) {
        return (numero >> posicion) & 1;
    }

    // Establecer un bit en una posición específica (ponerlo a 1)
    public static int establecerBit(int numero, int posicion) {
        return numero | (1 << posicion);
    }

    // Limpiar (poner a 0) un bit en una posición específica
    public static int limpiarBit(int numero, int posicion) {
        return numero & ~(1 << posicion);
    }

    // Alternar (toggle) un bit en una posición específica
    public static int alternarBit(int numero, int posicion) {
        return numero ^ (1 << posicion);
    }

    // Contar el número de bits 1 en un número
    public static int contarBits1(int numero) {
        int count = 0;
        while (numero != 0) {
            count += numero & 1;
            numero >>= 1;
        }
        return count;
    }

    // Determinar si un número es potencia de 2
    public static boolean esPotenciaDe2(int numero) {
        return (numero > 0) && ((numero & (numero - 1)) == 0);
    }

    // Rotar bits a la izquierda por un número específico de posiciones
    public static int rotarIzquierda(int numero, int posiciones) {
        int bits = Integer.SIZE;
        return (numero << posiciones) | (numero >>> (bits - posiciones));
    }

    // Rotar bits a la derecha por un número específico de posiciones
    public static int rotarDerechaSinSigno(int numero, int posiciones) {
        int bits = Integer.SIZE;
        return (numero >>> posiciones) | (numero << (bits - posiciones));
    }
    

    public static void main(String[] args) {
        // Ejemplos de uso de las funciones de BitUtils
        int numero = 10;
        System.out.println("--> " + numero + " es par: " + esPar(numero));

        int b = 0b10101010;
        int bInvertido = invertirBits(b);
        System.out.println("Bits invertidos de " + Integer.toBinaryString(b) + ": " + Integer.toBinaryString(bInvertido));

        int valor = 5;
        int valorDesplazado = desplazarIzquierda(valor, 3);
        System.out.println("Valor " + valor + " desplazado 3 posiciones a la izquierda: " + valorDesplazado);

        int bitEnPosicion2 = obtenerBit(numero, 2);
        System.out.println("Bit en posición 2 de " + numero + " es: " + bitEnPosicion2);

        int nuevoNumero = establecerBit(numero, 1);
        System.out.println("Nuevo número después de establecer el bit en posición 1: " + nuevoNumero);

        nuevoNumero = limpiarBit(numero, 3);
        System.out.println("Nuevo número después de limpiar el bit en posición 3: " + nuevoNumero);

        nuevoNumero = alternarBit(numero, 1);
        System.out.println("Nuevo número después de alternar el bit en posición 1: " + nuevoNumero);

        int bits1 = contarBits1(numero);
        System.out.println("Número de bits 1 en " + numero + ": " + bits1);

        boolean esPotencia2 = esPotenciaDe2(numero);
        System.out.println(numero + " es potencia de 2: " + esPotencia2);

        int rotadoIzquierda = rotarIzquierda(numero, 2);
        System.out.println("Número después de rotar a la izquierda: " + rotadoIzquierda);

        int rotadoDerecha = rotarDerechaSinSigno(numero, 2);
        System.out.println("Número después de rotar a la derecha: " + rotadoDerecha);
    }
}
