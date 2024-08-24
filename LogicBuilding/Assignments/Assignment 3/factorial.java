

 
//2. Write a program to compute the factorial of the number 10. 



public class Factorial {
    public static void main(String[] args) {
        int number = 5; 
        
        long fact = 1;
        
        for(int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of " + number + " is: " + fact);
    }
}
