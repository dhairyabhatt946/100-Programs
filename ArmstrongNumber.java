import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        if(isArmstrong(n)) {
            System.out.println(n + " is armstrong");
        }
        else {
            System.out.println(n + " is not armstrong");
        }
    }

    public static boolean isArmstrong(int n) {
        int digits = countDigits(n);
        int a = n, res = 0;

        while (a != 0) {
            int rem = a % 10;
            res += (int) Math.pow(rem, digits);
            a /= 10;
        }

        if(res == n) return true;
        else return false;
    }

    public static int countDigits(int n) {
        int digits = 0;

        while (n != 0 ) {
            digits++;
            n /= 10;            
        }

        return digits;
    }
}