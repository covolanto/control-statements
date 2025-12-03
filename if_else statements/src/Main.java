import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double Rate_1 = 15, Rate_2 = 18.5;

        System.out.print("Enter Unit consumed : ");
        int units = sc.nextInt();

        double amount;

        if (units <= 100) {
            amount = units * Rate_1;
        } else {
            int remainder = units - 100;
            amount = (100 * Rate_1) + (remainder * Rate_2);
        }
        System.out.println("Bill Amount: Ksh" + amount);
    }
}