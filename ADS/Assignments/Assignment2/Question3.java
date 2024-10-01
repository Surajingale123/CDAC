/*
. Remove White Spaces from String
Problem: Write a Java program to remove all white spaces from a given string.

Test Cases:

Input: "Hello World"
Output: "HelloWorld"
Input: "  Java   Programming  "
Output: "JavaProgramming"

*/
import java.util.*;
import java.io.*;
class Question3{
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		
		String op = s.replace(" ","");
       
        System.out.println(op);
		
		
		
	}
}
//Time Complexity – O(n)
//Space Complexity – O(n)
