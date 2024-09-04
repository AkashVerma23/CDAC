import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height");
        float arr[]=new float[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the student height>");
            arr[i]=sc.nextFloat();
        }
        System.out.println("Student's heights are");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "_");
        }

    }
    
}
