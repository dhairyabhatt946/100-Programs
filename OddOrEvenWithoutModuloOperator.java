import java.util.Scanner;

public class OddOrEvenWithoutModuloOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        oddOrEven(n);
    }

    public static void oddOrEven(int n) {
        if((n & 1) == 1) {
            System.out.println(n + " is odd number.");
        }
        else{
            System.out.println(n + " is even number.");
        }
    }
}
