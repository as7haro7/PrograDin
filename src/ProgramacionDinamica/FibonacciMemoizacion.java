public class FibonacciMemoizacion {
    static int[] fg = new int[100];

    public static void main(String[] args) {
        fg[0] = 0;
        fg[1] = 1;
        System.out.println(fibonacci(45));
    }

    public static int fibonacci(int n) {
        if (fg[n] == 0 && n > 0) {
            fg[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return fg[n];
    }

}