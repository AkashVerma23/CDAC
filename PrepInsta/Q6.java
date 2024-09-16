package prepIn;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number");
		int n2 = sc.nextInt();
		if (n1==n2) {
			System.out.println("They are equal");
		}else {
		int result = n1>n2 ? n1:n2;
		System.out.println(result+ " is the greater number");
		}
	}

}

