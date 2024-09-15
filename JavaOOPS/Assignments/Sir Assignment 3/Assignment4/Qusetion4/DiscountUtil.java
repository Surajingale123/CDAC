package org.dicountUtil;

import java.util.Scanner;

import org.dicount.Discount;

public class DiscountUtil {

	private Discount d1;
	public DiscountUtil() {
		this.d1=new Discount();
	}
      private float discountAmount ;
      private float finalPrice ;
      
      
	public void acceptRecoed() {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the Original Price :-");
		d1.setOriginalPrice(sc.nextInt());
		
		System.out.println("Enter thr Discounted price:- ");
		d1.setDiscountRate(sc.nextFloat());
		
	}
	
	public void Calculation() {
		discountAmount = d1.getOriginalPrice()*(d1.getDiscountRate()/100);
		finalPrice=d1.getOriginalPrice()-discountAmount;
	}
	
	public static int Menulist() {
		Scanner sc= new Scanner (System.in);
		System.out.println("0.Exit");
		System.out.println("1.Accept Record");
		System.out.println("0.Print Record");
		System.out.println("Enter Choice");
		return sc.nextInt();
	}
	
	
}
