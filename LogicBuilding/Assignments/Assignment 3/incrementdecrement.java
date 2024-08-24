

//11.Write a Java program to demonstrate the use of both pre-increment and post-decrement 
operators in a single expression 


class HelloWorld {
    public static void main(String[] args) {
       
       int num=8;
       
       int expression= num++ + ++num - --num+ num--;
       //++num is preincrement
       //num-- is postincrement
       //--num is pre decrement
       //num-- id post decrement
       System.out.println(expression);
       
        
    }
}