import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int Rate = 15;

        System.out.println("enter unit consumed:  ");
       int unit = sc.nextInt();

        double amount = 0;

        if(unit <= 100){
            amount = unit * Rate;

        }
        System.out.println("Bill amount : Ksh. " + amount);
    }
}