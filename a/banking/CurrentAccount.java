package banking;
public class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
    this.overdraftLimit = overdraftLimit;
    }
    @Override
    public void withdraw(double amount) throws OverdraftLimitExceededException, InsufficientFundsException {
        if (amount > balance + overdraftLimit) {
            throw new OverdraftLimitExceededException("Overdraft limit exceeded");
        }
        super.withdraw(amount);
    }
 }