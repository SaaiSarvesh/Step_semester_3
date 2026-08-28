package week_1.class_problems;

import java.util.Random;
import java.util.Scanner;

public class BmiTeamCalculator {
    public static String getBmiStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi <= 24.9) {
            return "Normal";
        } else if (bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
    public static void printWellnessReport(double[] heights, double[] weights) {
        System.out.println("------------------------------------------------------------------");
        System.out.printf("%-8s | %-10s | %-11s | %-8s | %-12s%n",
                "Person", "Height (m)", "Weight (kg)", "BMI", "Status");
        System.out.println("------------------------------------------------------------------");

        for (int i = 0; i < heights.length; i++) {
            double height = heights[i];
            double weight = weights[i];
            double bmi = weight / (height * height);
            String status = getBmiStatus(bmi);

            System.out.printf("%-8s | %-10.2f | %-11.2f | %-8.2f | %-12s%n",
                    "Person " + (i + 1), height, weight, bmi, status);
        }
        System.out.println("------------------------------------------------------------------");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter team size (or press Enter to default to 10): ");
        String input = scanner.nextLine().trim();

        int teamSize = 10;
        if (!input.isEmpty()) {
            teamSize = Integer.parseInt(input);
        }

        double[] heights = new double[teamSize];
        double[] weights = new double[teamSize];

        Random random = new Random();
        for (int i = 0; i < teamSize; i++) {
            heights[i] = 1.50 + (1.95 - 1.50) * random.nextDouble();
            weights[i] = 45.0 + (110.0 - 45.0) * random.nextDouble();
        }
        System.out.println("\n=== Corporate Wellness Report ===");
        printWellnessReport(heights, weights);
        scanner.close();
    }
}