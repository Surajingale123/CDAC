/*
Factorial
Problem: Write a Java program to compute the factorial of a given number.

Test Cases:

Input: 5 //5*4*3*2*1
put: 120  //7*6*5*4*3*2*1
Input: 0
Output: 1

*/
import java.util.*;
class Question3{
	
	static int fact(int input){
		
		if (input <=1){
			return 1;
		}
		else{
			return input*fact(input-1);
			
		}
	}
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		
		int input=sc.nextInt();
		
		System.out.println(fact(input));
		
		
	}
}

//Time Complexity –  O (n)
//Space Complexity-   O(n)
//