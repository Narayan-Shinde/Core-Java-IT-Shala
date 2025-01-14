package classAndObject;

public class BankAccount {
    int accountNo;
    String name;
    double balance;

    static String BANK_NAME = "BANK of Mallya";

    public BankAccount(int accountNo, String name, double balance) {
        this.accountNo = accountNo;
        this.name = name;
    }
    public BankAccount() {}

    void deposit(double amount) {
        this.balance += amount;
    }

    void withdraw(double amount) {
        this.balance -= amount;
    }
}
