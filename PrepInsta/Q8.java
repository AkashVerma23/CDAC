package prepIn;
import java.util.Scanner;

public class Q8 { // leap year

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int n = sc.nextInt();
		
		if (n%400 == 0) {
			System.out.println(n+" is a leap year.");
		}
		else if (n%4== 0 && n%100 !=0 ) {
			System.out.println(n+" is a leap year.");
		}else {
			System.out.println(n+ " is not a leap year.");
		}
	}

}
