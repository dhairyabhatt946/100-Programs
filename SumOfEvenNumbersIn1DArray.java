import java.util.Arrays;
import java.util.Scanner;

public class SumOfEvenNumbersIn1DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Enter the element at index " + i + ": ");
            arr[i] = sc.nextInt();
        }
        sc.close();
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of even numbers = " + sumOfEvenNumbers(arr));
    }

    public static int sumOfEvenNumbers(int[] arr) {
        int sum = 0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        
        return sum;
    }
}