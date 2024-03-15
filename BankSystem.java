import java.util.*;
class Bank{
    private double balance;
    public Bank(double balance)
    {
        this.balance=balance;
    }
    public void Deposit(double deposit)
    {
        balance=balance+deposit;
    }
    public void  Withdrawal(double withdraw)
    {
        if(withdraw<=balance)
        {
            balance=balance-withdraw;
        }
        else{
            System.out.println("not sufficient bank balance");
        }
    }
    public double getBalance(){
        return balance;
    }
}
public class BankSystem{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Initial Amount: ");
        double balance=sc.nextDouble();
        Bank b=new Bank(balance);
        System.out.print("Enter Deposit Amount: ");
        double depositAmount=sc.nextDouble();
        b.Deposit(depositAmount);
        System.out.print("Enter Withdrawal Amount: ");
        double withdrawalAmount=sc.nextDouble();
        b.Withdrawal(withdrawalAmount);
        System.out.println("Available balance: "+b.getBalance());
    }
}