/*
6. Reverse Words in a String
Problem: Write a Java program to reverse the words in a given sentence.

Test Cases:

Input: "Hello World"
Output: "World Hello"
Input: "Java Programming"
Output: "Programming Java"
*/
import java.util.*;
class Question6{
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String reversed = "";
		String[] words = str.split(" ");
		for(int i = words.length -1 ; i>= 0; i--) {
			reversed = reversed + words[i];
			if(i != 0) {
				reversed= reversed + " ";
			}
		}
		
		System.out.println(reversed);
	}

}

//Time Complexity – O(n^2)
//Space Complexity – O(n)
