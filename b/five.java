 class ATM {
    private double balance;
    public ATM(double initialBalance) {
        this.balance = initialBalance;
    }
    public synchronized void withdraw(double amount, String customerName) {
        if (amount > balance) {
            System.out.println(customerName + " attempted to withdraw $" + amount + " but insufficient balance!");
        } else {
            balance-= amount;
            System.out.println(customerName + " withdrew $" + amount + ". New balance:$" + balance);
        }
    }
    public synchronized void deposit(double amount, String customerName) {
        balance += amount;
        System.out.println(customerName + " deposited $" + amount + ". New balance: $"+ balance);
    }
    public synchronized double getBalance() {
        return balance;
    }
}
 class Customer extends Thread {
    private ATM atm;
    private String name;
    public Customer(ATM atm, String name) {
        this.atm = atm;
        this.name = name;
    }
    @Override
    public void run() {
        atm.deposit(500, name);
        atm.withdraw(200, name);
        System.out.println(name + " checked balance: $" + atm.getBalance());
    }
}
 public class five {
    public static void main(String[] args) {
        ATM atm=new ATM(1000); 
        Customer c1 = new Customer(atm, "Alice");
        Customer c2 = new Customer(atm, "Bob");

    c1.start();
    c2.start();
    try {
        c1.join();
        c2.join();
    } catch (InterruptedException e) {
        System.out.println("Thread interrupted!");
     }
    System.out.println("All transactions completed. Final ATM balance: $" +atm.getBalance());
    }
}
