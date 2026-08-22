package week_3.assigment_problems;

import java.util.Scanner;

public class P1_NumberPyramidPatternPrinter {

    public static void printNumberPyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows (N): ");
        int n = scanner.nextInt();

        printNumberPyramid(n);

        scanner.close();
    }
}