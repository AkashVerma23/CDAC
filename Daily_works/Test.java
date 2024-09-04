import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
     
        for (int i =1; i<=n ; i++){
        
            for (int j = 1 ; j<=n-i ; j++){
                System.out.print(" ");
            }
            for (int j = i; j>=1 ; j--){
                System.out.print(j);
            }
            for (int j = 2; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
            }
                
            }
        }
        
    
    

