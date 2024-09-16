package bmi1;


import java.util.Scanner;
import bmi.BMITracker;

public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean running = true;
        
        while (running) {
            BMITrackerUtil.menuList();
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    BMITracker bmiTracker = BMITrackerUtil.acceptRecord();
                    BMITrackerUtil.printRecord(bmiTracker);
                    break;
                case 2:
                    System.out.println("Exiting...");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        sc.close();
    }
}
