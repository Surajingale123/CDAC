/*
10. Array Left Rotation
Problem: Write a Java program to rotate an array to the left by d positions.

Test Cases:

Input: arr = [1, 2, 3, 4, 5], d = 2
Output: [3, 4, 5, 1, 2]
Input: arr = [10, 20, 30, 40], d = 1
Output: [20, 30, 40, 10]
*/
import java.util.*;
class Question10{
	
	static void rotateLeft(int[] arr,int d){
		int n=arr.length;
		if(d>=n){
			d=d%n;
		}
		reverse(arr,0,d-1);
		reverse(arr,d,n-1);
		reverse(arr,0,n-1);
	}
	
static void reverse(int []arr,int start,int end){
	while(start<end){
		int temp=arr[start];
		arr[start]=arr[end];
		arr[end]=temp;
		start++;
		end--;
	}
}
	
	
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int d=sc.nextInt();
		int n=sc.nextInt();
		int []arr=new int[n];
		System.out.println("Enter the Elements: ");
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		rotateLeft(arr,d);
		System.out.println(Arrays.toString(arr));
	}
}

//Time Complexity – O(n)
//Space Complexity – O(1)

