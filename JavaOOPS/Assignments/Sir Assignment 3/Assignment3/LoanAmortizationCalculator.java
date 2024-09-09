package org.Loan;

import java.util.Scanner;

class Loanamortization {
	
	 int principal;
	 float rate;
	 int loanterm;
	void iLoanamortization(){
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter principlr amount:- ");
		this.principal = sc.nextInt();
		
		System.out.print("Enter anual intrest rate:- ");
		 this.rate  = sc.nextFloat();
		
		System.out.print("Enter Loan Term(in years):- ");
		 this.loanterm = sc.nextInt();
	
	}
	
	
	void MonthlyPaymentCalculation(){
		
	float monthlyintrestrate = rate /12/100;
	int noOfMonth= loanterm *12;
	
	float monthlypayment = (float) (principal *(monthlyintrestrate* Math.pow((monthlyintrestrate+1), noOfMonth)/Math.pow((1+monthlyintrestrate),noOfMonth)-1));
	
	System.out.println("monthly payment:-" + monthlypayment);
	
	
}	
}


public class LoanAmortizationCalculator {

	public static void main(String[] args) {
		Loanamortization u1= new Loanamortization();
		
		u1.iLoanamortization();
		u1.MonthlyPaymentCalculation();
		
		

	}

}
