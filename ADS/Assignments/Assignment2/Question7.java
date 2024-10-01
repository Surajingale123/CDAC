/*
Reverse a Number
Problem: Write a Java program to reverse a given number.

Test Cases:

Input: 12345
Output: 54321
Input: -9876
Output: -6789
*/
import java.util.*;
class Question7{
	
	void reverse(int num){
		int ld;
		int rev=0;
		while(num>0){
		 ld=num%10;
		 rev=(rev*10)+ld;
		 num=num/10;
		 
		 }
         System.out.println( rev);	
		
	}
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		Question7 r1=new Question7();
		r1.reverse(num);
		
	}
}
//Time Complexity –  O (logn)
//Space Complexity-   O (1)
