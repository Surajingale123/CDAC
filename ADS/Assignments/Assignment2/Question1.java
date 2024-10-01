/*
1. Printing Patterns
Problem: Write a Java program to print patterns such as a right triangle of stars.

Test Cases:

Input: n = 3
Output:
*
**
***
Input: n = 5
Output:
*
**
***
****
*****

*/
import java.util.*;
public class Question1{
	
	void printPattern(int num){
		
	for(int i=0;i<num;i++){
		for (int j=0;j<=i;j++){
			System.out.print("*");
		}
		System.out.println();
	}
		
		
		
		
	}
	
	public static void main(String args[]){
		
	Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
     	Question1 p1=new Question1();
		p1.printPattern(num);
		
	}
}

//Time Complexity – O(n^2)
//Space Complexity – O(1)