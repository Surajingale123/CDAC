import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your Height");
		int height = sc.nextInt();
		System.out.println("enter your Weight");
		int weight =sc.nextInt();
		
		
		int BMI = (weight / (height * height));
		
		
		System.out.println(BMI);
		
		if ( BMI<=18.5) {
			System.out.println("Underweight");
		}
		else if (BMI >18.5 && BMI <=24.9) {
			System.out.println("Healthy Weight");
		}
		else if (BMI >24.9 && BMI <=29.9) {
			System.out.println("overweight Weight");
		}
		else {
			System.out.println("ovbesity");
		}
		

	}

}
