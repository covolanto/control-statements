import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Select EB Connection Type:");
        System.out.println("1. Domestic");
        System.out.println("2. Commercial");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = input.nextInt();

        System.out.print("Enter units consumed: ");
        int units = input.nextInt();

        double amount = 0;
        final double DRATE_A = 15, CRATE_A = 30;

        switch (choice) {
            case 1:
                // Domestic billing
                if (units <= 100) {
                    amount = units * DRATE_A;
                } else {
                    System.out.println("This lesson only covers first 100 units.");
                }
                break;

            case 2:
                // Commercial billing
                if (units <= 100) {
                    amount = units * CRATE_A;
                } else {
                    System.out.println("This lesson only covers first 100 units.");
                }
                break;

            default:
                System.out.println("Invalid choice! Please enter 1 or 2.");
                return;
        }

        System.out.println("Bill Amount: Ksh " + amount);
        input.close();
    }
}