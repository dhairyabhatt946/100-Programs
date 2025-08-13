import java.util.Scanner;

public class FaactorialRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Factorial of " + n + " = "+ findFactorial(n));
    }

    public static int findFactorial(int n) {
        if(n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
}
