import java.util.Scanner;

public class shape {

	public static void main(String[] args) {

      System.out.println("Enter your shape");
      
      Scanner sc=new Scanner(System.in);
      String shape= sc.nextLine();
      
      switch (shape){
    	  case "rectangle":
    		  System.out.println("Enter length");
    	      int length =sc.nextInt();
    	      
    	      System.out.println("Enter breadth");
    	      int breadth =sc.nextInt();
    	      
    	      int area=length*breadth;
    	      
    	      System.out.println("ara is "+ area);
    	       break;
    	       
    	  case "Square":
    		  System.out.println("Enter Side");
    	      int Side =sc.nextInt();
    	      
    	      int area1=Side*Side;
    	      
    	      System.out.println("ara is "+ area1);
    	      break;
    	      
    	  case "circle":
    		  System.out.println("Enter Radius");
    		  int Radius =sc.nextInt();
    		  double area2 = 3.14 * Radius * Radius;
    		  System.out.println("Area is "+ area2);
      }
    	  
		

	}

}
