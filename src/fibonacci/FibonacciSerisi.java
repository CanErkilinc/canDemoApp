package fibonacci;

public class FibonacciSerisi {
    public FibonacciSerisi() {
    }

    public void fibonacciOzellikleri() {

                // Fibonacci serisi : 1 1 2 3 5 8 13 21 ...
                // örn: f(6) = f(5) + f(4)

                int n = 13;
                int a = 0, b = 1;
                System.out.print("Fibonacci Serisi Başlancıcı" + n);

                System.out.println("\n");

                for (int i = 1; i<=n; i++) {
                    System.out.print(a + " ");
                    int sum = a + b;
                    a = b;
                    b = sum;
                }
    }
}


