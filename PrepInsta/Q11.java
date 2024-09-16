package prepIn;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		String n = sc.nextLine();
		
		int sum = 0;
		for (int i=0; i<n.length(); i++) {
			sum = sum + n.charAt(i) -48;
			
		}
		System.out.println(sum);
	}

}
