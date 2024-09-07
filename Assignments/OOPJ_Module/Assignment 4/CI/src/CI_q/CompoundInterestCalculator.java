package CI_q;

import java.util.Scanner;

public class CompoundInterestCalculator {

	private double principal;
	private double interest;
	private int noc;
	private int time;
	private double futureValue;
	private double interestEarned;
	
	public CompoundInterestCalculator() {
		this(0.0,0.0,0,0,0.0,0.0);
	}
	public CompoundInterestCalculator(double principal,double interest,int noc,int time,double futureValue,double interestEarned) {
		this.principal = principal;
		this.interest = interest;
		this.noc = noc;
		this.time = time;
		this.futureValue = futureValue;
		this.interestEarned = interestEarned;
	}

	private static Scanner sc= new Scanner(System.in);
	public void acceptRecord() {
		
		System.out.println("Enter Principal amount: ");
		this.principal = sc.nextDouble();
		System.out.println("Enter Interest rate: ");
		this.interest = sc.nextDouble();
		System.out.println("Enter NOC: ");
		this.noc = sc.nextInt();
		System.out.println("Enter Years: ");
		this.time = sc.nextInt();
	
		
	}
	public void calculateFutureValue() {
		this.futureValue = principal * (1 + interest / noc)*(noc * time)*(noc * time);
		this.interestEarned = futureValue - principal;
		
	}
	
	public void printRecord(){
		System.out.println("FV: "+ futureValue);
		System.out.println("IE: "+interestEarned);
	}
	
	public static int menuList() {
		System.out.println("Press 0 for Exit. ");
		System.out.println("Press 1 to Accept Record. ");
		System.out.println("Press 2 to Print Record. ");
		System.out.println("Enter your choice	:	");
		int choice = sc.nextInt();
		return choice;
	}
}
