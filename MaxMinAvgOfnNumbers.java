import java.util.Scanner;

public class MaxMinAvgOfnNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to enter? ");
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        double avg = 0;

        for(int i=1; i<=n; i++) {
            System.out.print("Enter number " + i + ": ");
            int num = sc.nextInt();
            avg += num;
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }

        sc.close();
        avg /= n;
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
        System.out.println("Average = " + avg);
    }
}
