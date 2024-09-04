import java.util.Scanner;
class second {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=1; i<=n;i++) {
			for(int j=i; j>=1;j--) {
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}

}
