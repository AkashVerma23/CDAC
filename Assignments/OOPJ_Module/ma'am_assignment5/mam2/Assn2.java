package mam2;

class Vehicle {
	public String make;
	public int year;	
	
	
	public Vehicle() {		
	}
	
	public Vehicle(String make, int year) {
		this.make = make;
		this.year = year;	
	}
	
	public void printRecord() {
		System.out.println("Make:  "+this.make);
		System.out.println("Year:  "+this.year);
	}
	
}

class Car extends Vehicle{
	
	public String model;
	
	public Car() {
		
	}
	
	public Car(String model) {
		this.model = model;
	}
		
	public Car(String make, int year, String model) {
		super(make,year);
		this.model = model;
	}
	public void printRecord() {
		super.printRecord();
		System.out.println("Model:  "+this.model);
		
	}

}

public class Assn2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car = new Car("TATA", 2024,"ZX");
		car.printRecord();

	}

}
