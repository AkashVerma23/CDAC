package mam5;

class Vehicle{
	
	void startEngine() {
		System.out.println("Start the engine in super class");
	}
	
	void stopEngine() {
		System.out.println("Stop the engine in super class");
	}
}

class Car extends Vehicle{
	
	void startEngine() {
		System.out.println("Start the engine in Car sub class");
	}
	
	void stopEngine() {
		System.out.println("Stop the engine in Car sub class");
	}
	
	
}

class Motorcycle extends Vehicle{
	
	void startEngine() {
		System.out.println("Start the engine in Motorcycle sub class");
	}
	
	void stopEngine() {
		System.out.println("Stop the engine in Motorcycle sub class");
	}
	
}

public class Assn5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle v = new Motorcycle();
		v.startEngine();
		v.stopEngine();
	}

}
