
//4. Write a program to reverse the digits of the number 1234. The output should be 4321. 

class HelloWorld {
    public static void main(String[] args) {
       
       int num=1234;
       
       int reverse=0;
       while(num>0){
           int lastdigit=num%10;
            
            reverse=reverse*10+lastdigit;
            num=num/10;
       }
       System.out.println(reverse);
        
    }
}