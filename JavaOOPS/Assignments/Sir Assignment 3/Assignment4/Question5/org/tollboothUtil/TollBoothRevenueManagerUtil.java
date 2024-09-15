package org.tollboothUtil;

import java.util.Scanner;

import org.tollBoth.TollBoothRevenueManager;

public class TollBoothRevenueManagerUtil {

    public static void acceptRecord(TollBoothRevenueManager manager) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of cars: ");
        manager.setCarCount(scanner.nextInt());

        System.out.print("Enter the number of trucks: ");
        manager.setTruckCount(scanner.nextInt());

        System.out.print("Enter the number of motorcycles: ");
        manager.setMotorcycleCount(scanner.nextInt());
    }

    public static void printRecord(TollBoothRevenueManager manager) {
        System.out.println(manager.toString());
    }

    public static void menuList() {
        System.out.println("Toll Booth Revenue Management System");
        System.out.println("1. Set Toll Rates");
        System.out.println("2. Enter Vehicle Counts");
        System.out.println("3. Print Revenue Record");
        System.out.println("4. Exit");
        System.out.print("Please choose an option: ");
    }
}
