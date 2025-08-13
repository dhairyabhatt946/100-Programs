import java.util.Scanner;

public class FactorialIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial of " + n + " = " + findFactorial(n));
    }

    public static int findFactorial(int n) {
        int factorial = 1;
        for(int i=2; i<=n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}
