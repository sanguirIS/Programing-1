import java.util.Scanner;

public class KineticEnergy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter mass in kilograms: ");
        double mass = input.nextDouble();
        System.out.print("Enter velocity in meters per second: ");
        double velocity = input.nextDouble();

        double kineticEnergy = calculateKineticEnergy(mass, velocity);

        System.out.printf("The object's kinetic energy is: %.2f J.", kineticEnergy);
    }

    public static double calculateKineticEnergy(double mass, double velocity) {
        double kineticEnergy = 0.5 * mass * Math.pow(velocity, 2);
        return kineticEnergy;
    }
}
