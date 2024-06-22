package Funciones;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TeoriaNumeros {

    public static boolean esPrimoNormal(int numero) {
        boolean flag = false;
        int cont = 0;
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                cont++;
            }
            if (cont == 2) {
                flag = true;
            }
        }
        return flag;
    }

    public static boolean esPrimoMejoradoDos(int numero) {
        if (numero <= 1) {
            return false;
        }

        for (int i = 2; i * i <= numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean esPrimoMejoradoTres(int numero) {
        int cont = 0;
        boolean flag = true;

        if (numero <= 1) {
            return false;
        }

        if (numero == 2) {
            return true;
        }

        if (numero % 2 == 0) {
            return false;
        }

        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                cont++;
            }
            if (cont > 1) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static ArrayList<Integer> cribaEratostenes(int numero) {
        boolean[] esPrimo = new boolean[numero + 1];
        Arrays.fill(esPrimo, true);

        for (int p = 2; p * p <= numero; p++) {
            if (esPrimo[p]) {
                for (int i = p * p; i <= numero; i += p) {
                    esPrimo[i] = false;
                }
            }
        }

        ArrayList<Integer> primos = new ArrayList<>();
        for (int i = 2; i <= numero; i++) {
            if (esPrimo[i]) {
                primos.add(i);
            }
        }

        return primos;
    }

    public static boolean esPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    static void esPrimiGemelo(int a, int b) {
        int contador = 0;
        for (int i = a; i <= b - 2; i++) {
            if (esPrimo(i) && esPrimo(i + 2)) {
                contador++;
                System.out.print("(" + i + "," + (i + 2) + "), ");
            }
        }
        System.out.println("\n" + (contador * 2) + " primos gemelos");
        System.out.println();
    }

    public static boolean esPrimoTruncable(int numero) {
        String numStr = Integer.toString(numero);

        // Verificar truncado desde la izquierda
        for (int i = 1; i < numStr.length(); i++) {
            int truncIzquierda = Integer.parseInt(numStr.substring(i));
            if (!esPrimo(truncIzquierda)) {
                return false;
            }
        }

        // Verificar truncado desde la derecha
        for (int i = numStr.length() - 1; i > 0; i--) {
            int truncDerecha = Integer.parseInt(numStr.substring(0, i));
            if (!esPrimo(truncDerecha)) {
                return false;
            }
        }

        return true;
    }

    public static void encontrarDivisoresSimple(long numero) {
        for (long i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    public static void encontrarDivisoresMejorada(long numero) {
        for (long i = 1; i * i <= numero; i++) {
            if (numero % i == 0) {
                System.out.print(i + " ");
                if (i != numero / i) {
                    System.out.print(numero / i + " ");
                }
            }
        }
        System.out.println();
    }

    //
    // Función para descomponer un número desde la derecha
    public static void descomponerDesdeDerecha(int numero) {
        System.out.println("Descomposicion desde la DER");
        System.out.println("n: " + numero);
        while (numero > 0) {
            int digito = numero % 10;
            System.out.println("digito: " + digito);
            numero = numero / 10;
        }
    }

    // Función para descomponer un número desde la izquierda
    public static void descomponerDesdeIzquierda(int numero) {
        System.out.println("Descomposicion desde la IZQ");
        System.out.println("n: " + numero);
        int cantidadDigitos = (int) Math.log10(numero) + 1;
        System.out.println("Cantidad de digitos: " + cantidadDigitos);
        while (numero > 0) {
            int digito = numero / (int) Math.pow(10, cantidadDigitos - 1);
            numero = numero % (int) Math.pow(10, cantidadDigitos - 1);
            System.out.println("digito: " + digito + "    Nro: " + numero);
            cantidadDigitos--;
        }
    }

    // Función para componer un número desde la derecha
    public static int componerDesdeDerecha(int numero, int digito) {
        System.out.println("Composicion desde la DER");
        return numero * 10 + digito;
    }

    // Función para componer un número desde la izquierda
    public static int componerDesdeIzquierda(int numero, int digito) {
        System.out.println("Composicion desde la IZQ");
        int cantidadDigitos = (int) Math.log10(numero) + 1;
        return numero + digito * (int) Math.pow(10, cantidadDigitos);
    }

    // Función para determinar si un número es capicúa
    public static boolean esCapicua(int numero) {
        int original = numero;
        int invertido = 0;
        while (numero > 0) {
            int digito = numero % 10;
            numero = numero / 10;
            invertido = invertido * 10 + digito;
        }
        return original == invertido;
    }

    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static int factorial(int numero) {
        if (numero < 0) {
            throw new IllegalArgumentException("El factorial no está definido para números negativos");
        }
        int resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static int sumaDigitos(int numero) {
        int suma = 0;
        while (numero != 0) {
            suma += numero % 10;
            numero /= 10;
        }
        return suma;
    }

    // Método para encontrar divisores usando el método normal
    public static List<Long> encontrarDivisoresNormal(long n) {
        List<Long> divisores = new ArrayList<>();
        for (long i = 1; i <= n; i++) {
            if (n % i == 0) {
                divisores.add(i);
            }
        }
        return divisores;
    }

    // Método para encontrar divisores usando el método mejorado
    public static List<Long> encontrarDivisoresMejorado(long n) {
        List<Long> divisores = new ArrayList<>();
        for (long i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                divisores.add(i);
                if (i != n / i) { // Para evitar agregar el mismo divisor dos veces
                    divisores.add(n / i);
                }
            }
        }
        return divisores;
    }

    public static void main(String[] args) {

        int n = 351;

        System.out.println(esPrimoTruncable(n));

        int numero = 387;

        // Ejemplos de uso de las funciones
        descomponerDesdeDerecha(numero);
        System.out.println();
        descomponerDesdeIzquierda(numero);
        System.out.println();
        int nuevoNumero = componerDesdeDerecha(numero, 9);
        System.out.println("Nuevo número desde la derecha: " + nuevoNumero);
        nuevoNumero = componerDesdeIzquierda(numero, 9);
        System.out.println("Nuevo número desde la izquierda: " + nuevoNumero);
        System.out.println();

        int num = 12121;
        if (esCapicua(num)) {
            System.out.println("El numero " + num + " es CAPICUA");
        } else {
            System.out.println("El numero " + num + " NO es CAPICUA");
        }


        long m = 1_000_000_000L;
        System.out.println("Método Normal para encontrar divisores de " + m);

        List<Long> divisores = encontrarDivisoresNormal(m);
        for (Long divisor : divisores) {
            System.out.println(divisor + " es divisor de " + m);
        }

        System.out.println("Método Mejorado para encontrar divisores de " + m);

        List<Long> divisores1 = encontrarDivisoresMejorado(m);
        for (Long divisor : divisores1) {
            System.out.println(divisor + " es divisor de " + m);
        }
    }

}
