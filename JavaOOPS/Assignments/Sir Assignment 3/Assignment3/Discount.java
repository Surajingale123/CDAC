package org.Discount;

import java.util.Scanner;

class DiscountCalculator {
    private int originalprice;
    private float discountrate;
    private float discountAmount;
    private float finalPrice;

    void acceptRecord() {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the original price: ");
        originalprice = sc.nextInt();  // Correctly assigns to class-level variable
        System.out.println("Enter the discount rate: ");
        discountrate = sc.nextFloat();  // Correctly assigns to class-level variable
    }

    public void calculateDiscount() {
        discountAmount = originalprice * (discountrate / 100);
        finalPrice = originalprice - discountAmount;
    }

    void printRecord() {
        System.out.println("Discount amount is " + discountAmount);
        System.out.println("Final price is " + finalPrice);
    }
}

public class Discount {
    public static void main(String[] args) {
        DiscountCalculator u1 = new DiscountCalculator();
        u1.acceptRecord();
        u1.calculateDiscount();
        u1.printRecord();
    }
}
