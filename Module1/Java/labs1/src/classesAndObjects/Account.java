package classesAndObjects;

public class Account {

	private int id;
	private String owner;
	double balance;
	
	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if (amount > 0) 
			this.balance += amount;
		
	}
	
	public void withdraw(double amount) {
		if (this.balance < amount) {
			System.out.println("You can't withdraw more than you have in your account");
		} else {
			this.balance -= amount;
		}
			
	}
	
	public void getDetails() {
		System.out.printf("Hi %s (id n. %d), your balance is %.2f", this.owner, this.id, this.balance);
		System.out.println("\n");
	}
	
	public void addInterest() {
		
	}
	
}
