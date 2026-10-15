package week_10.class_problems;

import java.util.Scanner;

public class DigitSumAndReversal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        int sum = 0;
        int reverse = 0;
        int temp = n;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        
        System.out.println("Sum of digits: " + sum);
        System.out.println("Reverse: " + reverse);
        scanner.close();
    }
}