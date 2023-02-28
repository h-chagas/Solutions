package classesAndObjects;

public class Program {

	public static void main(String[] args) {
		
		Account myAccount = new Account(324, "Hugo", 0);
		myAccount.deposit(150);
		myAccount.withdraw(100);
		myAccount.getDetails();
		
		Account myAccount2 = new Account(123, "Milena", 0);
		myAccount2.deposit(100);
		myAccount2.withdraw(150);
		myAccount2.getDetails();
	}

}
