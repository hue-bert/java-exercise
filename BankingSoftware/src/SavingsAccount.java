public class SavingsAccount extends BankAccount {
    private double rate;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String owner, String accountNumber, double balance, int numberOfAccounts) {
        super(owner, accountNumber, balance, numberOfAccounts);
    }

    public SavingsAccount(String name, double amount) {
        super(name, amount);
        accountNumber = "";
        rate = 2.5;
    }

    public SavingsAccount(SavingsAccount oldAccount, double amount) {
        super(oldAccount, amount);
        savingsNumber += 1;
    }

    public void postInterest() {
        rate = (rate / 100) / 12;
        setBalance(getBalance() * rate + getBalance());
    }

    @Override
    public String getAccountNumber() {
        savingsNumber += 1;
        accountNumber = super.getAccountNumber() + "-" + savingsNumber;
        return accountNumber;
    }
}
