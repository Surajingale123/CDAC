
//7 .Write a program to calculate the sum of the digits of the number 9876. The output should be 
//30 (9 + 8 + 7 + 6). 



class HelloWorld {
    public static void main(String[] args) {
        int n=1234;
       int sum=0;
             while(n>0){
                 
                int lastdigit =n%10;
              sum=sum+lastdigit;
              n=n/10;
                
             } 
             System.out.print(sum);
                
                
          
            
            

        
        
        
        
    }
}