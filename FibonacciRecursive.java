import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        for(int i=1; i<=n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if(n <= 2) {
            return n - 1;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
