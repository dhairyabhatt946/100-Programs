import java.util.Scanner;

public class AngleBetweenHourAndMinuteHand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the hours: ");
        int hours = sc.nextInt();
        System.out.print("Enter the minutes: ");
        int minutes = sc.nextInt();
        System.out.println("Angle between hour and minute = " + angleBetweenHourAndMinuteHand(hours, minutes));
        sc.close();
    }

    public static double angleBetweenHourAndMinuteHand(int hours, int minutes) {
        return Math.abs(30*hours - 5.5*minutes);
    }
}
