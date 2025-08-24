import java.util.Scanner;

public class DecimalToBCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        sc.close();
        String binary = decimalToBCD(decimal);
        System.out.println("BCD of " + decimal + " is " + binary);
    }

    public static String decimalToBCD(int decimal) {
        if(decimal == 0) return "0";

        String binary = "";

        while(decimal != 0) {
            if(decimal % 2 == 0) {
                binary = "0" + binary;
            }
            else {
                binary = "1" + binary;
            }
            decimal /= 2;
        }

        return binary;
    }
}
