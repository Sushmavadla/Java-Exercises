package bank;

public class BankAccount {
	private double balance;
	 public BankAccount(double initialBalance) {
	        if (initialBalance > 0) {
	            this.balance = initialBalance;
	        } else {
	            this.balance = 0;
	        }
	    }
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit successful! New balance: " + balance);
	        } else {
	            System.out.println("Deposit amount must be greater than zero.");
	        }
	    }
	    public void withdraw(double amount) {
	        if (amount > 0) {
	            if (amount <= balance) {
	                balance -= amount;
	                System.out.println("Withdrawal successful. New balance: " + balance);
	            } else {
	                System.out.println("Withdrawal amount exceeds the available balance.");
	            }
	        } else {
	            System.out.println("Withdrawal amount must be greater than zero.");
	        }
	    }

	    
	    public double getBalance() {
	        return balance;
	    }

	    public static void main(String[] args) {
	       
	        BankAccount account = new BankAccount(1500.00); 
	        account.deposit(500.00); 
	        account.withdraw(250.00); 
	        System.out.println("Final balance: " + account.getBalance());
	    }
}
