import java.util.Scanner;
class VoteCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int n = sc.nextInt();
        if (n>=18) {
            System.out.println("You are eligible to vote");
            
        }
        else{
            System.out.println("You are underage!! Get out!!");
        }
    }
    
}
