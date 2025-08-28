import java.util.Scanner;

public class DecimalToBCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter decimal number: ");
        int decimal = sc.nextInt();
        sc.close();
        
        String bcd = decimalToBCD(decimal);
        System.out.println("BCD of " + decimal + " is " + bcd);
    }

    public static String decimalToBCD(int decimal) {
        if (decimal == 0) return "0000";

        String bcd = "";

        while (decimal != 0) {
            int num = decimal % 10;
            String temp = "";

            while (temp.length() != 4) {
                if (num % 2 == 0) {
                    temp = "0" + temp;
                } else {
                    temp = "1" + temp;
                }
                num /= 2;
            }

            bcd = temp + (bcd.isEmpty() ? "" : " " + bcd);

            decimal /= 10;
        }

        return bcd;
    }
}
