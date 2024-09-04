import java.util.Scanner;
class LeapYear {
    
    public static void main(String[] args) {
        boolean leap = false;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int r = n%400==0 || n%100==0 || n%4==0 ? 1:0;

        switch(r){
            case 1:
            System.out.println(n+" is the leap year");
            break;
            case 2:
            System.out.println(n+"is not the leap year");
            break;
            default:
            System.out.println(n+"is not the leap year");
        }
        
    }
}

