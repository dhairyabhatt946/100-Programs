import java.util.Scanner;

public class SumOfDigitsIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Sum of digits of " + n + " = " + sumOfDigits(n));
    }

    public static int sumOfDigits(int n) {
        int sum = 0;

        while (n != 0) {
            int rem = n % 10;
            sum += rem;
            n /= 10;
        }

        return sum;
    }
}
