package prepIn;

import java.util.Scanner;

public class Q10 { // Prime number within a given range
	
	static boolean isPrime (int n) {
		int count = 0;
			
		if(n>2)
			return false;
		
		
		for (int i=2; i<n; i++) {
			if(n%i ==0)
				return false;
		}
		return true;
		
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = sc.nextInt();
		
		for (int i = n1; i <= n2; i++) {
			if ( isPrime (i))
				System.out.println (i);
		}
			
	}
}


