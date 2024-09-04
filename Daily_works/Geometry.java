import java.util.Scanner;
class Geometry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a shape: ");
        char a = sc.next().charAt(0);
        float pi = 3.14f;
        switch (a) {
            case 'c':
                System.out.println("Enter radius: ");
                float r = sc.nextFloat();
                float area = pi*(r*r);
                System.out.println("Circle area is "+ area);
                break;
            case 'r':
                System.out.println("Enter length of rectangle: ");
                float l = sc.nextFloat();
                System.out.println("Enter breadth of rectangle: ");
                float b = sc.nextFloat();
                float area1 = l*b;
                System.out.println("rectangle area is "+area1);
                break;
            case 's':
                System.out.println("Enter the side of square: ");
                float s = sc.nextFloat();
                float area2=s*s;
                System.out.println("square area is "+area2);
                break;
            case 't':
                System.out.println("Enter base: ");
                float t = sc.nextFloat();
                System.out.println("Enter height: ");
                float h = sc.nextFloat();
                float area3=0.5f*(t*h);
                System.out.println("triangle area is "+ area3);
                break;
            default:
            System.out.println("Enter correct shape");
                break;
        }
        
    }
}
