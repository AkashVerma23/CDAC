package BMii;

import java.util.Scanner;

public class BMITracker {
	private float weight;
	private float height;
	private float bmic;
	
	public BMITracker() {
		this(0.0f,0.0f,0.0f);
	}
	public BMITracker(float weight, float height, float bmic) {
		this.weight = weight;
		this.height = height;
		this.bmic = bmic;
	}
	static Scanner sc= new Scanner(System.in);
	public void acceptRecord() {
		System.out.println("Enter your weight in kg: ");
		this.weight = sc.nextFloat();
		System.out.println("Enter your height in metres: ");
		this.height = sc.nextFloat();

	}
	
	public void calculateBMI() {
		this.bmic = weight / (height * height);
	}
	public void classifyBMI () {

		if(bmic<18.5) {
			System.out.println ("You are underweight");
		}
		else if(bmic>=18.5 && bmic<24.9) {
			System.out.println ("Your weight is normal");
		}
		else if(bmic>=25 && bmic<29.9) {
			System.out.println ("You are overweight!");
		}
		else {
			System.out.println ("You are OBESE!!!!");
		}
	}
	
	public void printRecord() {
		System.out.println("Your BMI is: "+ bmic);
		
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
