package org.bmi;

import java.util.Scanner;

class BMI{

private int weight;
private int height;
 void input(){
	 
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Weight:- " );
	 weight=sc.nextInt();
	 System.out.println("Enter Height in meter:- " );
	 height=sc.nextInt();
	
}
 void BMIcalculation() {
	 
	 float BMI= weight /(height*height);
	System.out.println("Your bmi is "+ BMI);
	
	if (BMI < 18.5) {
	   System.out.println("Your are Underweight");
	   
	 }
	else if(BMI >=18.5 && BMI<=24.9) {
		System.out.println("Normal Weight");
		
	}
	else if(BMI >= 25 && BMI <29.9) {
		System.out.println("Overweight");
	}
	else if (BMI >=30) {
		System.out.println("obese");
	}
 }
 

 


public class BodyMassIndex {

	public static void main(String[] args) {
		BMI u1=new BMI();
		
		u1.input();
		u1.BMIcalculation();

	}

}
