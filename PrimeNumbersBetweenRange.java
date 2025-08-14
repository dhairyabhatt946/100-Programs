import java.util.Scanner;

public class PrimeNumbersBetweenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();
        sc.close();
        primeNumbersBetweenRange(start, end);
    }

    public static void primeNumbersBetweenRange(int start, int end) {
        System.out.println("Prime numbers between " + start + " and " + end + " are:");
        for(int i=start; i<=end; i++) {
            if(isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int n) {
        for(int i=2; i<=Math.sqrt(n); i++) {
            if(n % i == 0) return false;
        }
        
        return true;
    }
}
