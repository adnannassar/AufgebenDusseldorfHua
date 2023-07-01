package Hiding_Principle;

public class Hiding_Principle {
    static class BankAccount {
        private double balance;

        public BankAccount(double balance) {
            this.balance = balance;
        }

        public void withdraw(int money) {
            if (money > 0 && money <= balance) {
                balance -= money;
            }
        }

        public void deposit(int money) {
            if (money > 0) {
                balance += money;
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        // withdraw
        bankAccount.withdraw(500);
        System.out.println("Balance after withdraw 500 --> " + bankAccount.balance);

        // deposit
        bankAccount.deposit(200);
        System.out.println("Balance after Deposit 200 --> " + bankAccount.balance);
    }
}
