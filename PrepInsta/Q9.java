package prepIn;

import java.util.Scanner;

public class Q9 { //prime number

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		if (n < 2)
	      {
			System.out.println ("The given number " + n + " is not prime");
			System.exit (0);
	      }
		if (n == 2 || n==3)
	      {
			System.out.println ("The given number " + n + " is a prime number");
			System.exit (0);
	      }
		for (int i = 2; i <= n/2; i++) {
			if (n%i == 0) {
				System.out.println(n+" is not a prime number");
				break;
			}
			else {
				System.out.println(n+" is a prime number");
				break;
			}
		}
	}

}
