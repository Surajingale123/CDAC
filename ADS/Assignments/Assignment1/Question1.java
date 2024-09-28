/*
1. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong number.

Test Cases:

Input: 15 3
Output: true
Input: 123
Output: false

*/

import java.lang.Scanner;

class Armstrong{
	
	static boolean armstrong(int input){
		
		if (input<0){
			return false;
		}       
		
		else{
		int inputNo= input;
		double sum=0;
            while(input!=0){
				int rem =input%10;
				sum=sum+Math.pow(rem,3);
				input=input/10;
			}		
			return sum== input?true:false;
			
			
		}
		
	}
	
	
	public static void main(){
		
		Scanner sc=new Scanner(System.in);
		
		int input=sc.nextInt();
		
		System.out.println(armstrong(input));
		
		
	}
	
}

//Time Complexity – O(log n)
//Space Complexity- O(1)
