
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //Create  VARIABLE BALANCE
        double balance=0;
        boolean isRunning = true;

        //User Menu
        while(isRunning){
            System.out.println("***************");
            System.out.println("BANKING PROGRAM");
            System.out.println("***************");
            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("***************");
            //Your Choice (1-4)
            System.out.print("Enter your Choice (1-4):");
            int choice = scanner.nextInt();

            switch(choice){
                case 1 -> showBalance(balance);
                case 2 -> balance += deposit(balance);
                case 3 -> balance -= withdraw(balance);
                case 4 -> isRunning = false;
                default -> System.out.println("Invalid Number");
            }

        }
        scanner.close();
    }
    static  void showBalance(double balance){
        System.out.printf("$%.2f\n", balance);
    }
    static double deposit(double balance){
        System.out.print("Enter amount to be deposited:");
        double amount = scanner.nextDouble();
        if(amount<0){
            System.out.println("A negative number cannot be deposited.");
            return 0;
        }
        else {
            return amount;

        }
    }
    static double withdraw(double balance){
        System.out.print("Enter amount to be withdrawn:");
        double amount = scanner.nextDouble();
        if(amount>balance){
            System.out.println("Insufficient Funds ");
            return 0;
        }
        else if (amount < 0) {
            System.out.println("A negative number cannot be withdrawn.");
            return 0;

        }
        else {
            return amount;

        }
    }

}