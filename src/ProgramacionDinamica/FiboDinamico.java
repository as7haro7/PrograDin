public class FiboDinamico {

    static int[] f = new int[100];

    static int fibonacciDinamico(int n) {
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++)
            f[i] = f[i - 2] + f[i - 1];
        return f[n];
    }

    public static void main(String[] args) {
        System.out.println(fibonacciDinamico(45));
    }

}