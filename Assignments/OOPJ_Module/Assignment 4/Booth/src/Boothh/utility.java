package Boothh;

import java.util.Scanner;

public class utility {
	booth_gs bo = new booth_gs();
	static Scanner sc= new Scanner(System.in);
	public void acceptRecord() {
		
		System.out.println("Enter the toll rate for car: ");
		bo.cart = sc.nextInt();
		System.out.println("Enter the toll rate for truck: ");
		bo.truckt = sc.nextInt();
		System.out.println("Enter the toll rate for bike: ");
		bo.biket = sc.nextInt();
		
	}
	
	public void setTollRates() {
		System.out.println("Enter the no. of cars passing through the toll booth: ");
		bo.carb = sc.nextInt();
		System.out.println("Enter the no. of truck passing through the toll booth: ");
		bo.truckb = sc.nextInt();
		System.out.println("Enter the no. of bike passing through the toll booth: ");
		bo.bikeb = sc.nextInt();
		
	}
		
	public void calculateRevenue(){
		bo.total = (bo.cart*bo.carb)+(bo.truckt*bo.truckb)+(bo.biket*bo.bikeb);
		bo.totalv = (bo.carb+bo.truckb+bo.bikeb);
		
	}
	public void printRecord() {
		System.out.println("Total number of vehicles passing through the toll booth: "+bo.totalv);
		System.out.println("Total Revenue collected: ₹ "+bo.total);
		
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
