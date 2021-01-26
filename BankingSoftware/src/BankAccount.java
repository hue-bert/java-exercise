public class BankAccount {
    private String owner, accountNumber;
    private double balance;
    protected static int numberOfAccounts = 100001;

    public BankAccount(String owner, String accountNumber, double balance, int numberOfAccounts) {
        this.owner = owner;
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.numberOfAccounts = numberOfAccounts;
    }

    public BankAccount() {
        balance = 0;
        accountNumber = numberOfAccounts + "";
        numberOfAccounts++;

    }

    public BankAccount(String name, double amount) {
        this.owner = name;
        this.balance = amount;
        accountNumber = numberOfAccounts + "";
        numberOfAccounts++;
    }

    public BankAccount(BankAccount oldAccount, double amount) {
        /*owner = oldAccount.owner;
        balance = amount;
        accountNumber = oldAccount.accountNumber;*/
        oldAccount.setBalance(amount);
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        boolean completed = true;
        if (amount <= balance) {
            balance = balance - amount; }
        else {
            completed = false; }
        return completed;
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setBalance(double amount) {
        balance = amount;
    }

    public void setAccountNumber(String newAccountNumber) {
        this.accountNumber = newAccountNumber;
    }

}
