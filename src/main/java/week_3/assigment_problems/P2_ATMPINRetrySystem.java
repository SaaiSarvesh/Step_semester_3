package week_3.assigment_problems;

import java.util.Scanner;

public class P2_ATMPINRetrySystem {

    public static void atmPinRetry(String correctPin, String[] attempts) {
        int attemptCounter = 0;
        boolean isSuccess = false;

        while (attemptCounter < attempts.length && attemptCounter < 3 && !isSuccess) {
            if (attempts[attemptCounter].equals(correctPin)) {
                isSuccess = true;
                System.out.println("PIN accepted");
                break;
            }
            attemptCounter++;
        }

        if (!isSuccess) {
            System.out.println("Card blocked — too many incorrect attempts");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Set correct PIN: ");
        String correctPin = scanner.next();

        System.out.print("Enter number of attempts (max 3): ");
        int count = scanner.nextInt();
        
        // Cap the input array size to at most 3
        if (count > 3) {
            count = 3;
        }

        String[] attempts = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter attempt " + (i + 1) + ": ");
            attempts[i] = scanner.next();
        }

        atmPinRetry(correctPin, attempts);

        scanner.close();
    }
}