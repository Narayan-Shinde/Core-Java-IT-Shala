package multithreading.synhchronization;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {

        @AllArgsConstructor
        @NoArgsConstructor
        @ToString
        class BankAccount {
            int accountNumber;
            int balance;
            String accountHolderName;


            synchronized public void deposit(int amount) {
                balance += amount;
            }

            synchronized public void withdraw(int amount) {
                balance -= amount;
            }


        }
        BankAccount bankAccount = new BankAccount(1, 0, "abc");

        Thread atm = new Thread(() -> {
            for (int i = 1; i <= 1000000; i++) {
                bankAccount.deposit(1);
            }
        }, "atm");
        Thread upi = new Thread(() -> {
            for (int i = 1; i <= 1000000; i++) {
                bankAccount.deposit(1);
            }
        }, "upi");
        Thread netBanking = new Thread(() -> {
            for (int i = 1; i <= 1000000; i++) {
                bankAccount.deposit(1);
            }
        }, "netBanking");
        atm.start();
        upi.start();
        netBanking.start();

        atm.join();
        upi.join();
        netBanking.join();
        System.out.println("total available balance " + bankAccount.balance);

    }
}
