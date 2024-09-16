package mam3;

class Animal {

	 String name;


	 public Animal(String name) {
	     this.name = name;
	 }

	 
	 public void eat() {
	     System.out.println(name + " is eating.");
	 }


	 public void sleep() {
	     System.out.println(name + " is sleeping.");
	 }
	}

	
class Dog extends Animal {


	 public Dog(String name) {
	     super(name);  
	 }

	
	 public void bark() {
	     System.out.println(name + " is barking.");
	 }
	}
public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal animal = new Animal("Horse");
	     System.out.println("Animal :");
	     animal.eat();
	     animal.sleep();
	     
	     System.out.println();

	     Dog dog = new Dog("Sumo");
	     System.out.println("Dog :");
	     dog.eat(); 
	     dog.sleep(); 
	     dog.bark();  
		
		
	}

}





