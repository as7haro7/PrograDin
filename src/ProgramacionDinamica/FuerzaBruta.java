public class FuerzaBruta {

  public static void main(String[] args) {
    //prueba_busqueda_lineal();
    //probar_expo();
    //prueba_maxsuma();
    //prueba_cambio();
    prueba_fibonacciRec();
  }

  static void prueba_busqueda_lineal() {
    int[] arreglo = { 4, 7, 2, 9, 1, 5 };
    int dato = 9;
    int resultado = busqueda_lineal(arreglo, arreglo.length, dato);
    if (resultado != -1) {
      System.out.println("El elemento " + dato + " se encuentra en el índice " + resultado);
    } else {
      System.out.println("El elemento " + dato + " no se encuentra en el arreglo.");
    }
  }

  static int busqueda_lineal(int[] A, int n, int dato) {
    for (int i = 0; i < n; i++) {
      if (A[i] == dato) {
        return i;
      }
    }
    return -1;
  }

  static void probar_expo() {
    int resultado = expo(2, 3);
    System.out.println("Exponente: " + resultado);
  }

  static int expo(int x, int n) {
    int result = 1; // Inicializar el resultado en 1
    for (int i = 0; i < n; i++) {
      result *= x; // Multiplicar el resultado por x en cada iteración
    }
    return result;
  }

  static void prueba_maxsuma() {
    int[] arreglo = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
    int resultado = maxsuma(arreglo);
    System.out.println("Máxima suma de subarreglo: " + resultado);
  }

  static int maxsuma(int[] v) {
    int maxSuma = Integer.MIN_VALUE; // Inicializar la máxima suma con el menor valor posible
    for (int i = 0; i < v.length; i++) {
      int suma = 0;
      for (int j = i; j < v.length; j++) {
        suma += v[j];
        if (suma > maxSuma) {
          maxSuma = suma;
        }
      }
    }
    return maxSuma;
  }

  static void prueba_cambio() {
    int v = 123;
    int resultado = cambio(v);
    System.out.println("Número mínimo de monedas para el cambio de " + v + ": " + resultado);
  }

  static int cambio(int v) {
    int[] monedas = { 100, 50, 25, 10, 5, 1 };
    int n = 0;
    int s = 0;
    int i = 0;
    while (s < v && i < monedas.length) {
      if ((s + monedas[i]) <= v) {
        s += monedas[i];
        n++;
      } else {
        i++;
      }
    }
    if (i < monedas.length) {
      return n;
    } else {
      return -1;
    }
  }

  static void prueba_fibonacciRec() {
    int n = 10;
    int resultado = fibonacciRec(n);
    System.out.println("Fibonacci de " + n + ": " + resultado);
  }

  static int fibonacciRec(int n) {
    if (n == 0) {
      return 0;
    }
    if (n == 1) {
      return 1;
    }
    return fibonacciRec(n - 1) + fibonacciRec(n - 2);
  }
}
