import java.util.Date;
public class Account {
	private int id;
	private double balance;
	static public double annualInterestRate;
	private Date dateCreated = new Date();
	Account(){
		this.id = 0;
		this.balance = 0;
		annualInterestRate = 0;
		
	}
	Account(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return this.balance;
	}
	public void setBalance(double newBalance) {
		this.balance = newBalance;
	}
	public void setAnnualInterestRate(double newRate) {
		annualInterestRate = newRate;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	
	public double getMonthlyInterestRate() {
		return (annualInterestRate / 12) * 0.01;
	}
	public double getMonthlyInterest() {
		double monthlyInterest = getMonthlyInterestRate();
		return monthlyInterest * balance;
		
	}
	public void withdraw(double amount) {
		this.balance = this.balance - amount;
	}
	public void deposit(double amount) {
		this.balance = this.balance + amount;
	}
	public Date getDateCreated() {
		return this.dateCreated;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", balance=" + balance + ", dateCreated=" + dateCreated + "]";
	}
}
