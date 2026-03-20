import java.util.Scanner;

public class password_system {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        double balance = 1000;
        int choice;
        double deposit, withdraw;
        int correctPIN = 1234;
        int PIN;
        boolean isLoggedIn = false;


        for(int hotdog = 1; hotdog < 4; hotdog++) {
            System.out.print("Enter your PIN: ");
            PIN = input.nextInt();
            if(PIN == correctPIN) {
                System.out.println("Access Granted!");
                isLoggedIn = true;

                for (int i = 0; i < 100; i++) {
                    System.out.println("\n========= SIMPLE ATM SYSTEM =========\n");
                    System.out.println("[1] - Check Balance");
                    System.out.println("[2] - Deposit Money");
                    System.out.println("[3] - Withdraw Money");
                    System.out.println("[4] - Exit");
                    System.out.print("\nEnter your choice: ");
                    choice = input.nextInt();

                    switch (choice){
                        case 1:
                            System.out.println("Your current balance is: " + balance);
                            break;
                        case 2:
                            System.out.print("Enter amount to deposit: ");
                            deposit = input.nextDouble();
                            if(deposit <= 0) {
                                System.out.println("You have nothing to deposit.");
                            } else {
                                balance += deposit;
                                System.out.printf("\nDeposit Successful! Your new balance is: " + balance + "\n");
                            }
                            break;
                        case 3:
                            System.out.print("Enter amount to withdraw: ");
                            withdraw = input.nextDouble();
                            if(withdraw > balance) {
                                System.out.println("Your balance is insufficient!");
                            } else {
                                balance -= withdraw;
                                System.out.printf("\nWithdrawal Successful! Your new balance is: " + balance + "\n");
                            }
                            break;
                        case 4:
                            System.out.println("\n===== Thank you for using the ATM! =====\n");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid option. Please choose between 1-4 only!");

                    }
                }

            } else if (hotdog == 1){
                System.out.println("Attempt " + hotdog + "! Incorrect PIN");
            } else if (hotdog == 2){
                System.out.println("Attempt " + hotdog + "! Warning: Last Attempt Remaining!");
            } else {
                System.out.println("Attempt " + hotdog + "! Card BLocked!");
            }

        }

            if (!isLoggedIn) {
                System.out.println("Please contact your bank.");
            }



    }
}