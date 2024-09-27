package prac;

public class Solution2 {

	public static void main(String[] args) {
		
		int num  = 454;
		int sum = 0;
		int r,temp;
		
		temp=num;
		while(num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num = num/10;
		}
		if(temp==sum)
			System.out.println("Palindrome");
		else 
			System.out.println("Not Palindrome!");		
	}
}
