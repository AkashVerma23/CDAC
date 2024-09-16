package mam;

class BankAccount {
	public double balance;
	public double amount;

	
	public BankAccount(double balance,double amount) {
		this.balance = balance;
		this.amount = amount;
	}	
	
	
	public double getBalance() {
		return balance;
	}


	public void setBalance(double balance) {
		this.balance = balance;
	}


	public double getAmount() {
		return amount;
	}


	public void setAmount(double amount) {
		this.amount = amount;
	}


	void deposit(){
		this.balance += this.amount;
		
	}
	
	void withdraw() {
		this.balance -= this.amount;
		System.out.println("Balance in super class is: "+this.balance);
	}

	void printRecord() {
		System.out.println("your balance is: "+ this.balance);
	}
	
}

class SavingsAccount extends BankAccount{
	
	double withdrawal_li;
	
	public SavingsAccount() {
		
	}
	
	public SavingsAccount(double balance,double amount,double withdrawal_li) {
		super(balance,amount);
		this.withdrawal_li = withdrawal_li;
	}
	
	
	
}


public class Assn1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SavingsAccount sa = new SavingsAccount(20000.00,1500,3000.00);
		sa.withdraw();
		sa.deposit();
		sa.printRecord();
		
		
		
		
	}

}
