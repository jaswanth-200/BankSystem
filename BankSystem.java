import java.util.*;
class Bank {
    private double balance; 

    // Constructor to initialize the balance with a given amount
    public Bank(double balance) {
        this.balance = balance;
    }

    // Method to deposit 
    public void Deposit(double deposit) {
        // update the balance by the deposit amount
        balance = balance + deposit; 
    }

    // Method to withdraw 
    public void Withdrawal(double withdraw) {
        if (withdraw <= balance) { 
            //withdrawal amount
            balance = balance - withdraw;  
        } else {
            System.out.println("Not sufficient bank balance"); 
        }
    }

    // Method to get the current balance of the account
    public double getBalance() {
        // Return the current balance
        return balance; 
    }
}

//Main method
public class BankSystem {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Initial Amount: ");
        double balance = sc.nextDouble();
        Bank b = new Bank(balance);

        // enter deposit amount 
        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        b.Deposit(depositAmount);

        // enter withdrawal amount 
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawalAmount = sc.nextDouble();
        b.Withdrawal(withdrawalAmount);

        // Display the available balance after deposit and withdrawal operations
        System.out.println("Available balance: " + b.getBalance());
    }
}
