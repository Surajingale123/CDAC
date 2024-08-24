
/*
Question 7

Print Area of a Rectangle: 
 Task: Create a flowchart to calculate and print the area of a rectangle. 
 Next Step: Write a Java program that calculates the area of a rectangle using the formula 
area = length * width. Use predefined values for length and width. 

*/

public class LargestNumber {


    public static void main(String[] args) {

        int num1 = 25; 
        int num2 = 42; 
        int num3 = 37; 

        int largest;


        if (num1 >= num2 && num1 >= num3) {
            largest = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            largest = num2;
        } else {
            largest = num3;
        }


        System.out.println("The largest number is: " + largest);
    }
}
