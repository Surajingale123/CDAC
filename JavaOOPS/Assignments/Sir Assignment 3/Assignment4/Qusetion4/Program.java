package program;

import org.dicountUtil.DiscountUtil;

public class Program {
	public static void main(String[] args) {
		int choice;
		DiscountUtil o1=new DiscountUtil();
		 while((choice= DiscountUtil.Menulist())!=0) {
	  	   switch(choice) {
	  	   case 1:
	  		   o1.acceptRecoed();
	  		   break;
	  	   case 2:
	  		  o1.Calculation();
	  		  break;
	  	   
	  	   
	  	   
	  	   }
	     }
	}
       
	
}
