import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        char employeeType;

        System.out.print("Enter employee name: ");
        name = input.nextLine();

        System.out.print("Enter employee type (F-full time, P-part time): ");
        employeeType = input.next().charAt(0);

        if (employeeType == 'F' || employeeType == 'f') {
            double monthlySalary;

            System.out.print("Enter monthly salary: ");
            monthlySalary = input.nextDouble();

            System.out.printf("Name: %s%n", name);
            System.out.printf("Salary: $%.2f%n", monthlySalary);
        } else if (employeeType == 'P' || employeeType == 'p') {
            double ratePerHour;
            int hoursWorked, overtimeHours;

            System.out.print("Enter rate per hour: ");
            ratePerHour = input.nextDouble();

            System.out.print("Enter number of hours worked: ");
            hoursWorked = input.nextInt();

            System.out.print("Enter number of overtime hours: ");
            overtimeHours = input.nextInt();

            double wage = (hoursWorked * ratePerHour) + (overtimeHours * ratePerHour * 1.25);

            System.out.printf("Name: %s%n", name);
            System.out.printf("Wage: $%.2f%n", wage);
        } else {
            System.out.println("Error: Invalid employee type");
        }

        input.close();
    }
}
