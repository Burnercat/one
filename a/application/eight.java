 package application;
 import banking.*;
 public class eight {
    public static void main(String[] args) {
        try {
            SavingsAccount savings = new SavingsAccount("S1001", "Alice", 5000, 0.03);
            CurrentAccount current = new CurrentAccount("C2001", "Bob", 2000, 1000);
            savings.deposit(1000);
            current.deposit(500);
            System.out.println("Savings Balance: " + savings.checkBalance());
            System.out.println("Current Balance: " + current.checkBalance());
            savings.withdraw(2000);
            current.withdraw(2500);
            System.out.println("Savings Balance after withdrawal: " +
            savings.checkBalance());
            System.out.println("Current Balance after withdrawal: " +
            current.checkBalance());
            double interest = savings.calculateInterest(2);
            System.out.println("Interest earned on Savings Account: " + interest);
        } catch (NumberFormatException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException | OverdraftLimitExceededException e) {
            System.out.println("Transaction Error: " + e.getMessage());
        }
    }
 }
