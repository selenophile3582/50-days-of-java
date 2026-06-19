// ATM Machine

// Features:
// Check balance
// Deposit
// Withdraw
// Exit
import java.util.Scanner;

public class Day50_ATM_Machine {

    // public static double  ATMfeatures(int a) {
    // }
    public static void main(String[] args) {

        System.out.println("================================");
        System.out.println("Welcome to ATM Machine !");
        System.out.println("================================");

        Scanner sc = new Scanner(System.in);
        double balance = 0.0;

        int choice;
        System.out.println("Enter :\t 1 to Balance check \t 2 to Deposite \t 3 to Withdraw \t 4 to exit");
        do {
            System.out.print("Enter your choice : ");
            choice = sc.nextInt();

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid Choice !! Enter again ");
                continue;
            }

            switch (choice) {

                case 1:
                    System.out.println("Availbale balance : " + balance);
                    break;
                case 2:
                    System.out.print("How much do you want to Deposite : ");
                    double amount = sc.nextDouble();
                    if (amount <= 0) {
                        System.out.println("Amount less than 1 cannot be deposited !!");
                    } else {
                        balance = balance + amount;
                        System.out.println("Amount Deposited Successfully ! ");
                        System.out.println("Availbale balance : " + balance);
                    }
                    break;

                case 3:
                    System.out.print("How much amount do you want to withdraw : ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("Insufficient Balance ");
                        System.out.println("You can withdraw only up to : " + balance);
                    } else if (withdraw > 0) {
                        balance -= withdraw;
                        System.out.println("Amount Deducted Succesfully ");
                        System.out.println("Availbale balance : " + balance);
                    } else {
                        System.out.println("Invalid Amount ");
                    }
                    break;

            }

        } while (choice != 4);
        System.out.println("================================");
        System.out.println("You choose to exit the program ! ");
        System.out.println("================================");

        sc.close();
    }

}
