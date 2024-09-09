package tollbooth;

import java.util.Scanner;

class TollBoothRevenueManager{
	 private int carrate;
	 private int truckrate;
	 private int motorcyclerate;
	 
	 private int carcount;
	 private int truckcount;
	 private int motorcyclecount;
	 
	 private int totalprice;
	 private int totalnoofvichele;
	 
 void setTollRates() {
	 Scanner sc= new Scanner (System.in);
	 System.out.println("enter car price ");
	 carrate= sc.nextInt();
	 
	 System.out.println("enter truck price ");
	 truckrate= sc.nextInt();
	 
	 System.out.println("enter motorcycle price ");
	 motorcyclerate = sc.nextInt();
	 
	 
 }
 
 void acceptRecord() {
	 
	 Scanner sc= new Scanner (System.in);
	 System.out.println("enter number of cars ");
	 carcount= sc.nextInt();
	 
	 System.out.println("enter number of trucks ");
	 truckcount= sc.nextInt();
	 
	 System.out.println("enter number of motorcycle");
	 motorcyclecount = sc.nextInt();
	 
	 
 }
 
 void calculateRevenue () {
	 
	 totalprice= (carrate*carcount) +(truckrate*truckcount)+(motorcyclerate*motorcyclecount);
	 totalnoofvichele= totalnoofvichele  + truckcount + motorcyclecount;
	 
	 
 }
 
 void printRecord() {
	 
	 System.out.println("total price is "+totalprice);
	 System.out.println("total no of vichle "+totalnoofvichele);
 }
 
	 
}

public class Tollbooth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TollBoothRevenueManager u1=new TollBoothRevenueManager();
		u1.setTollRates();
		u1.acceptRecord();
		u1.calculateRevenue ();	
		u1.printRecord()
;	}

}
