import java.util.ArrayList;
import java.util.Scanner;
public class UserAccounts {
	public static void main (String[] args) {
		// Define Array
		ArrayList<Account> accounts = new ArrayList<Account>();
		
		// Create a loop to define 8 accounts
		for (int i = 0; i < 8; i++) {
			Account account = new Account(i, 50);
			accounts.add(account);
		}
		
		// test
		for (Account account: accounts) {
			System.out.println(account.toString());
		}
		
		// call start() to ask for user Id and run the menu loop
		
		start(accounts);
		
	}
	
	public static void start(ArrayList<Account> accounts) {
		// Get User Id
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an id: ");
		int id = in.nextInt();
		Account accountRef = accounts.get(id); 
		// Menu loop
		while (true) {
			menuQuestion(accountRef, accounts);
			
		} 
		
	}
	
	public static void menuQuestion(Account account, ArrayList<Account> accounts) {
		Scanner in = new Scanner(System.in);
		System.out.println("Main menu");
		System.out.println("1: check balance");
		System.out.println("2: withdraw");
		System.out.println("3: deposit");
		System.out.println("4: exit");
		System.out.print("Enter a choice: ");
		int choice = in.nextInt();
		switch (choice) {
		case 1:
			System.out.println("The balance is $" + account.getBalance());
			
			break;
		case 2:
			System.out.println("Enter an amount to withdraw: ");
			double widthdrawAmount = in.nextDouble();
			account.withdraw(widthdrawAmount);
			break;
		case 3:
			System.out.println("Enter an amount to deposit: ");
			double deposit = in.nextDouble();
			account.deposit(deposit);
			break;
		case 4:
			start(accounts);
			break;
		}
	}
	
}
