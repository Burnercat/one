package banking;
public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }
    public double calculateInterest(double timePeriod) {
        return balance * interestRate * timePeriod;
    }
 }