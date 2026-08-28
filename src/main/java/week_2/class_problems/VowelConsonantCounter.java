package week_2.class_problems;

import java.util.Scanner;

public class VowelConsonantCounter {

    public static void countVowelsAndConsonants(String text) {
        if (text == null) {
            System.out.println("Vowels: 0 | Consonants: 0");
            return;
        }

        int vowels = 0;
        int consonants = 0;
        String lowerText = text.toLowerCase();

        for (int i = 0; i < lowerText.length(); i++) {
            char ch = lowerText.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.printf("Vowels: %d | Consonants: %d%n", vowels, consonants);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String text = scanner.nextLine();

        countVowelsAndConsonants(text);

        scanner.close();
    }
}