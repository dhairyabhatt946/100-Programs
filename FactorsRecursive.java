import java.util.Scanner;

public class FactorsRecursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        System.out.println("Fcators of " + n + " are:");
        findFactors(n, n);
    }

    public static void findFactors(int n, int i) {
        if(i == 1) {
            System.out.print(i + " ");
            return;
        }
        findFactors(n, i-1);
        if(n % i == 0) {
            System.out.print(i + " ");
        }
    }
}
