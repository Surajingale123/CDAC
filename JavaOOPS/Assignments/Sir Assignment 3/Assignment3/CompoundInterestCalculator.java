package compound_interest;

import java.util.Scanner;

class Calculation{
	
	int investamount;
	int intrestrate;
	int numberofcompound;
	int years;
	
	void input() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter invest amount" );
		 investamount= sc.nextInt();
		
		System.out.println("Enter intrest Rate" );
	intrestrate= sc.nextInt();
		
		System.out.println("Enter invest number of compound" );
	numberofcompound= sc.nextInt();
		
		System.out.println("Enter invest years" );
		 years= sc.nextInt();
	}
	
	void futurecalculate() {
		int futureValue= (int) (investamount *	Math.pow(((1+ intrestrate)/numberofcompound),(numberofcompound* years)));
		System.out.println("Future value is :- "+futureValue);
	}
	
	
}

public class CompoundInterestCalculator {

	public static void main(String[] args) {
		Calculation c1=new Calculation();
		
		c1.input();
		c1.futurecalculate();

	}

}
