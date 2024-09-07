package Retaill;

import java.util.Scanner;

public class EmployeeUtil {
	public Retail o = new Retail();
	public Retail getEmp() {
		return o;
	}
	
	
	
	static Scanner sc= new Scanner(System.in);
	public void acceptRecord() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter original price: ");
		o.originalPrice = sc.nextFloat();
		System.out.println("Enter Discount rate: ");
		o.discountRate = sc.nextFloat();
	}
	
	public void calculateDiscount () {
		o.discountAmount = o.originalPrice * (o.discountRate / 100);
		o.finalPrice = o.originalPrice - o.discountAmount;
	}
	
	public void printRecord() {
		System.out.println("₹ "+o.discountAmount);
		System.out.println("₹ "+o.finalPrice);
		
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
