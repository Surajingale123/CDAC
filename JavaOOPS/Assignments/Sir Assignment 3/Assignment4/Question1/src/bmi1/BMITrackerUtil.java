package bmi1;



import java.util.Scanner;
import bmi.BMITracker;

public class BMITrackerUtil {

    // Accept user input for weight and height
    public static BMITracker acceptRecord() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight (in kilograms): ");
        float weight = sc.nextFloat();
        System.out.println("Enter height (in meters): ");
        float height = sc.nextFloat();
        return new BMITracker(weight, height);
    }

    // Print the BMI record
    public static void printRecord(BMITracker bmiTracker) {
        System.out.println(bmiTracker.toString());
    }

    // Display menu options
    public static void menuList() {
        System.out.println("BMI Tracker Menu:");
        System.out.println("1. Enter new record");
        System.out.println("2. Exit");
    }
}

