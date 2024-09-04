import java.util.Scanner;
class BMI  {
    public static void main(String[] args){

    @SuppressWarnings("resource")
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter you weight in KG: ");
    Float a = sc.nextFloat();
    System.out.println("Enter you height in metres: ");
    Float b = sc.nextFloat();
    Float bmi = a/(b*b);
    
    if (bmi<16){
        System.out.println("Your BMI is "+ bmi+" You are underweight");
    }
    else if(bmi>=18.5 && bmi<=25){
        System.out.println("Your BMI is "+ bmi+" Your BMI is normal");
    }
    else{
        System.out.println("Your BMI is "+ bmi +" You are overweight!!!!");
    }
    }
}
