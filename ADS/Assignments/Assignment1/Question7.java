/*
Find Repeated Characters in a String
Problem: Write a Java program to find all repeated characters in a string.

Test Cases:

Input: "programming"
Output: ['r', 'g', 'm']
Input: "hello"
Output: ['l']

*/

import java.util.*;
class Question7{
	
	static void repeatedChar(String str){
		
		for(int i=0;i<str.length();i++){
			for(int j=0;j<str.length();j++){
			if (str.charAt(i)==str.charAt(j)){
				
				System.out.print(str.charAt(i));
			}
				
			}
		}
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		repeatedChar(str);
		
	}
	
}

//Time Complexity –  O (n)
//Space Complexity-   O (n)
