package bankaccount;

public class AccountTest {

    public static void main(String[] args) {

        AccountService accountService = new AccountService();

        // Create account instances
        Account account1 = new Account("12356", "IFSC001", "John Doe", 5000);
        Account account2 = new Account("789012", "IFSC002", "Jane Smith", 39000);

       /* // Test deposit
        account1 = accountService.deposit(account1, 1500);
        account2 = accountService.deposit(account2, 500);

        // Test withdraw
        account1 = accountService.withdraw(account1, 2000);
        account2 = accountService.withdraw(account2, 1000);

        // Test insufficient balance */
        accountService.withdraw(account2, 2500);

        System.out.println(account1.accountNumber);
        System.out.println(account2.balance);
    }


}
