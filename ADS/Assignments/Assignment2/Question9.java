/*
. String Palindrome
Problem: Write a Java program to check if a given string is a palindrome.

Test Cases:

Input: "madam"
Output: true
Input: "hello"
Output: false
Here’s a continuation of the list of assignment questions starting from question 21, with two test cases for each:
*/

import java.util.*;
class Question9{
	
	boolean Palindrome(String str){
		char[]arr=str.toCharArray();
		
		for(int i=0;i<str.length()/2;i++){
			if(arr[i] != arr[str.length() - 1 - i]){
				//str.charAt(i)==str.charAt(str.length()-1-i)
				return false;
			}
			
		}
		
		return true;
		
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		Question9 st1=new Question9();
		
		System.out.println(st1.Palindrome(str));
		
	}
}
//Time Complexity – O(n)
//Space Complexity – O(n)
