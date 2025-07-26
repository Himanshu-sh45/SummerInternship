package Assignment;

abstract class BankAccount1 {
    protected String accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAccount1(String accNumber, String holderName, double initialBalance) {
        this.accountNumber = accNumber;
        this.accountHolderName = holderName;
        this.balance = initialBalance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
    abstract double getBalance();

    public void displayAccountInfo() {
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
    }
}

class SavingsAccount extends BankAccount1 {

    public SavingsAccount(String accNumber, String holderName, double initialBalance) {
        super(accNumber, holderName, initialBalance);
    }

    @Override
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    @Override
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    @Override
    double getBalance() {
        return balance;
    }
}

public class D12_Q2 {
    public static void main(String[] args) {
        BankAccount1 account = new SavingsAccount("1234567890", "Himanshu", 5000);

        account.displayAccountInfo();
        account.deposit(1500);
        account.withdraw(2000);
        System.out.println("Current Balance: ₹" + account.getBalance());
    }
}
