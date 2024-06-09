import java.util.Scanner;

public class ATMInterface {
    private Account account;

    public ATMInterface(Account account) {
        this.account = account;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {

            System.out.println("(1) Deposit");
            System.out.println("(2) Withdraw");
            System.out.println("(3) Check Balance");
            System.out.println("(4) Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    if (account.deposit(depositAmount)) {
                        System.out.println("Deposit successful.");
                    } else {
                        System.out.println("Invalid ");
                    }
                    System.out.println("Thank you for using ATM");
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (account.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful.");
                    } else {
                        System.out.println("Invalid withdrawal amount or insufficient balance.");
                    }
                    System.out.println("Thank you for using ATM");
                    break;

                case 3:
                    System.out.println("Your balance is: " + account.checkBalance());
                    System.out.println("Thank you for using ATM");
                    break;

                case 4:
                    System.out.println("Exiting...");
                    System.out.println("Thank you for using ATM");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                System.out.println("Thank you for using ATM");
            }
        } while (choice!= 4);
    }

    public static void main(String[] args) {
       Account account = new Account(0);
        ATMInterface atm = new ATMInterface(account);
        atm.start();
    }
}
