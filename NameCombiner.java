import java.util.Scanner;

public class NameCombiner {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter three first names:");
        String name1 = input.nextLine();
        String name2 = input.nextLine();
        String name3 = input.nextLine();

        System.out.println("Possible names are:");
        System.out.println("1 - " + name1 + " " + name2);
        System.out.println("2 - " + name1 + " " + name3);
        System.out.println("3 - " + name2 + " " + name1);
        System.out.println("4 - " + name2 + " " + name3);
        System.out.println("5 - " + name3 + " " + name1);
        System.out.println("6 - " + name3 + " " + name2);

        System.out.print("\nEnter 1-6 to select a name: ");
        int choice = input.nextInt();

        String combinedName = "";
        String[] names = { name1, name2, name3 };
        switch (choice) {
            case 1:
                combinedName = name1 + " " + name2;
                break;
            case 2:
                combinedName = name1 + " " + name3;
                break;
            case 3:
                combinedName = name2 + " " + name1;
                break;
            case 4:
                combinedName = name2 + " " + name3;
                break;
            case 5:
                combinedName = name3 + " " + name1;
                break;
            case 6:
                combinedName = name3 + " " + name2;
                break;
            default:
                System.out.println("Invalid choice.");
                System.exit(0);
        }

        String initials = "";
        for (String name : names) {
            initials += name.charAt(0);
        }

        String username = combinedName.toLowerCase().replace(" ", "_");

        System.out.println("\nThe initials for " + combinedName + " is " + initials + ".");
        System.out.println("Suggested username: " + username);
    }
}
