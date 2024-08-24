/*

Question 3:-
Check Odd or Even Number: 

 Task: Create a flowchart to determine whether a number is odd or even. 
 Next Step: Write a Java program that checks if a predefined number is odd or even. Use 
an if-else statement and the modulus operator (%) to determine whether the number is 
divisible by 2 or not. 
*/



class Oddeven{

    public static void main(String args[]){

     int number = 10; 

        
        if (number %2==0) {
            System.out.println("The number is even.");
        } else {
            System.out.println("The number is odd.");
        }


   }

}