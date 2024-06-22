package Funciones;
import java.util.Arrays;

public class Recursividad {
    public static void main(String[] args) throws Exception {
        int n = 5;
        System.out.println("fibonaci de " + n + ": " + fibonacci(5) + "");
        System.out.println("factorial de " + n + ": " + factorial(5) + "");
        System.out.println("multiplicacion rusa: " + n + "*" + n + ": " + multiplicacionRusa(n, n) + "");
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorial(n - 1));
        }
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else {
            if (n == 2) {
                return 1;
            } else {
                return (fibonacci(n - 1) + fibonacci(n - 2));
            }
        }

    }

    public static int sumarDig(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (sumarDig(n / 10) + sumarDig(n % 10));
        }
    }

    public static int contarDig(int n) {
        if (n == 0) {
            return 0;
        } else {
            return (contarDig(n / 10) + 1);
        }
    }

    public static int multiplicacionRusa(int a, int b) {
        if (a == 0) {
            return 0;
        } else {
            if (a % 2 == 0) {
                return (multiplicacionRusa(a / 2, b + b));
            } else {
                return (multiplicacionRusa(a / 2, b + b) + b);

            }
        }
    }

    public static int buscar(int[] lista, int elemento) {
        if (lista.length == 0) {
            return -1;
        } else if (lista[0] == elemento) {
            return 0;
        } else {
            int indice = buscar(Arrays.copyOfRange(lista, 1, lista.length), elemento);
            return indice == -1 ? -1 : indice + 1;
        }
    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else {
            return base * potencia(base, exponente - 1);
        }
    }

    public static String invertirCadena(String cadena) {
        if (cadena.length() == 0) {
            return "";
        } else {
            return cadena.charAt(cadena.length() - 1) + invertirCadena(cadena.substring(0, cadena.length() - 1));
        }
    }

    public static String decimalABinario(int numero) {
        if (numero == 0) {
            return "0";
        } else {
            return decimalABinario(numero / 2) + numero % 2;
        }
    }

    public static String decimalAOctal(int numero) {
        if (numero == 0) {
            return "0";
        } else {
            return decimalAOctal(numero / 8) + numero % 8;
        }
    }

    public static int binarioADecimal(String numeroBinario) {
        int resultado = 0;
        int exponente = 0;
        for (int i = numeroBinario.length() - 1; i >= 0; i--) {
            resultado += (numeroBinario.charAt(i) - '0') * Math.pow(2, exponente);
            exponente++;
        }
        return resultado;
    }

    public static void ordenar(int[] lista) {
        if (lista.length <= 1) {
            return;
        } else {
            int menor = lista[0];
            int indiceMenor = 0;
            for (int i = 1; i < lista.length; i++) {
                if (lista[i] < menor) {
                    menor = lista[i];
                    indiceMenor = i;
                }
            }
            int temp = lista[0];
            lista[0] = lista[indiceMenor];
            lista[indiceMenor] = temp;
            ordenar(Arrays.copyOfRange(lista, 1, lista.length));
        }
    }

    public static double fibonacciBinet(int n) {
        return Math.pow((1 + Math.sqrt(5)) / 2, n) / Math.sqrt(5);
    }

    public static int buscarBinaria(int[] lista, int elemento) {
        int inicio = 0;
        int fin = lista.length - 1;
        while (inicio <= fin) {
          int mitad = (inicio + fin) / 2;
          if (lista[mitad] == elemento) {
            return mitad;
          } else if (lista[mitad] < elemento) {
            inicio = mitad + 1;
          } else {
            fin = mitad - 1;
          }
        }
        return -1;
      }
      

    public static int sumaPares(int n) {
        if (n == 0) {
            return 0;
        } else if (n % 2 == 0) {
            return n + sumaPares(n - 2);
        } else {
            return sumaPares(n - 1);
        }
    }


   
    public static int mcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return mcd(b, a % b);
        }
    }

}
