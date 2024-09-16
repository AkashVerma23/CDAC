package prepIn;
import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		System.out.println("Enter the third number");
		int n3 = sc.nextInt();
		int result1 = n1>n2 ? n1:n2;
		int result2 = result1>n3 ? result1:n3;
		System.out.println("The bigger number is: "+result2);
		
	}

}
