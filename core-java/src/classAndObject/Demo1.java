package classAndObject;

public class Demo1 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.accountNo = 1;
        b.name = "Sandeep";
        b.balance = 123.05d;
        System.out.println("Account number \t" + b.accountNo);
        System.out.println("Account holder name \t" + b.name);
        System.out.println("Account Balance \t" + b.balance);
    }
}
