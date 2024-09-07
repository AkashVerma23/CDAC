package Loanc;

import java.util.Scanner;

class LoanAmortizationCalculatorr {
	private float principal;
	private float rate;
	private int time;
	private float monthlyInterestRate;
	private int numberOfMonths;
	private float monthlyPayment;
	
	public LoanAmortizationCalculatorr(){
		this.principal = 0.0f;
		this.rate = 0.0f;
		this.time = 0;
		this.monthlyInterestRate = 0.0f;
		this.numberOfMonths = 0;
		this.monthlyPayment = 0.0f;
	}
	private static Scanner sc= new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Enter Principal amount: ");
		this.principal = sc.nextFloat();
		System.out.println("Enter Interest rate: ");
		this.rate = sc.nextFloat();
		System.out.println("Enter Years: ");
		this.time = sc.nextInt();
	}
	
	public float getPrincipal() {
		return principal;
	}
	
	public void setPrincipal(float principal) {
		this.principal = principal;
	}
	
	public float getRate() {
		return rate;
	}
	
	public void setRate(float rate) {
		this.rate = rate;
	}
	
	public int getTime() {
		return time;
	}
	
	public void setTime(int time) {
		this.time = time;
	}
	
	
	public void calculateMonthlyPayment() {
		this.monthlyInterestRate = rate / 12 / 100;
		this.numberOfMonths = time * 12;
		this.monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)*(numberOfMonths)*(numberOfMonths)) / ((1 + monthlyInterestRate)*(numberOfMonths)*(numberOfMonths) - 1);
	}
	
	public void printRecord() {
		System.out.println("IR: "+this.monthlyInterestRate);
		System.out.println("months: "+this.numberOfMonths);
		System.out.println("mp: "+this.monthlyPayment);
//		System.out.println(principal);
//		System.out.println(rate);
//		System.out.println(time);
	}
	
	public static int menuList() {
		System.out.println("Press 0 for Exit. ");
		System.out.println("Press 1 to Accept Record.");
		System.out.println("Press 2 to Print Record.");
		System.out.println("Enter your choice	:	");
		int choice = sc.nextInt();
		return choice;
	}
}
