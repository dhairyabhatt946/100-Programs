import java.util.Scanner;

public class FactorsIterative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        findfactors(n);
    }

    public static void findfactors(int n) {
        System.out.println("Factors of " + n + " are:");
        for(int i=1; i<=n; i++) {
            if(n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
