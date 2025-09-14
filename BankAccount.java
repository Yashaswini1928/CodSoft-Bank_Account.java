import java.util.Scanner;
public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    
    public BankAccount(String accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }

  
    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        BankAccount account = new BankAccount("123456", "John Doe", 1000.0);
        System.out.println("Account created for " + account.accountHolderName + " with initial balance $" + account.getBalance());

        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);
        System.out.println("Current balance: $" + account.getBalance());

      
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);
        System.out.println("Current balance: $" + account.getBalance());

        sc.close();
    }

}
