package prepIn;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the nth number");
		int n = sc.nextInt();
		int a = 0;
		for (int i=0;i<=n;i++) {
			a+=i;
		}
		System.out.println("Sum is: "+a);

	}

}
