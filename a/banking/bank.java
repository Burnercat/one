 package banking;
 // Define Account interface
 interface Account {
    void deposit(double amount);
    void withdraw(double amount) throws InsufficientFundsException,
    OverdraftLimitExceededException;
    double checkBalance();
 }
 // Custom Exceptions
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
 }
 class OverdraftLimitExceededException extends Exception {
    public OverdraftLimitExceededException(String message) {
        super(message);
    }
 }
 // BankAccount class implementing Account interface
 class BankAccount implements Account {
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
    public void withdraw(double amount) throws InsufficientFundsException {
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
 // SavingsAccount subclass
 class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    public double calculateInterest(double timePeriod) {
        return balance * interestRate * timePeriod;
    }
 }
 // CurrentAccount subclass
 class CurrentAccount extends BankAccount {
    private double overdraftLimit;
    public CurrentAccount(String accountNumber, String accountHolder, double balance, double overdraftLimit) {
        super(accountNumber, accountHolder, balance);
    this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) throws OverdraftLimitExceededException, InsufficientFundsException {
        if (amount > balance + overdraftLimit) {
            throw new OverdraftLimitExceededException("Overdraft limit exceeded");
        } else if (amount > balance) {
            System.out.println("Using overdraft limit...");
            balance-= amount;
        } else {
            balance-= amount;
        }
    }
 }

