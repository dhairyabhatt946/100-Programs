import java.util.Scanner;

public class FibonacciIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        fibonacci(n);
    }

    public static void fibonacci(int n) {
        int prev2 = 0;
        int prev1 = 1;

        for(int i=0; i<n; i++) {
            System.out.print(prev2 + " ");
            int temp = prev2;
            prev2 = prev1;
            prev1 += temp; 
        }
    }
}
