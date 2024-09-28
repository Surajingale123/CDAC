/*
5. Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.

Test Cases:

Input: a = 54, b = 24  -->0 20  24
Output: 6   
Input: a = 17, b = 13  
Output: 1

*/


import java.io.*;
import java.util.*;
class Question5{
	
	static int gcd(int a,int b){ //parameter
		
		 if (a == 0)
            return a;
        if (b == 0)             
		                             
            return b;
                                         
        if (a == b)                        
            return b;

        
        if (a > b )                       
            return gcd(a - b, b); 
        return gcd(a, b - a); 
		
		
		
	}
	
	
	public static void main(String args[]){
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a");
         int a=sc.nextInt();
		 System.out.println("Enter b");
		 int b=sc.nextInt();
		 
		 
		System.out.println(gcd(a,b));  //argument
		
		
	}
	
}

//Time Complexity –  O (log min(a , b))
//Space Complexity-   O (log min(a , b))

