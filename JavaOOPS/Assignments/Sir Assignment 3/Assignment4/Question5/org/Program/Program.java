package org.Program;

import java.util.Scanner;

import org.tollBoth.TollBoothRevenueManager;
import org.tollboothUtil.TollBoothRevenueManagerUtil;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        TollBoothRevenueManager manager = new TollBoothRevenueManager(50.0, 100.0, 30.0);

        boolean running = true;
        while (running) {
            TollBoothRevenueManagerUtil.menuList();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the toll rate for cars (₹): ");
                    manager.setCarRate(scanner.nextDouble());

                    System.out.print("Enter the toll rate for trucks (₹): ");
                    manager.setTruckRate(scanner.nextDouble());

                    System.out.print("Enter the toll rate for motorcycles (₹): ");
                    manager.setMotorcycleRate(scanner.nextDouble());
                    break;
                case 2:
                    TollBoothRevenueManagerUtil.acceptRecord(manager);
                    break;
                case 3:
                    TollBoothRevenueManagerUtil.printRecord(manager);
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}
