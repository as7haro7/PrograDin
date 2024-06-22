public class FibonacciDinamicoMejorado {
    static int fibonacciDinamicoMejorado(int n) {
        int fiboAnt1 = 1, fiboAnt2 = 0, fiboProx = 0;
        for (int i = 2; i <= n; i++) {
            fiboProx = fiboAnt1 + fiboAnt2;
            fiboAnt2 = fiboAnt1;
            fiboAnt1 = fiboProx;
        }
        return fiboAnt1;
    }

    public static void main(String[] args) {
        System.out.println(fibonacciDinamicoMejorado(45));
    }
}
