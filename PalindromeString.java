import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        sc.close();
        boolean flag = isPalindrome(str);
        if(flag) {
            System.out.println(str + " is palindrome.");
        }
        else {
            System.out.println(str + " is not palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;
        while(left <= right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
