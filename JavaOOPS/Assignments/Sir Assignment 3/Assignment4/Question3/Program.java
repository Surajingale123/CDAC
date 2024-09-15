package org.Program;

import org.BMITracker.Util.BMITrackerUtil;

public class Program {

	public static void main(String[] args) {
		int choice;
		BMITrackerUtil o1= new BMITrackerUtil();
       while((choice= BMITrackerUtil.menulist())!=0) {
    	   switch(choice) {
    	   case 1:
    		   o1.acceptRecord();
    		   break;
    	   case 2:
    		  o1.Classify();
    		  break;
    	   
    	   
    	   
    	   }
       }
	}

}
