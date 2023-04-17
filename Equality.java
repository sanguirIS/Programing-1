import java.util.Scanner;

public class Equality {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int firstNumber = input.nextInt();

        System.out.print("Please enter the second number: ");
        int secondNumber = input.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " and " + secondNumber + " are equal");
        } else {
            System.out.println(firstNumber + " and " + secondNumber + " are not equal");
        }
    }
}
