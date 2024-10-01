/*
Reverse Array in Place
Problem: Write a Java program to reverse an array in place.

Test Cases:

Input: arr = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Input: arr = [7, 8, 9]
Output: [9, 8, 7]

*/
import java.util.*;
class Question5{
	
	void reverse(int arr[],int size){
		
		for(int i=size-1;i>=0;i--){
			System.out.print(arr[i]);
		}
	}
	
	
	
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		
		System.out.println("Enter the element of array");
		int arr[]=new int[size];
		for(int i=0;i<size-1;i++){
			arr[i]=sc.nextInt();
		}
		
		Question5 a1=new Question5();
		a1.reverse(arr,size);
	}
}

//Time Complexity – O(n)
//Space Complexity – O(n)
