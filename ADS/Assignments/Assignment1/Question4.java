/*
4. Fibonacci Series
Problem: Write a Java program to print the first n numbers in the Fibonacci series.

Test Cases:

Input: n = 5
Output: [0, 1, 1, 2, 3]
Input: n = 8
Output: [0, 1, 1, 2, 3, 5, 8, 13]

Time Complexity:- 2^n.-->exponential growth in time.
*/

import java.util.*;
class Question4{
	static int Fibonacci (int input){
		   if(input<=1){
			   return input;
		   }
		   return Fibonacci(input-1)+Fibonacci(input-2);
	}
	
	
	public static void main(String args[]){
		
	Scanner sc =new Scanner (System.in);
	
      int input =sc.nextInt();
	         
	  for(int i=0;i<=input;i++){
		  
		  System.out.print(Fibonacci(i)+" ");
	  }
	
	
	}
}

//
//Time Complexity –  O (2^n)
//Space Complexity-    O(n)

//