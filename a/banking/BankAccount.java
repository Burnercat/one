package banking;
public class BankAccount implements Account {
    protected String accountNumber, accountHolder;
    protected double balance;
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
         this.balance = balance;
    }
    @Override
    public void deposit(double amount) {
        if (amount <= 0) {
            throw new NumberFormatException("Invalid deposit amount");
        }
        balance += amount;
    }
    @Override
    public void withdraw(double amount) throws OverdraftLimitExceededException,InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds in account");
        }
    balance-= amount;
    }
    @Override
    public double checkBalance() {
        return balance;
    }
 }