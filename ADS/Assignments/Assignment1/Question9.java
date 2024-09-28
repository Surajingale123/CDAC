/*
. Integer Palindrome
Problem: Write a Java program to check if a given integer is a palindrome.

Test Cases:

Input: 121
Output: true              
Input: -121
Output: false

*/

import java.util.*;
class Question9{
	
	static boolean palindrome(int num){
		
		if (num<0){
			return false;
		}
		int orgnum=num; 
		int revnum=0;   
		
		while (num>0){
			int digit=num%10;        
			revnum=revnum * 10 +digit;    
			num=num/10;             
			
		}
		return orgnum==revnum;
		
	}
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
		
		System.out.print(palindrome(num));
		
		
		
		
	}
}

//Time Complexity –  O (logn)
//Space Complexity-   O (1)
