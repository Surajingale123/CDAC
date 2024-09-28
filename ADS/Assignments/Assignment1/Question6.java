/*
6.Find Square Root
Problem: Write a Java program to find the square root of a given number (using integer approximation).

Test Cases:

Input: x = 16   
Output: 4
Input: x = 27
Output: 5

*/
import java.util.*;
class Question6{
	
	static void squareroot(int num){
		for(int i=0;i<num-1;i++){
			if (i*i==num){
				return i;
			}
			else{
			}
		}
	} 
		
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		System.out.println(squareroot(num));
		
		
		
	}
}
//Time Complexity –  O (1)
//Space Complexity-   O (1)
