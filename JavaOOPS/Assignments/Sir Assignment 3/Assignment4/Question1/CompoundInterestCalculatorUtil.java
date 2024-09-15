package org.CompoundInterestCalculatorUtil;

import java.util.Scanner;

import org.CompoundInterestCalculator.CompoundInterestCalculator;

 
public class CompoundInterestCalculatorUtil {
	private CompoundInterestCalculator intrest;
	     public CompoundInterestCalculatorUtil() {
		this.intrest =new CompoundInterestCalculator();
	}
	     private double futureValue;
	     private double totalInterest;
	     
	     
	public void acceptRecord() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter Principal:- ");
		this.intrest.setPrincipal(sc.nextFloat());
		
		System.out.println("Enter Annual intrest :-");
		this.intrest.setAnnualIntrestRate(sc.nextFloat());
		
		System.out.println("Enter Number of compound:- ");
		this.intrest.setNumberOfCompounds(sc.nextFloat());
		
		System.out.println("Enter Years:- ");
		this.intrest.setYears(sc.nextFloat());
	}
	
	
	
	public void futureValueCalculation() {
		 futureValue= this.intrest.getPrincipal() * Math.pow((1 + this.intrest.getAnnualIntrestRate() /this.intrest.getNumberOfCompounds()),
				(this.intrest.getNumberOfCompounds() * this.intrest.getYears()));
	}
	
       public void totalInteret() {
		 totalInterest = futureValue - this.intrest.getPrincipal();
	}
       
       public void showRecord() {
    	   
    	   System.out.println("Futurevalue is :-"+this.futureValue);
    	   System.out.println("TotalIntrest is  :-"+this.totalInterest);
       }
       
	
}
