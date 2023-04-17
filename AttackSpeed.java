import java.util.Scanner;

public class AttackSpeed {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get inputs from user
        System.out.print("Enter the base attack speed: ");
        double baseAttackSpeed = sc.nextDouble();
        System.out.print("Enter the bonus attack speed %: ");
        double bonusAttackSpeed = sc.nextDouble() / 100.0;
        System.out.print("Enter the level: ");
        int level = sc.nextInt();

        // Calculate current attack speed
        double currentAttackSpeed = baseAttackSpeed * (1 + (bonusAttackSpeed * (level - 1)));

        // Round current attack speed to 3 decimal places
        currentAttackSpeed = Math.round(currentAttackSpeed * 1000.0) / 1000.0;

        // Print output
        System.out.println("The character's current attack speed is " + currentAttackSpeed + ".");
    }
}
