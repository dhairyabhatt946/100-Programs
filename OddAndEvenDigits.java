import java.util.Scanner;

public class OddAndEvenDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();
        int[] res = oddAndEvenDigits(n);
        System.out.println("Total odd digits = " + res[0]);
        System.out.println("Total even digits = " + res[1]);
    }

    public static int[] oddAndEvenDigits(int n) {
        if(n == 0) return new int[]{0, 1};
        
        int oddDigits = 0;
        int evenDigits = 0;

        while (n != 0) {
            int rem = n % 10;
            if(rem % 2 == 0) {
                evenDigits++;
            }
            else {
                oddDigits++;
            }
            n /= 10;
        }

        return new int[]{oddDigits, evenDigits};
    }
}