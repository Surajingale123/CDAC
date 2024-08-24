

// 9. Write a program to find and print the largest digit in the number 4825. 


class HelloWorld {
    public static void main(String[] args) {
       
       int num=4825
       
           
   
          int largest = 0;

        
        while (num > 0) {
            int digit = num % 10; 
            if (digit > largest) {
                largest = digit; 
            }
            num /= 10; 
            

        }
        System.out.print(largest);
        
        
        
    }
}