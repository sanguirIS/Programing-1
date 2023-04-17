import java.util.Scanner;

public class SeatReservation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[][] seats = new boolean[10][4]; // initialize all seats as empty
        int row, col;

        // print seat layout
        System.out.println("Bus seat reservation:");
        System.out.println("  col1 col2 col3 col4");
        for (int i = 0; i < 10; i++) {
            System.out.print("row" + (i + 1) + "  ");
            for (int j = 0; j < 4; j++) {
                System.out.print((seats[i][j] ? "X" : "O") + "   ");
            }
            System.out.println();
        }

        // ask for seat reservations
        do {
            System.out.print(
                    "Enter the row and column number to reserve separated by a space (Enter a negative number to exit): ");
            row = input.nextInt();
            col = input.nextInt();
            if (row >= 1 && row <= 10 && col >= 1 && col <= 4) {
                if (seats[row - 1][col - 1]) {
                    System.out.println("Seat already reserved. Please choose another seat.");
                } else {
                    seats[row - 1][col - 1] = true;
                    System.out.println("Seat reserved.");
                }
            } else if (row >= 0 && col >= 0) {
                System.out.println(
                        "Invalid input. Please enter row and column numbers between 1 and 10 and 1 and 4, respectively.");
            }
        } while (row >= 0 && col >= 0);
    }
}
