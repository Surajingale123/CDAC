/*
First Non-Repeated Character
Problem: Write a Java program to find the first non-repeated character in a string.

Test Cases:

Input: "stress"
Output: 't'
Input: "aabbcc"
Output: null

*/
import java.util.Scanner;
class Question8{
	static Character nonRepeat(String str){
		int []count=new int[256];
		for(char ch : str.toCharArray()){
			count[ch++];
			}
			for(char ch:str.toCharArray()){
				if(count[ch]==1){
					return ch;
				}
			}
			return null;
	}
	
	
	
	
	public static void main(String args[]){
		Scanner sc =new Scanner (System.in);
		String ste=sc.nextLine();
		System.out.println(nonRepeat(str));
		
		
		
	}
}

//Time Complexity –  O (n)
//Space Complexity-   O (n)
