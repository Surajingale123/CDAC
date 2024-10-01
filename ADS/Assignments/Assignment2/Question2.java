/*
2. Remove Array Duplicates
Problem: Write a Java program to remove duplicates from a sorted array and return the new length of the array.

Test Cases:

Input: arr = [1, 1, 2]
Output: 2
Input: arr = [0, 0, 1, 1, 2, 2, 3, 3]
Output: 4

*/
import java.util.*;
public class Question2{
	
    int removeDuplicates(int[] arr) {
       
	   int count=0;
	   for(int i=0;i<arr.length;i++){
		   for(int j=0;j<arr.length;j++){
			   if (arr[i]==arr[j]){
				   count++;
			   }
		   }
		   return count;
	   }
	   return -1;
    }
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		int arr[] =new int[size];
		
		System.out.println("Enter the element of Array");
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		
		Question2 d1=new Question2();
		//int new length=d1.removeDuplicates(arr);
		
		System.out.println(d1.removeDuplicates(arr));
	}
}

//Time complexity:-o(n^2)
//space complexity:-o(n)