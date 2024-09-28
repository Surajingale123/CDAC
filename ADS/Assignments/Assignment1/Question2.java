/*
2. Prime Number
Problem: Write a Java program to check if a given number is prime.

Test Cases:

Input: 29
Output: true
Input: 15
Output: false

*/

import java.util.*;
 class Question2{
	
	static Boolean prime(int input){
		
		for(int i=2;i<input-1;i++){
			if (input%i==0){     
				return false;
			}
			}
		return true;
	}

	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int input=sc.nextInt();
		
		System.out.println(Question2.prime(input));
		
	}
}


//Time Complexity –  O (√n)
//Space Complexity-  O(1)

