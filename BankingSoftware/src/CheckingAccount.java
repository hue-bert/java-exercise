public class CheckingAccount extends BankAccount {

    private static final double FEE = 0.15;

    public CheckingAccount(String owner, String accountNumber, double balance, int numberOfAccounts) {
        super(owner, accountNumber, balance, numberOfAccounts);
    }


    public CheckingAccount(String name, double amount) {
        super(name, amount);
        setAccountNumber(getAccountNumber()+"-10");
    }

    @Override
    public boolean withdraw(double amount) {
        //-10
        amount = amount + FEE;
        return super.withdraw(amount);
    }
}
