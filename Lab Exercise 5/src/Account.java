
public class Account {
	private int accountNumber;
	private double balance;
	
	Account() {
		
	}
	
	Account(int accountNumber, double balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	Account(double balance, int accountNumber) {
		this.balance = balance;
		this.accountNumber = accountNumber;
	}
	
	public void credit(double amount) {
		if (!(amount <= 0)) {
			balance += amount;
		} else {
			throw new IllegalArgumentException("Invalid amount to credit!");
		}
		
	}
	
	public void debit(double amount) {
		if (balance >= amount && amount > 0) {
			balance -= amount;
		} else {
			throw new IllegalArgumentException("Invalid amount to debit!");
		}
	}
	
	public String toString() {
		return String.format("A/C no: %03d, Balance-$%.2f", accountNumber, balance);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}
}
