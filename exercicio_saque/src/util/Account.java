package util;

public class Account {
	private String name;
	private int accountNumber;
	private double balance;

	public Account(String name, int accountNumber) {
		this.name = name;
		this.accountNumber = accountNumber;
	}

	public Account(String name, int accountNumber, double initialDeposit) {
		this.name = name;
		this.accountNumber = accountNumber;
		deposit(initialDeposit);
	}

	public String toString() {
		return "Account " + accountNumber + ", Holder: " + name + ", Balance: $ " + String.format("%.2f", balance);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5;
	}

}
