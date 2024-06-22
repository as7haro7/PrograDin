package Funciones;

public class BusquedaOrdenamiento {
    // Burbuja - Complejidad: O(n^2)
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    // Selección - Complejidad: O(n^2)
    public static void selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIdx = i;
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    // Inserción - Complejidad: O(n^2)
    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

    // Merge Sort (Recursivo) - Complejidad: O(n log n)
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; ++i) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            R[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Quick Sort (Recursivo) - Complejidad: O(n log n)
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    // Búsqueda Lineal - Complejidad: O(n)
    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    // Búsqueda Binaria (Recursivo) - Complejidad: O(log n)
    public static int binarySearch(int[] arr, int key, int left, int right) {
        if (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] > key) {
                return binarySearch(arr, key, left, mid - 1);
            }
            return binarySearch(arr, key, mid + 1, right);
        }
        return -1;
    }

    // Búsqueda Binaria (Iterativa) - Complejidad: O(log n)
    public static int binarySearchIterative(int[] arr, int key) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    // Recorrer matriz en forma lineal
    public static void recorrerMatrizLineal(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Recorrer matriz en forma de espiral
    public static void recorrerMatrizEspiral(int[][] matriz) {
        int top = 0, bottom = matriz.length - 1;
        int left = 0, right = matriz[0].length - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                System.out.print(matriz[top][i] + " ");
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                System.out.print(matriz[i][right] + " ");
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(matriz[bottom][i] + " ");
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matriz[i][left] + " ");
                }
                left++;
            }
        }
        System.out.println();
    }

    // Recorrer matriz en forma de zigzag
    public static void recorrerMatrizZigzag(int[][] matriz) {
        boolean leftToRight = true;
        for (int i = 0; i < matriz.length; i++) {
            if (leftToRight) {
                for (int j = 0; j < matriz[i].length; j++) {
                    System.out.print(matriz[i][j] + " ");
                }
            } else {
                for (int j = matriz[i].length - 1; j >= 0; j--) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
            leftToRight = !leftToRight;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Prueba de ordenamientos
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        int[] arrCopy = arr.clone();

        // Usar Merge Sort
        mergeSort(arr, 0, arr.length - 1);
        System.out.println("Array ordenado por Merge Sort:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Usar Quick Sort
        quickSort(arrCopy, 0, arrCopy.length - 1);
        System.out.println("Array ordenado por Quick Sort:");
        for (int i : arrCopy) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Prueba de búsqueda
        int key = 25;
        int result = binarySearch(arr, key, 0, arr.length - 1);
        if (result == -1) {
            System.out.println("Elemento no encontrado");
        } else {
            System.out.println("Elemento encontrado en el índice: " + result);
        }

        // Prueba de recorrido de matrices
        int[][] matriz = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        System.out.println("Recorrido de matriz en forma lineal:");
        recorrerMatrizLineal(matriz);

        System.out.println("Recorrido de matriz en forma de espiral:");
        recorrerMatrizEspiral(matriz);

        System.out.println("Recorrido de matriz en forma de zigzag:");
        recorrerMatrizZigzag(matriz);
    }
}
