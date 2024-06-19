package bankaccount;

public class AccountService {
    // Method to credit money to an account
    public Account deposit(Account account, double amount) {
        if (account != null && account.accountNumber != null) {
            account.balance += amount;
            System.out.println("Deposit successful. New balance: " + account.balance);
        } else {
            System.out.println("Account not found.");
        }
        return account;
    }

    // Method to withdraw money from an account
    public void withdraw(Account account, double amount) {
        if (account != null && account.accountNumber != null) {
            if (account.balance - amount >= account.minimumBalance) {
                account.balance -= amount;
                System.out.println("Withdrawal successful. New balance: " + account.balance);
            } else {
                System.out.println("Insufficient balance. Minimum balance must be maintained.");
            }
        } else {
            System.out.println("Account not found.");
        }
       // return account;
    }


}
