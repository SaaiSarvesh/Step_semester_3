package week_1.class_problems;

import java.util.Scanner;

public class FirstNonRepeatingChar {

    public static char findFirstNonRepeatingChar(String text) {
        int[] frequency = new int[256]; 
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (frequency[ch] == 1) {
                return ch;
            }
        }
        return '\0';
    }
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter text for Unique Letter Hunt: ");
        String text = scanner.nextLine();
        char result = findFirstNonRepeatingChar(text);
        if (result != '\0') {
            System.out.printf("First Non-Repeating Character: '%c'%n", result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }
        scanner.close();
    }
}