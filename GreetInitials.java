import java.util.Scanner;

public class GreetInitials {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your initials: ");
        char firstInitial = input.next().charAt(0);
        char lastInitial = input.next().charAt(0);

        System.out.println("Hello " + firstInitial + " " + lastInitial + "!");
    }
}
