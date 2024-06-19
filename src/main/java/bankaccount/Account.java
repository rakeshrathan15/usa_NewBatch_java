package bankaccount;

public class Account {

    public String accountNumber;
    public String IFSCCODE;
    public String accountHolderName;
    public double minimumBalance = 2000;
    public double balance = 0; // added balance attribute

    // Constructor to initialize account details
    public Account(String accountNumber, String IFSCCODE, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.IFSCCODE = IFSCCODE;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

}
