import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year = 0;

        do {
            System.out.print("Enter a year (0 to exit): ");
            year = input.nextInt();

            if (year < 0 || year > 2400) {
                System.out.println("Invalid input. Please enter a valid year between 0 and 2400.");
            } else if (year != 0) {
                if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        } while (year != 0);
    }
}
