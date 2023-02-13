
public class useAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a1 = new Account(1122, 20000);
		a1.setAnnualInterestRate(4.5);
		a1.withdraw(2500);
		a1.deposit(3000);
		System.out.println("Balance: $" + a1.getBalance() 
		+ "\nMonthly Interest: $"
		+ a1.getMonthlyInterest() + "\nDate: " 
		+ a1.getDateCreated());
		
	}

}
