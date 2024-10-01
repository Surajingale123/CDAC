/*
. Reverse a String
Problem: Write a Java program to reverse a given string.

Test Cases:

Input: "hello"
Output: "olleh"
Input: "Java"
Output: "avaJ"
*/

import java.util.*;
 class Question4{
	
	void reverse(String str){
		char[]arr=str.toCharArray();
		String rev="";
		for(int i=str.length()-1;i>=0;i--){
			rev=rev+str.charAt(i);
		}
		System.out.println(rev);
		
	}
	
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner (System.in);
		String str=sc.nextLine();
		Question4 r1=new Question4();
		r1.reverse(str);
		
		
		
	}
}

//Time Complexity – O(n^2)
//Space Complexity – O(n)
