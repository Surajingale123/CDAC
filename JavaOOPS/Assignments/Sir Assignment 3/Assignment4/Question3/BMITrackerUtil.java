package org.BMITracker.Util;

import java.util.Scanner;

import org.BMITracker.BMITracker;

public class BMITrackerUtil {

	private BMITracker b1;
	
	
	
	public BMITrackerUtil() {
		BMITracker b1=new BMITracker();
	}
	private float Calculation;
	
	public void acceptRecord() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Weight :-");
	    b1.setWeight(sc.nextFloat());
	     
	     System.out.println("Enter Height :-");
	     b1.setHeight(sc.nextFloat());

	}
	
	public void BMICalculation() {
	Calculation = this.b1.getWeight()/(b1.getHeight()*b1.getHeight());
	}
	
	public void Classify() {
		if (Calculation<18.5) {
			System.out.println("Underweight");
		}
		else if (Calculation>=18.5 || Calculation<24.9) {
			System.out.println("Normal Weight");
		}
		else if (Calculation>25 || Calculation<29.9) {
			System.out.println("Over Weight");	
		}
		else if (Calculation>=30) {
			System.out.println("Obese");
			
		}
	}
	
	
	public static int menulist() {
		Scanner sc= new Scanner (System.in);
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("0.Print Record");
		System.out.println("Enter Choice");
		
		
		return sc.nextInt();
	}
}
