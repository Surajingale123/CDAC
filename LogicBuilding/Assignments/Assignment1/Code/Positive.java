//Question 1
/*Check Positive Number: 
 Task: Create a flowchart to check whether a number is positive. 
 Next Step: Write a Java program that checks if a predefined number is positive using an 
if-else statement and prints the appropriate message. */


class Positive{
      
    public static void main(String args[]){
     
       int number = 10; 

        
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number <0){
            System.out.println("The number is Negative.");
        }
		else{
			System.out.println("Number is zero");
		}


}

}