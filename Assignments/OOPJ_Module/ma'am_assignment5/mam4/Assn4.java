package mam4;

class Student{
	
	String name;
	int id;
	int age;
	
	public Student(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }
	
	public void printRecord() {
		 System.out.println("Student Name: " + name);
	     System.out.println("Age: " + age);
	     System.out.println("Student ID: " + id);
	}
	
}
public class Assn4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Akash", 100, 17869);
		s.printRecord();
		
	}

}
