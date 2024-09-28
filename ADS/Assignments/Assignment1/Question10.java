/*
. Leap Year
Problem: Write a Java program to check if a given year is a leap year.

Test Cases:

Input: 2020
Output: true
Input: 1900
Output: false

*/
import java.util.*;
class Question10{
	
	
	static boolean leap(int num){
		
		if (num%4==0 && num %100!=0 || num%400==0){
			
			return true;
			
		}
		else {
			return false;
		}
		
		
	}
	public static void main(String args[]){
		
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println(leap(num));
		
		
		
	}
}

//Time Complexity –  O (1)
//Space Complexity-   O (1)
