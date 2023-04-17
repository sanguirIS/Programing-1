import java.util.Scanner;

public class PrintInitials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your full name: ");
        String fullName = input.nextLine();

        String[] names = fullName.split(" ");
        String initials = "";

        for (String name : names) {
            initials += name.charAt(0) + ", ";
        }

        initials = initials.substring(0, initials.length() - 2);

        System.out.println("Your initials are: " + initials);
    }
}
